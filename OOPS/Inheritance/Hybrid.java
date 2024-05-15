public class Hybrid {
    public static void main(String[] args) 
    {
        Human person = new Human();
        person.eat();
        tune t1 = new tune();
        t1.eat();
        peacock p1 = new peacock();
        p1.eat();
    }
}
//base or parent or super class
class Animals
{
    void eat()
    {
        System.out.println("Eat");
    }
    void breathe()
    {
        System.out.println("Breathe");
    }
}
//derived or child or sub class 
class Mammals extends Animals
{
    void walk()
    {
        System.out.println("Mammal walk");
    }
}
//derived or child or sub class 
class Fishs extends Animals
{
    void swim()
   {
        System.out.println("swim");
   }
}
class birds extends Animals
{
    void fly()
    {
        System.out.println("fly");
    }
} 
class Dogs extends Mammals
{
    void bark()
    {
        System.out.println("Barks");
    }
}
class Cat extends Mammals
{
    void meow()
    {
        System.out.println("meow");
    }
}
class Human extends Mammals
{
    void speak()
    {
        System.out.println("speak");
    }
}
class peacock extends birds
{
    void dance()
    {
        System.out.println("dance");
    }
}
class tune extends Fishs
{
    void colour()
    {
        System.out.println("colour");
    }
}
class sharks extends Fishs
{
    void type()
    {
        System.out.println("great white");
    }
}
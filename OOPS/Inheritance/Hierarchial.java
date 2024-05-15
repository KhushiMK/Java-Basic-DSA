/*Hierarchial Inheritance */
public class Hierarchial
{
    public static void main(String[] args) 
    {
        Fish shark = new Fish();
        shark.eat();
        Mammal dog = new Mammal();
        dog.eat();  
    }
}
//base or parent or super class
class Animal
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
class Mammal extends Animal
{
    void walk()
    {
        System.out.println("Mammal walk");
    }
}
//derived or child or sub class 
class Fish extends Animal
{
    void swim()
   {
        System.out.println("swim");
   }
}
class bird
{
    void fly()
    {
        System.out.println("fly");
    }
} 

/*Inheritance is when the properties and method of base class are passed to derived class */
public class Inheritance {
    public static void main(String args[])
    {
        Fish shark = new Fish();
        shark.eat();
    }
}
// This inheritance is also know as single inheritance
//base or parent or super class
class Animal
{
    String colour;
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
class Fish extends Animal
{
    int fins;
    void swim()
   {
        System.out.println("Swim in water");
   }
}
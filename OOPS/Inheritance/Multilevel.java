/* Multilevel Inheritance*/
public class Multilevel
{
    public static void main(String[] args) 
    {
        Dog tommy = new Dog();
        tommy.eat();
        tommy.legs = 4;
        System.out.println(tommy.legs); 
    }
}
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
class Mammal extends Animal
{
    int legs;
}
class Dog extends Mammal
{
    String breeds;
}
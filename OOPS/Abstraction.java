/* Hiding all the unnecessary detail and only showing important detail to the user */
public class Abstraction {
    public static void main(String[] args)
    {
        Horse h = new Horse();
        Chicken c = new Chicken();
        h.walks();
        c.walks();
        h.changecolour();
        System.out.println(h.colour);
        c.changecolour();
        h.eat();
        c.eat();
        System.out.println(c.colour);
    }
}
abstract class Animal
{
    String colour;
    Animal()
    {
        colour = "Brown";
    }
    void eat()
    {
        System.out.println("Animal Eats");
    }
    abstract void walks();
}
class Horse extends Animal
{
    void changecolour()
    {
        colour = "dark brown";
    }
    void walks()
    {
        System.out.println("walk on 4 legs");
    }
}
class Chicken extends Animal
{
    void changecolour()
    {
        colour = "yellow";
    }
    void walks()
    {
        System.out.println("walk on 2 legs");
    }
}
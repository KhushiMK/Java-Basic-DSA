/*Basic of Object Oriented Programming(OOPS)*/
public class Oopbasic
{
    public static void main(String args[])
    {
        Pen p1 = new Pen();
        p1.setcolour("blue");
        p1.getcolour();
        p1.settip(5);
        p1.gettip();
        p1.display();
    }
}
class Pen 
{
    private String colour ;
    private int tip;
    String getcolour()
    {
        return this.colour;
    }
    int gettip()
    {
        return this.tip;
    }
    void setcolour(String newcolour)
    {
        colour= newcolour;
    }
    void settip(int newtip)
    {
        tip=newtip;
    }
    void display()
    {
        System.out.println(colour);
        System.out.println(tip);
    }
}
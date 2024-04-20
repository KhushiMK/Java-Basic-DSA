/*Check if a number is a power of 2 or not*/
public class power {
    public static boolean Power(int n)
    {
        return (n&(n-1)) ==0;
    }
    public static void main(String args[])
    {
        System.out.println(Power(81));
    }
}

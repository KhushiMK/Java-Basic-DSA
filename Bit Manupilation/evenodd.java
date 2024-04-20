/* To Check a number is even or odd with help of bit wise manipulation */
import java.util.*;
public class evenodd {
    public static void check(int n)
    {
        int bitmask =1;
        if((n&bitmask) == 0)
        {
            System.out.println("Even Number:"+n);
        }
        else
        {
            System.out.println("Odd Number:"+n);
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        check(n);
        sc.close();
    }
}

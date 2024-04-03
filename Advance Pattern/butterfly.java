/* butterfly pattern
 *      *
 **    **
 ***  ***
 ********
 ********
 ***  ***
 **    **
 *      *
 */
import java.util.*;
public class butterfly {
    public static void Butterfly(int n)
    {   //first half
        for(int i=1;i<=n;i++)
        {   //star
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            //spaces
            for(int j=1;j<=(2)*(n-i);j++)
            {
                System.out.print(" ");
            }
            //star
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        // second half
        for(int i=n;i>=1;i--)
        {   //star
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            //spaces
            for(int j=1;j<=(2)*(n-i);j++)
            {
                System.out.print(" ");
            }
            //star
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        Butterfly(n);
        s.close();
    }
}

/* diamomd pattern
    *
   ***
  *****
 *******
*********
*********
 *******
  *****
   ***
    *
*/
import java.util.*;
public class diamond
{
    public static void Diamond(int n)
    {//1st half
        for(int i=1;i<=n;i++)
        {
            //space n-i
            for(int j=1;j<=(n-i);j++)
            {
                System.out.print(" ");
            }
            //star 
            for(int j=1;j<=(2)*(i)-(1);j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        //2nd half
        for(int i=n;i>=1;i--)
        {
            //space n-i
            for(int j=1;j<=(n-i);j++)
            {
                System.out.print(" ");
            }
            //star 
            for(int j=1;j<=(2)*(i)-(1);j++)
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
        Diamond(n);
        s.close();
    }
}
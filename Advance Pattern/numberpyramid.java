/* Number pyramid
    1
   2 2 
  3 3 3
 4 4 4 4 
5 5 5 5 5
 */
import java.util.*;
public class numberpyramid {
    public static void number(int n)
    {
        int val=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print(val+" ");
            }
            val++;
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        number(n);
        s.close();
    }
}

/* Hollow rhombus
    *****
   *   *
  *   *
 *   *
*****
*/
import java.util.*;
public class hollow_rhombus {
    public static void rhombus(int n , int row , int col)
    {
        for(int i=1;i<=row;i++)
        {   //spaces
            for(int j=1;j<=(n-i);j++)
            {
                System.out.print(" ");
            }
            //star
            for(int j=1;j<=col;j++)
            {
                if(i==1 || i==row || j==1 || j==col)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String arg[])
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int row = s.nextInt();
        int col = s.nextInt();
        rhombus(n,row,col);
        s.close();
    }
}

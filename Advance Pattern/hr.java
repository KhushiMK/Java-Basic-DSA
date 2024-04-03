/* hollow rectangle pattern 
 ****
 *  *
 *  *
 ****
 */
import java.util.*;
public class hr
{
    public static void hollow_rec(int row , int col)
    {
        for(int i=1;i<=row;i++)
        {
            for(int j=1;j<=col;j++)
            {
                if(i == 1 || i == row || j == 1 || j == col)
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
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int row = s.nextInt();
        int col = s.nextInt();
        hollow_rec(row, col);
        s.close();
    }
}
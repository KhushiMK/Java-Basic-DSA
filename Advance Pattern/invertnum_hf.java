/* Inverted half pyramid pattern
 12345
 1234
 123
 12
 1
*/
import java.util.*;
public class invertnum_hf
{
    public static void invert(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i+1;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        invert(n);
        s.close(); 
    }
}
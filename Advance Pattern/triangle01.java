/*Triangle of 0's and 1's
1
01
101
0101
10101
 */
import java.util.*;
public class triangle01 {
    public static void tri(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                if((i+j)%2==0)
                {
                    System.out.print("1");
                }
                else
                {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        tri(n);
        s.close();
    }
}

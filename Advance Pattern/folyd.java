/* folyd triangle pattern
 1
 23
 456
 78910
 */
import java.util.*;
public class folyd {
    public static void folydtri(int n)
    {
        int v=1;;
        for(int i=1;i<=n;i++)
        {
            for(int j =1;j<=i;j++)
            {
                System.out.print(v+" ");
                v++;
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        folydtri(n);
        s.close();
    }
}

import java.util.*;
public class Prime
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        boolean flag = true;
        for (int i = 2; i<(n/2);i++)
        {
            if(n%i==0)
            {
                flag = false;
                break;
            }
        }
        if(flag)
        {
            System.out.println("Prime");
        }
        else
        {
            System.out.println("Not Prime");
        }
        s.close();
    }
    
}
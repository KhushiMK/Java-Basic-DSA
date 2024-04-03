/* Inverted & Rotated Half Pyramid
    *
   **
  ***
 **** 
*/
public class inverrota_hf {
    public static void rotated(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
               System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        rotated(10);
    }
}

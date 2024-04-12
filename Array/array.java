/* Creation  , Input , Output , Update of Array 
->Array: List of elements of the same type placed in a contiguous memory location 
*/
import java.util.*;
public class array
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int marks[]= new int[3]; //Creation
        
        for(int i=0;i<marks.length;i++)
        {
            marks[i] = s.nextInt();
        }
        for(int i=0;i<marks.length;i++)
        {
            System.out.println(marks[i]);
        }
        s.close();
    }
}

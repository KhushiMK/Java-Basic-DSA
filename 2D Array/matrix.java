/*Creating , Input , Output and Searching in Matrix(2D Array)*/
import java.util.*;
public class matrix
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int matrix [][]= new int[3][3];
        //input
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                matrix[i][j] = s.nextInt();
            }
        }
        //output
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        s.close();
    }
}

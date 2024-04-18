/*Staircase Search in 2D Array(Matrix)
10,20,30,40
15,25,35,45
27,29,37,48
32,33,39,50
*/
public class staircase {
    public static boolean Search(int matrix[][],int key)
    {
        int row =matrix.length-1;int col=0;
        while(row>=0 && col<=matrix[0].length)
        {
            if(matrix[row][col] == key)
            {
                System.out.println("Key Found at cell:"+"("+row+","+col+")");
                return true;
            }
            else if(key>matrix[row][col])
            {
                col++;
            }
            else 
            {
                row--;
            }
        }
        System.out.println("Key not Found");
        return false;
    }
    public static void main(String args[])
    {
        int matrix[][] = {{10,20,30,40},
                          {15,25,35,45},
                          {27,29,37,48},
                          {32,33,39,50}};
        int key=45;
        Search(matrix, key);
    }
}

/* Large element come to the end of array by swapping with adjacent element */
public class bubble
{
    public static void sort(int arr[])
    {
        for(int turn=0;turn<arr.length-1;turn++)
        {
            
            for(int j=0;j<arr.length-1-turn;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println();
        System.out.println("After Sorting");
        display(arr);
    }
    public static void display(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[])
    {
        int arr[] = {5,4,1,3,2};
        System.out.println("Before Sorting");
        display(arr);
        sort(arr);
    }
}

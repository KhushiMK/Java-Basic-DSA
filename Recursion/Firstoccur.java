/*To check the first occurance of the key*/
public class Firstoccur {
    public static int first(int arr[], int i,int key)
    {
        if(i == arr.length)
        {
            return -1;
        }
        if(arr[i]== key)
        {
            return i;
        }
        return first(arr,i+1,5);
    }
    public static void main(String[] args) {
        int arr[]= {8,3,6,9,5,10,2,5,3};
        System.out.println(first(arr, 0,5));
    }
}

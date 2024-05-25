/*To find last occurance of a key*/
public class Lastoccur {
    public static int last(int arr[], int key ,int i)
    {
        if(i == arr.length)
        {
            return -1;
        }
        int f = last(arr, key, i+1);
        if(f ==-1 && arr[i]== key) 
        {
            return i;
        }
        
        return f;
    }
    public static void main(String[] args) {
        int arr[]= {8,3,6,9,5,10,2,5,3};
        System.out.println(last(arr, 5,0));
    }
}

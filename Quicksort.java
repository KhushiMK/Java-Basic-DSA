/* Quick Sort */
public class Quicksort {
    public static void print(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void quicksort(int arr[] , int si , int ei)
    {
        //base case 
        if(si>=ei)
        {
            return;
        }
        //kaam
        int pidx = partition(arr,si,ei);
        quicksort(arr, si,pidx-1);//left side
        quicksort(arr, pidx+1, ei);//right side
    }
    public static int partition(int arr[],int si ,int ei)
    {
        int pivot = arr[ei];
        int i = si-1;//to make space for the smaller element
        for(int j=si;j<ei;j++)
        {

            if(arr[j]<pivot)
            {
                i++;
                //swap
                int temp= arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        i++;
        int temp= pivot;
        arr[ei]=arr[i];
        arr[i]=temp;
        return i;
    }
    public static void main(String[] args) {
        int arr[]={6,3,9,8,2,5};
        quicksort(arr, 0, arr.length-1);
        print(arr);
    }
}

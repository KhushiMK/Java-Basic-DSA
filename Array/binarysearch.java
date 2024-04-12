/*Binary search in a given array */
public class binarysearch {
    public static int search(int n[],int key)
    {
        int start= 0;
        int end =n.length-1;
        
        while(start<=end)
        {
            int mid =(start + end) /2;
            //camparision
            if(n[mid] == key)//found
            {
                return mid;
            }
            else if(n[mid]<key)//right
            {
                start = mid+1;
            }
            else//left
            {
                end = mid -1;
            }
        }
        return -1;//key not found
    }
    public static void main(String args[])
    {
        int n[]={1,2,3,4,5,6,7,8,9,10,11,12};
        int key = 11;
        System.out.println(search(n, key));
    }
}

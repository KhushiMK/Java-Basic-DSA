/*Reverse an array*/
public class reverse {
    
    public static void rev(int n[])
    {
        int first=0;
        int end = n.length-1;
        while(first< end)
        {
            //swap
            int temp = n[end];
            n[end] = n[first];
            n[first] = temp; 
            first++;
            end--;
        }
        
    }
    public static void main(String args[])
    {
        int n[]={2,4,6,8,10};
        rev(n);
        for(int i=0;i<n.length;i++)
        {
            System.out.print(n[i]+" ");
        }
    }
}

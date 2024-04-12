/*Largest value in given array*/
public class maximum {
    public static int largest(int n[])
    {
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n.length;i++)
        {
            if(max<n[i])
            {
                max=n[i];
            }
        }
        return max;
    }
    public static void main(String args[])
    {
        int  n[] = {1,2,3,43,6,5,7,8};
        System.out.println(largest(n));
    }
}

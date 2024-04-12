/*Kadane's Algorithm of max sum subarray*/
public class maxsumsub
{
    public static void kadane(int n[])
    {
        int mx=Integer.MIN_VALUE;
        int cs=0;
        for(int i=0;i<n.length;i++)
        {
            cs = cs +n[i];
            if(cs<0)
            {
                cs =0;
            }
            mx = Math.max(cs ,mx);
        }
        System.out.println("Max sum :"+mx);
    }
    public static void main(String args[])
    {
        int n[]={-2,-3,4,-1,-2,1,5,-3};
        kadane(n);
    }
}
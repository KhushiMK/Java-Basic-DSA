/*Max subarray sum*/
public class maxsum {
    public static void sum(int n[])
    {
        int currsum = 0;
        int mx = Integer.MIN_VALUE;
        for(int i=0;i<n.length;i++)
        {
            for(int j=i;j<n.length;j++)
            {
                currsum=0;
                for(int k=i;k<=j;k++)
                {
                    currsum +=n[k];
                }
                if(mx<currsum)
                {
                    mx=currsum;
                }
                System.out.println(currsum);
            }

        }
        System.out.println("Max sum :"+mx);
    }
    public static void main(String args[])
    {
        int n[]={2,4,6,8,10};
        sum(n);
    }
}

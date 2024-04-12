public class prefix {
   public static void sum(int n[])
    {
        int currsum = 0;
        int mx = Integer.MIN_VALUE;
        int pre[]= new int[n.length];
        pre[0]=n[0];
        for(int i=1;i<pre.length;i++)
        {
            pre[i]=pre[i-1] + n[i];
        }
        for(int i=0;i<n.length;i++)
        {
            for(int j=i;j<n.length;j++)
            {
                currsum=i==0 ?pre[j] : pre[j]-pre[i-1];
                
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



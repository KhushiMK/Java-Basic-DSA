/*Rain water Trapping */
public class rainwater {
    public static int trap(int h[])
    {
        int n = h.length;
        //left max
        int leftmx[] = new int[n];
        leftmx[0]=h[0];
        for(int i=1;i<n;i++)
        {
            leftmx[i]=Math.max(h[i],leftmx[i-1]);
        }
        //right max
        int rightmx[] = new int[n];
        rightmx[n-1]=h[n-1];
        for(int i=n-2;i>=0;i--)
        {
            rightmx[i]=Math.max(h[i],rightmx[i+1]);
        }
        //loop
        int water=0;
        for(int i=0;i<n;i++)
        {
           int wl = Math.min(leftmx[i],rightmx[i]);//water level
           water +=wl - h[i];//trapped water
        }
        return water;
    }
    public static void main(String args[])
    {
        int h[] = {4,2,0,6,3,2,5};
        System.out.println(trap(h));
    }
}

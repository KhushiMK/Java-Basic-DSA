public class stock {
    public static int Stock(int p[])
    {
        int buy = Integer.MAX_VALUE;
        int profit = 0;
        for(int i=0;i<p.length;i++)
        {
            if(buy< p[i])
            {
                //profit
                int pf = p[i] - buy;//today profit
                profit = Math.max(profit,pf);
            }
            else
            {
                buy = p[i];
            }
        } 
        return profit;
    }
    public static void main(String args[])
    {
        int p[]={7,1,5,3,6,4};
        System.out.println(Stock(p));
    }
}

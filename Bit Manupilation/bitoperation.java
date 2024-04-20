public class bitoperation {
    public static int get(int n, int i)
    {
        int bitmask = 1<<i;
       if((n & bitmask) ==0)
       {
           return 0;
       }
       else
       {
            return 1;
       }
    }
    public static int set(int n , int i)
    {
        int bitmask=1<<i;
        return n|bitmask;
    }
    public static int clear(int n , int i)
    {
        int bitmask=~(1<<i);
        return (n & bitmask);
    }
    public static int update(int n , int i , int newbit)
    {
        n=clear(n, i);
        int bitmask=newbit<<i;
        return n| bitmask;
    }
    public static int clearlast(int n , int i)
    {
        int bitmask =(~(0)<<i);
        return n & bitmask;
    }
    public static long clearrange(long n, int i , int j)
    {
       int a = (~0)<<(j+1);
       int b = (1<<i) - 1 ;
       int bitmask= a|b;
       return n & bitmask;
    }
    public static void main(String args[])
    {
        // System.out.println(get(10,1));
        // System.out.println(set(10,2));
        // System.out.println(clear(10, 1));
        // System.out.println(update(10,2,1));
        // System.out.println(clearlast(15,2));
        System.out.println(clearrange(10,2,4));
    }
}

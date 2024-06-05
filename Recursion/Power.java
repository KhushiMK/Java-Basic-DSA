/*Print x to the power n*/
public class Power {
    public static int power(int x,int n)
    {
        //optimized
        if(n == 0)
        {
            return 1;
        }
        int pow = power(x,n/2);
        int half= pow * pow;
        if(n % 2 != 0)
        {
           half = x * half;
        }

        //return  x* power(x, n-1);
        return half;
    }
    public static void main(String[] args) {
        int x =2;
        int n = 10;
        System.out.println(power(x, n));
    }
}

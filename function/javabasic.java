/*Function modularize the code the make the program more readable*/
import java.util.*;
public class javabasic 
{
    public static void print()//This is method print using function
    {
        System.out.println("Hello world");    
    }
    public static int sum(int a , int b)
    {
        return a + b ;
    }
    public static int multiply(int a , int b)
    {
        int product = a*b;
        return product;
    }
    public static int factorial(int n)
    {
        int fact=1;
        for(int i=1;i<=n;i++)
        {
            fact *=i;
        }
        return fact;
    }
    public static int binomialcof(int n , int r)
    {
        int nfact=factorial(n);
        int rfact = factorial(r);
        int nrfact = factorial(n-r);
        return nfact/( rfact*nrfact);

    }
    public static int sum(int a ,int b ,int c)
    {
        return a + b + c;
    }
    public static float sum(float a , float b)
    {
        return  a + b ;
    }
    public static boolean isprime(int n)
    {
        if(n == 2)
        {
            return true;
        }
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n % i == 0)
            {
                return false;
            }
        }
        return true;
    }
    public static void rangeprime(int n)
    {
        for(int i=2;i<=n;i++)
        {
            if(isprime(i))
            {
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
    public static void bintodeci(int n)
    {
        int num=n;
        int pow=0;
        int deci=0;
        while(n>0)
        {
            int ld= n % 10;
            deci = deci+(ld*(int)Math.pow(2, pow));//In this Math is used to calculate the power of the number
            pow++;
            n /=10;
        }
        System.out.println("Decimal number of "+ num+" = "+deci);
    }
    public static void decitobin(int n)
    {
        int num =n;
        int pow=0;
        int bin=0;
        while(n>0)
        {
            int rem = n%2;
            bin = bin +(rem *(int)Math.pow(10,pow));
            pow++;
            n/=2;
        }
        System.out.println("Binary number of "+ num+" = "+bin);
    }
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        // int a = s.nextInt(); 
        // int b = s.nextInt();
        // int c = s.nextInt();
        int n = s.nextInt();
        // System.out.println(sum(5, 3));
        // System.out.println(sum(3.2f,4.8f));
        decitobin(n);
       s.close();
    }
}

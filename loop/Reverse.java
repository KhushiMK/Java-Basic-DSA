public class Reverse {
    public static void main(String[] args) {
        int n = 110103;
        int reverse = 0;
        while(n>0)
        {
            int lastDigit = n % 10;
            reverse = (reverse*10)+lastDigit;
            n = n/10;
        }
        System.out.println(reverse);
    }
}
/* When you want to have last digit of number then do modulo with it
-> Last digit num % 10
-> Remove last digit num/10
 */
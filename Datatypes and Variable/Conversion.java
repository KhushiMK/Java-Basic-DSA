import java.util.Scanner;

public class Conversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float num = sc.nextInt();
        System.out.println(num);
    }
}
/* Conversion happen when 
-> type is compatible
-> destination type >source type
byte -> short -> int -> float -> long ->double
->Conversion is Expansion conversion or implicit conversion
*/

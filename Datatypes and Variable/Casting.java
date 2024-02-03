import java.util.Scanner;

public class Casting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        int b = (int)a;
        System.out.println(b);
    }
}
/* Type Casting is used to convert larger data type into smaller datatype
->Type Casting narrowing conversion or explicit conversion
*/
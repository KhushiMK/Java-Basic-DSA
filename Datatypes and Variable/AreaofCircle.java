import java.util.Scanner;

public class AreaofCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float area;
        float r = sc.nextFloat();
        area = 3.14f *r *r;
        System.out.println(area);
    }
}

public class TypePromotion {
    public static void main(String[] args) {
        char a = 'a';
        char b = 'b';
        System.out.println((int )b);
        System.out.println((int)a);
        System.out.println(a);//no type promotion
        System.out.println(b-a);
    }
}
/*
->Java automatically promotes each byte, short, or ,char operand to int when evaluating an expression
->If one operand is long, float or double the whole expression is promoted to long, float, double respectively.
 */
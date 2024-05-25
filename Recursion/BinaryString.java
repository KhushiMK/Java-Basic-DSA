/*Print all   binary  String of size N without consecutive ones */
public class BinaryString {
    public static void binary(int n , int ld , String str)
    {
        if(n == 0)
        {
            System.out.println(str);
            return;
        }
        binary(n-1,0, str+"0");
        if(ld == 0)
        {
            binary(n-1,1, str+"1");
        }
    }
    public static void main(String[] args) {
        int n =3;
        binary(n, 0, "");
    }
}

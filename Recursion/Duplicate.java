/*Remove all  the Duplicate from string */
public class Duplicate {
    public static void dupli(String str , int idx , StringBuilder sb , boolean map[])
    {
        if(idx == str.length())
        {
            System.out.println(sb);
            return;
        }
        char cur = str.charAt(idx);
        if(map[cur -'a']== true)
        {
            //dulipcate
            dupli(str, idx+1, sb, map);
        }
        else
        {
            map[cur -'a']= true;
            dupli(str, idx+1, sb.append(cur), map);
        }
    }
    public static void main(String[] args) {
        String str = "appnnacollege";
        dupli(str, 0, new StringBuilder(""), new boolean [26]);
    }
}

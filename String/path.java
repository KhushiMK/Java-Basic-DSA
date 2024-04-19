/*Given a route containing 4 direction(E,W,N,S),find the shorest path to reach the destination*/
public class path {
    public static float shortpath(String str)
    {
        int x=0;
        int y=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i) == 'N')
            {
                y++;
            }
            if(str.charAt(i) == 'S')
            {
                y--;
            }
            if(str.charAt(i) == 'E')
            {
                x++;
            }
            if(str.charAt(i) == 'W')
            {
                y--;
            }
        }
        
        return (float)Math.sqrt(((x-0)*(x-0))+((y-0)*(y-0)));
    }
    public static void main(String args[])
    {
        String str ="WNEENESENNN";
        System.out.println(shortpath(str));
    }
}

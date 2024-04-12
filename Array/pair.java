/*Pairs in an array*/
public class pair {
    public static void Pair(int n[])
    {
        int total=0;
        for(int i=0;i<n.length;i++)
        {
            for(int j=i+1;j<n.length;j++)
            {
                System.out.print("("+n[i]+","+n[j]+")");
                total++;
            }
            System.out.println();
        }
        System.out.println("Total Number of Pair is :"+total);
    }
    public static void main(String args[])
    {
        int n[] = {2,4,6,8,10};
        Pair(n);
    }    
}

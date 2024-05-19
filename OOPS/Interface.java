public class Interface {
    public static void main(String[] args) 
    {
        Queen q = new Queen();
        q.moves();
    }
}
interface Chessplayer
{
    void moves();
}
class Queen implements Chessplayer
{
    public void moves()
    {
        System.out.println("up,down,left,right,diagonal(all 4 direction)");
    }
}
class Rook implements Chessplayer
{
    public void moves()
    {
        System.out.println("up,down,left,right");
    }
}
class King implements Chessplayer
{
    public void moves()
    {
        System.out.println("up,down,left,right,diagonal(by 1 step)");
    }
}
import board.Board;
import game.Game;
import player.Player;
// import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        System.out.println("First project -> Tic tac toe");
        
        Board b =new Board(3,'-');
         b.printBoardConfig();
        // Scanner scn=new Scanner(System.in);
        // System.out.print("Enter the name of the player : ");
        // String name=scn.nextLine();
        // System.out.print("Enter the age of the player : ");
        // int age=scn.nextInt();
        

        Player p1=new Player();
        // p1.setPlayerDetail(name, 'X', age, "9579485035","up", "ravi@gmail.com");
        // p1.getPlayerDetails();SS
        // p1.changeSymbol('0');
        // p1.getPlayerDetails();
        p1.setPlayernameagesymbol("Snehal",17,'X');
        p1.getPlayernameagesymbol();
        Player p2=new Player();
        p2.setPlayernameagesymbol("Krunal",14,'0');
        p2.getPlayernameagesymbol();

        Game g=new Game(new Player[] {p1,p2}, b);
        g.play();
    }
}

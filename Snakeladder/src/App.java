import java.util.HashMap;
// import java.util.Scanner;
import player.Player;
import coordinates.Coordinates;
import dice.Dice;
import game.Game;
import jumper.Jumper;
import board.Board;
public class App {
    public static void main(String[] args) throws Exception {
      
    HashMap<String,Jumper> map=new HashMap<>();
    map.put("6", new Jumper(new Coordinates(9,5) ,new Coordinates(4, 7)));
    map.put("97", new Jumper(new Coordinates(0,1) ,new Coordinates(9, 9)));
    map.put("21", new Jumper(new Coordinates(7,5) ,new Coordinates(2, 7)));
    map.put("64", new Jumper(new Coordinates(5,5) ,new Coordinates(8, 7)));
   
     Player p1=new Player();
     p1.setPlayerDetailsFromUserInput(p1);
     Player p2=new Player();
     p2.setPlayerDetailsFromUserInput(p2);

     System.out.println("Player name : " + p1.getPlayerName());
     System.out.println("Player name : " + p2.getPlayerName());

    //   Dice dic=new Dice();
    //   System.out.println(dic.diceRoll());
    //  Coordinates c=new Coordinates(8, 4);
    //  Coordinates d=new Coordinates(4, 4);

    //  System.out.println(c.printCoordinates());
    //  Jumper j=new Jumper(c, d);
    // System.out.println( j.getJumperName());
    Board b=new Board(10,map);
    b.printBoard();
     
    Game game=new Game(b, new Player[] {p1,p2}, new Dice());
    game.play();
    }
    
}
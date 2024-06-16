import javax.swing.JFrame;

public class Mai{

    public static void main(String[] args) {
 

         JFrame f = new JFrame("Box Collision");

         GamePanels game = new GamePanels();
              f.add(game);
              game.startGame();
         f.setSize(500,500);
         f.setVisible(true);
 

    }
}
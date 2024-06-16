import javax.swing.*;

public class main{

    public static void main(String[] args) {
        
     JFrame f = new JFrame("FPS control Loop");
    // JButton b1 = new JButton("Button 1");
    // JButton b2 = new JButton("Button 2");

     f.setResizable(false);
    //  f.setLocationRelativeTo(null);
     GamePanel game = new GamePanel();
       f.add(game); 
       game.startGame();
    
    // f.add(b1);
    // f.add(b2);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     f.setSize(500,500);
     f.setVisible(true);
    }
}

import java.awt.*;
import javax.swing.*;

public class GamePanel extends  JPanel implements  Runnable {
    Thread thread;
   int x,y;

   Image image;

   Enemy enemy = new Enemy();
    
  


    public GamePanel() {

            super();
            this.setPreferredSize(new Dimension(500,500));
            this.setBackground(Color.black);
    }

    public  void paintComponent(Graphics g){
               
       
           super.paintComponent(g);
           enemy.paintComponent(g);
          
    }

     public void startGame(){
     
        thread = new Thread(this);
        thread.start();
     }

     public void update(){
            enemy.update();

     }

    @Override
    public void run() {

        double drawInterval = 1000000000/60;
        double deltaTime = 0;
        long lastPassedTime = System.nanoTime();
        long currentTime = 0;
        while (thread!=null) { 
            // long time = System.nanoTime();
            // System.out.println("Game Loop" + time);  
            // x = x+1;
            currentTime = System.nanoTime();
            deltaTime += (currentTime - lastPassedTime)/drawInterval;
             lastPassedTime = currentTime;
               
               
               if(deltaTime >=1){
                
                update();
                repaint();
                deltaTime--;
               }



        }
      
    }


    /*  int x, y;

   public void movleft(){
   
    x = x-10;

   }
  
   public  void movright(){

    x = x+10;
   }
*/

}
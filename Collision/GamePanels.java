import java.awt.*;
import javax.swing.*;

public class GamePanels extends  JPanel implements Runnable {
    

Thread thread ;
int x,y;


public  GamePanels(){


    super();
    this.setBackground(Color.black);

}

public  void paintComponent(Graphics g){

  super.paintComponent(g);
  g.setColor(Color.red);
  g.fillRect(x, y, 100, 100);
  g.fillRect(200, 100, 100, 100);
}

public  void startGame(){

    thread = new Thread(this);
    thread.start();
}

public  void update(){
   
}


public void run(){

  double drawInterval = 1000000000/60;
  double deltaTime = 0; 
   
  long lastPassedTime = System.nanoTime();

  long currentTime = 0;

   
  while(thread!=null){

   currentTime = System.nanoTime();
deltaTime +=(currentTime - lastPassedTime)/drawInterval;
lastPassedTime = currentTime;

  if(deltaTime >=1){

    x +=1;
    repaint();
    deltaTime--;  
} 

  }


}
    
}

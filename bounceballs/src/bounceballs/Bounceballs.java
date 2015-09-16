package bounceballs;
import java.awt.*;
import java.util.Formatter;
import javax.swing.*;

public class Bounceballs extends JFrame{
    JPanel panel;
    private Bounceballs b[]=new Bounceballs[2];
   public static void main(String[] args) {
        // TODO code application logic here
            
        Bounceballs bounce = new Bounceballs();
        bounce.frontend();
    }
    /**
     * @param args the command line arguments
     */ public void frontend(){
         JFrame f = new JFrame();
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           f.setSize(640,500); 
           f.setVisible(true);
            
           Ball ball1 = new Ball();
           Ball ball2 = new Ball();
           //ball1.add(ball2);
           f.getContentPane().add(ball1);
           f.getContentPane().add(ball2);
           Thread t1 = new Thread(ball1);
           Thread t2 = new Thread(ball2);
           t1.start();
           t2.start();
    
    
}
}
    class Ball extends JPanel implements Runnable {
        public synchronized void move() {
        notifyAll();
    }
   private static final int width = 640;
   private static final int height = 480;
   private float r = 80; 
   private float x = 0; 
   private float y = 0; 
   private float dx = 2;   
   private float dy = 2;
   private static final int UPDATE_RATE = 30; 
   Ball(){
       
       this.setPreferredSize(new Dimension(width, height));}
             public void run() {
            while (true) {
               
            
            if (x -r <= 0) {
                  dx = -dx; 
                  x = r; 
               } else if (x + r > width) {
                  dx = -dx;
                  x = width - r;
               }
            if (y-r <= 0) {
                  dy = -dy;
                  y = r;
               } else if (y + r > height) {
                  dy = -dy;
                  y = height - r;
               }
                x += dx;
                y += dy;
             repaint();
            
             try {
                  Thread.sleep(1000 / UPDATE_RATE);  
               } catch (InterruptedException ex) { }
             
            }
         }
   public void paintComponent(Graphics g) {
      super.paintComponent(g); 
      g.setColor(Color.BLACK);
      g.fillRect(0, 0, width,height);
      g.setColor(Color.YELLOW);
      g.fillOval((int) (x - r), (int) (y - r),
            (int)(2 * r), (int)(2 * r));
      //g.setColor(Color.WHITE);
      g.setFont(new Font("Courier New", Font.PLAIN, 12));
      StringBuilder sb = new StringBuilder();
      Formatter formatter = new Formatter(sb);
      formatter.format("Dimension=(%2.0f,%2.0f)",
            dx, dy);
      g.drawString(sb.toString(), 20, 30);
   }
  }

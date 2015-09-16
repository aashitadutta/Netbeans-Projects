package Bounce;
import java.awt.*;
import java.awt.event.*;
class Ball implements Runnable {
    int x,y,dx,dy;
    Color color;
    Ball() {
        color=new Color((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255));
        x=(int)(Math.random()*400);
        y=(int)(Math.random()*300);
        dx=10;
        dy=20;
    }
    public synchronized void move() {
        notifyAll();
    }
    public synchronized void run() {
        while (true) {
            try {
                wait();
            } catch(InterruptedException ignore) {}
            if (x < 10 || x >= 400) {
                dx = -dx;
            }
            if (y < 10 || y >= 300) {
                dy = -dy;
            }
            x += dx;
            y += dy;
        }
    }
}
public class Bounce extends Frame {
    private Ball b[]=new Ball[10];
    public Bounce() {
        super("Bouncing balls");
        for (int i=0;i<b.length;i++) {
            b[i] = new Ball();
            new Thread(b[i]).start();
        }
        addWindowListener(new WindowAdapter() {
                public void windowClosing(WindowEvent we) {
                    System.exit(0);
                }
            }
        );
        setSize(700,600);
        show();
    }
    public static void main(String arg[]) {
        Bounce ballFrame=new Bounce();
    }
    private void moveTheBalls() {
        try {
            Thread.sleep(24L);
        } catch(InterruptedException ignore) {}
        for (int i=0;i<b.length;i++) {
            b[i].move();
        }
        repaint();
    }
    public void paint(Graphics g) {
        for (int i=0;i<b.length;i++) {
            g.setColor(b[i].color);
            g.fillOval(b[i].x,b[i].y,10,10);
        }
        moveTheBalls();
    }
}
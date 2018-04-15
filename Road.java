package codekamp;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

import static java.lang.System.exit;


public class Road implements KeyListener {
    private static int y1,y2,y3;
    private static int x1,x2,x3,xcord=100;
    private static int s1,s2,s3;

    public static void main(String[] args) {
        JFrame f1 = new JFrame();
        JPanel p1 = new JPanel();
        f1.add(p1);

        p1.setPreferredSize(new Dimension(600, 700));
        f1.pack();

        f1.setVisible(true);
        f1.setResizable(false);
        p1.setFocusable(true);
        p1.addKeyListener(new Road());


     //   try {
      //      Thread.sleep(300);
       // } catch (InterruptedException e) {
         //   e.printStackTrace();
        //}

        Graphics g = p1.getGraphics();
        BufferedImage image1 = null;
        BufferedImage image2 = null;
        BufferedImage image3 = null;
        BufferedImage image4 = null;



        try {
            image1 = ImageIO.read(Road.class.getResource("../resources/mycar.png"));
            image2 = image1;
            image3 = image1;
            image4 = image1;
        } catch (IOException e) {
            e.printStackTrace();
        }


        y1= -160;
        y2= -580;
        y3= -1000;
        p1.requestFocus();
        while (true) {
            g.setColor(Color.blue);
            g.fillRect(0, 0, 200, 700);
            g.setColor(Color.red);
            g.fillRect(200, 0, 200, 700);

            g.setColor(Color.green);
            g.fillRect(400, 0, 200, 700);
            Random m1 = new Random();
            Random m2 = new Random();
            Random m3 = new Random();

            if(y1 <= -160)
            s1 = m1.nextInt(4);
            if(y2 <= -580)
            s2 = m2.nextInt(4);
            if(y3 <= -1000)
            s3 = m3.nextInt(4);


            if (s1 == 1)
                x1 = 100;
             if (s1 == 2)
                x1 = 300;
             if (s1 == 3)
                x1 = 500;
            if(s2 == 1)
                x2=100;
             if(s2 == 2)
                x2 = 300;
             if(s2 == 3)
                x2 = 500;
            if(s3 == 1)
                x3=100;
             if(s3 == 2)
                x3 = 300;
             if(s3 == 3)
                x3 = 500;

            if(y1 >= 860)
                y1=-160;
            if(y2 >= 860)
                y2=-580;
            if(y3 >= 860)
                y3=-1000;

            y1+=10;
            y2+=10;
            y3+=10;
            g.drawImage(image1, x1, y1, null);
            g.drawImage(image2, x2, y2, null);
            g.drawImage(image3, x3, y3, null);
            g.drawImage(image4,xcord,500,null);

            Rectangle r = new Rectangle(xcord,500,100,160);
            Rectangle r1 = new Rectangle(x1,y1,100,160);
            Rectangle r2 = new Rectangle(x2,y2,100,160);
            Rectangle r3 = new Rectangle(x3,y3,100,160);

            if(r.intersects(r1)||r.intersects(r2)||r.intersects(r3))
            {
                g.clearRect(0,0,600,700);
                g.setColor(Color.red);
                g.setFont(new Font("Arial", Font.BOLD, 40));
                g.drawString("game over!",250,350);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                exit(0);
            }


            try {
                Thread.sleep(25);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            g.clearRect(0,0,600,700);

        }
    }
    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
            if (xcord < 500)
                xcord = xcord + 200;
        }
        else if(e.getKeyCode() == KeyEvent.VK_LEFT)
        {
            if(xcord >=100)
                xcord = xcord - 200;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}

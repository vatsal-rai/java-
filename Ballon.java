package codekamp;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

import static java.lang.System.exit;


public class Ballon implements MouseListener {
    private static BufferedImage i1= null;
   private static BufferedImage i2 = null;
    private static BufferedImage b1 = null;
    private static BufferedImage b2 = null;
    private static BufferedImage boom = null;
    private static boolean h1, h2, h3, h4,h5,h6;
    private static int score;
    private static Graphics g;
    private static Rectangle rec1;
    private static Rectangle rec2;
    private static Rectangle rec3;
    private static Rectangle rec4;
    private static Rectangle rec5;
    private static Rectangle rec6;
    private static int y1, y2, y3, y4,y5,y6;
    private static int x1, x2, x3, x4,x5,x6;
    private static int x11,y11;

    public static void main(String[] args) {
        JFrame f1 = new JFrame();
        JPanel p1 = new JPanel();
        f1.add(p1);

        p1.setPreferredSize(new Dimension(400, 600));
        f1.pack();

        f1.setVisible(true);
        f1.setResizable(false);
        p1.setFocusable(true);
        p1.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                x11 = e.getX();
                y11 = e.getY();
                Rectangle s = new Rectangle(x11, y11, 0, 0);
                if (x11 >= x1 && x11 <= (x1 + 80) && y11 >= y1 && y11 <= (y1 + 111)) {


                    h1 = false;
                }
                else if (x11 >= x2 && x11 <= (x2 + 80) && y11 >= y2 && y11 <= (y2 + 111)) {


                    h2 = false;

                }
                else if (x11 >= x3 && x11 <= (x3 + 90) && y11 >= y3 && y11 <= (y3 + 92)) {

                    h3 = false;
                }
                else if (x11 >= x4 && x11 <= (x4 + 90) && y11 >= y4 && y11 <= (y4 + 92)) {

                    h4 = false;


                }
                else if (x11 >= x5 && x11 <= (x5 + 81) && y11 >= y5 && y11 <= (y5 + 111)) {

                h5 = false;

                }
                else if(x11>=x6&&x11<=(x6+90)&&y11>=y6&&y11<=(y6+92))

            {


                h6 = false;


            }
        }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        g = p1.getGraphics();

        try {
            i1 = ImageIO.read(Ballon.class.getResource("../resources/balon.png"));
            i2 = i1;
            b1 = ImageIO.read(Ballon.class.getResource("../resources/bomb.png"));
            b2 = b1;
            boom = ImageIO.read(Ballon.class.getResource("../resources/boom.png"));

        } catch (IOException e) {
            e.printStackTrace();
        }
        Random r1 = new Random();
        Random r2 = new Random();
        Random r3 = new Random();
        Random r4 = new Random();
        Random r5 = new Random();
        Random r6 = new Random();
        x1 = r1.nextInt(300);
        x2 = r2.nextInt(300);
        x3 = r3.nextInt(300);
        x4 = r4.nextInt(300);
        x5=r5.nextInt(300);
        x6=r5.nextInt(300);


         y1 = 720;
         y2 = 850;
         y3 = 970;
         y4 = 1080;
         y5 = 1010;
         y6 = 2000;
         p1.requestFocus();
         h1=h2=h3=h4=h5=h6=true;
         g.setColor(Color.blue);

        while (true) {


            g.fillRect(0,0,400,600);

            if(h1)
            g.drawImage(i1, x1, y1, null);
            if(h2)
            g.drawImage(i2, x2, y2, null);
            if(h3)
                g.drawImage(b2, x3, y3, null);
            if(h4)
            g.drawImage(b1, x4, y4, null);
            if(h5)
                g.drawImage(i2, x5, y5, null);
            if(h6)
            g.drawImage(b2, x6, y6, null);
            y1 -= 10;
            y2 -= 10;
            y3 -= 10;
            y4 -= 10;
            y5-=10;
            y6-=10;

            rec1 = new Rectangle(x1, y1, 81, 111);

            rec2 = new Rectangle(x2, y2, 81, 111);

            rec3 = new Rectangle(x3, y3, 81, 111);

               rec4 = new Rectangle(x4, y4, 90, 92);

            rec5 = new Rectangle(x5, y5, 90, 92);

            rec6 = new Rectangle(x6, y6, 90, 92);

            if (y1 <= -80) {
                x1 = r1.nextInt(300);
                h1 = true;
                y1 = 720;

            }
            if (y2 <= -80) {
                x2 = r1.nextInt(300);
                h2 = true;
                y2 = 850;
            }
            if (y3 <= -80) {
                x3 = r1.nextInt(300);
                h3 = true;
                y3 = 970;
            }
            if (y4 <= -80) {
                x4 = r1.nextInt(300);
                h4 = true;
                y4 = 1080;
            }

            if (y5 <= -80)
            {
                x5 = r1.nextInt(300);
                h5 = true;
                y5 = 1010;
            }
            if (y6 <= -80)
            {
                x6 = r1.nextInt(300);
                h6 = true;
                y6 = 2000;
            }
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            g.clearRect(0, 0, 600, 600);

            if(h4==false||h5==false||h6==false)
            {
                g.drawImage(boom,0,0,null);
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                exit(0);
            }

        }


    }


    @Override
    public void mouseClicked(MouseEvent e) {

    }


        @Override
        public void mousePressed (MouseEvent e){

        }
//
        @Override
        public void mouseReleased (MouseEvent e){

        }

        @Override
        public void mouseEntered (MouseEvent e){

        }

        @Override
        public void mouseExited (MouseEvent e){

        }
    }




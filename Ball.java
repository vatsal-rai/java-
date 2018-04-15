package codekamp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public class Ball {

    private static int xvel=5,yvel=7;
    private static int width=50,height=50;
    private static int x=10,y=10;
    public static void main(String[] args) {
        JFrame j1 = new JFrame();
        JPanel p1 = new JPanel();

        j1.add(p1);
        p1.setPreferredSize(new Dimension(500, 500));
        j1.pack();
        j1.setVisible(true);
        j1.setResizable(false);
        p1.setFocusable(true);

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Graphics g = p1.getGraphics();
        g.setColor(Color.blue);
        int xcord = 0, ycord = 0;
        p1.requestFocus();
        g.fillRect(x,y,10,10);

        while (true) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            g.clearRect(0, 0, 500, 500);


            p1.addKeyListener(new KeyListener() {
                @Override
                public void keyTyped(KeyEvent e) {

                }

                @Override
                public void keyPressed(KeyEvent e) {
                    if (e.getKeyCode() == KeyEvent.VK_UP)
                        Ball.yvel = -5;


                    if (e.getKeyCode() == KeyEvent.VK_DOWN)
                        Ball.yvel = 5;
                    if (e.getKeyCode() == KeyEvent.VK_LEFT)
                        Ball.xvel = -7;
                    if (e.getKeyCode() == KeyEvent.VK_RIGHT)
                        Ball.xvel = 7;


                }

                @Override
                public void keyReleased(KeyEvent e) {

                }
            });
            if (xcord == x || ycord == y) {
                width += 10;
                height += 10;
                g.clearRect(0, 0, 500, 500);
            }

            xcord += xvel;
            ycord += yvel;
            if (xcord == 0 || xcord == 450 || ycord == 0 || ycord == 450)
                System.out.println("game over!!");
            else

                g.fillArc(xcord, ycord, width, height, 0, 360);



                Random x1 = new Random();

                Random y1 = new Random();

                 x = x1.nextInt(500);
                 y = y1.nextInt(500);
                if(xcord==x||ycord==y) {
                    g.clearRect(x, y, 10, 10);
                    g.fillRect(x, y, 10, 10);
                }
        }
    }
}
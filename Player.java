package codekamp;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class Player implements KeyListener {

    private static int ycord = 315;
    private static int yvel = 0;
    private static int yacc = 0;

    public static void main(String[] args) {
        JFrame f1 = new JFrame();
        JPanel p1 = new JPanel();

        f1.add(p1);

        p1.setPreferredSize(new Dimension(800, 450));
        f1.pack();
        f1.setVisible(true);
        f1.setResizable(false);
        p1.setFocusable(true);
        p1.addKeyListener(new Player());

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {

        }

        Graphics g = p1.getGraphics();
        BufferedImage gImage;
        BufferedImage[] playerImg = new BufferedImage[8];
        try {
            gImage = ImageIO.read(Player.class.getResource("../resources/grass.png"));
            playerImg[0] = ImageIO.read(Player.class.getResource("../resources/run_anim1.png"));
            playerImg[1] = ImageIO.read(Player.class.getResource("../resources/run_anim2.png"));
            playerImg[2] = ImageIO.read(Player.class.getResource("../resources/run_anim3.png"));
            playerImg[3] = ImageIO.read(Player.class.getResource("../resources/run_anim4.png"));
            playerImg[4] = ImageIO.read(Player.class.getResource("../resources/run_anim5.png"));
            playerImg[5] = playerImg[3];
            playerImg[6] = playerImg[2];
            playerImg[7] = playerImg[1];
        } catch (IOException e) {
            System.out.println("Please reinstall the game");
            return;
        }

        int i = 0;
        p1.requestFocus();
        while (true) {
            try {
                Thread.sleep(29);
            } catch (InterruptedException e) {
            }

            i++;
            i= i % 8;

            Player.yvel += Player.yacc;
            Player.ycord +=Player.yvel;

            if(Player.ycord >= 315) {
                Player.ycord = 315;
                Player.yacc = 0;
                Player.yvel = 0;
            }

            g.clearRect(0, 0, 800, 450);
            g.drawImage(gImage, 0, 405, null);
            g.drawImage(playerImg[i], 364, Player.ycord, null);
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_SPACE) {
            Player.yvel = -20;
            Player.yacc = 1;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
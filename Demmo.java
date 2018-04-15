package codekamp;


import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

public class Demmo {

    public static void main(String[] args) {
        JFrame j1 = new JFrame();
        JPanel p1 = new JPanel();

        j1.add(p1);
        j1.setSize(500, 500);
        j1.setVisible(true);
        j1.setResizable(false);


        Graphics g = p1.getGraphics();
        BufferedImage gimage;

        URL u = Demmo.class.getResource("../resources/download.png");
        try {
            gimage = ImageIO.read(u);
        } catch (IOException e) {
            System.out.println("reinstall game");
            return;
        }
        g.drawImage(gimage,0,0,null);
    }
    }


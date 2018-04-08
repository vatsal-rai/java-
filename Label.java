package codekamp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Label implements ActionListener {

    private static JLabel l1;
    private static JButton b1, b2;

    public static void main(String[] args) {
        JFrame f1 = new JFrame();
        JPanel p1 = new JPanel();
        // JPanel p2 = new JPanel();
        // JPanel p3 = new JPanel();
        f1.add(p1);
        Label.l1 = new JLabel("hello world");
        p1.add(Label.l1);
        Label.b1 = new JButton("change color");
        Label.b2 = new JButton("new window");
        p1.add(Label.b1);
        p1.add(Label.b2);
        Label.b1.addActionListener(new Label());


        f1.setSize(500, 600);
        f1.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        Label.l1.setForeground(Color.red);


    }
}
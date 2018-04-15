package codekamp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class first implements ActionListener {
    private static JTextField uField;
    private static JTextField pField;

        public static void main(String[] args) {
            JFrame f1 = new JFrame();
            JPanel p1 = new JPanel();
            // JPanel p2 = new JPanel();
            // JPanel p3 = new JPanel();
            f1.add(p1);
            first.uField = new JTextField("Username");
            first.pField = new JTextField("Password");
            JButton b1 = new JButton("login");
            // button will always call actionPerformed method on its actionListener when its called and it will pass whatever data it
            // has to tht method in form of acionEvent method
            b1.addActionListener(new first());
        // here actionPerformed() method is called on object of first class
            p1.add(first.uField);
            p1.add(first.pField);
            p1.add(b1);

           // b1.setForeground(new Color(255, 0, 0));
           //or b1.setForeground(Color.red);




            f1.setSize(500, 600);
            f1.setVisible(true);
        }
        public void actionPerformed(ActionEvent e)
        {
            System.out.println(("login button clicked"));
            String username = first.uField.getText();
            String password = first.pField.getText();
            System.out.println("username is " + username);
            System.out.println("password is " + password);

        }
    }





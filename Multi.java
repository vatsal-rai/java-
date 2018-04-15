package codekamp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Multi implements ActionListener{

    private  Multi child[] = new Multi[10];
    private int i=0;
    private static  Multi o1;
    private JLabel l1;
    private JButton b1,b2;

    public static void main(String[] args) {
        Multi.o1 = new Multi();
        Multi.o1.newWindow();
    }

    private void newWindow()

    {
        JFrame f1 = new JFrame();
         JPanel p1 = new JPanel();
        f1.add(p1);
        this.l1 = new JLabel("Hello world!");
        this.b1 = new JButton("change color");
        this.b2 = new JButton("new window");


        p1.add(this.l1);
        p1.add(this.b1);
        p1.add(this.b2);
        this.b1.addActionListener(this);
        this.b2.addActionListener(this);


        f1.setSize(500, 600);
        f1.setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == Multi.o1.b2&&i<10) {
            child[i] = new Multi();
            child[i].newWindow();
            i++;

        }
        else if(e.getSource() == Multi.o1.b1) {
            Multi.o1.l1.setForeground(Color.blue);

            for (i = 0; i < 10; i++) {
                child[i].l1.setForeground(Color.blue);
            }
        }
            else
            {
                this.newWindow();
            }
        }



    }



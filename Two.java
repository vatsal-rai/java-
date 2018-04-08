package codekamp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Two implements ActionListener {
    private  static Two o1,o2;
    private  JLabel l1;
    private  JButton b1;

    public static void main(String[] args) {
        Two.o1=new Two();
        Two.o2=new Two();
        Two.o1.createNewWindow();
        Two.o2.createNewWindow();

    }

    private  void createNewWindow() {
        JFrame f1 = new JFrame();
        JPanel p1 = new JPanel();
        f1.add(p1);
        this.l1 = new JLabel("Hello world!");
        this.b1 = new JButton("change color");


        p1.add(this.l1);
        p1.add(this.b1);


        this.b1.addActionListener(this);


        f1.setSize(500, 600);
        f1.setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == o1.b1)
         o2.l1.setForeground(Color.red);
        else if(e.getSource()== o2.b1)
            o1.l1.setForeground(Color.blue);
    }

}

package in.codekamp.Screens;

import in.codekamp.main.GamePanel;

import java.awt.*;
import java.awt.event.KeyEvent;

public class SettingsScreen extends Screen {


    public SettingsScreen(GamePanel panel) {
        super(panel);
    }

    public void update() {

    }

    public void draw(Graphics g) {
        g.setColor(Color.red);
        g.drawString("this is settings screens", 10, 10);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}

package in.codekamp.Screens;

import in.codekamp.main.GamePanel;

import java.awt.*;
import java.awt.event.KeyEvent;

public class GameOverScreen extends Screen {


    public GameOverScreen(GamePanel panel) {super(panel);}


        public void draw (Graphics g){
            g.setColor(Color.red);
            g.setFont(new Font("Arial", Font.BOLD, 18));
            g.drawString("Game Over. Press any key to continue", 10, 10);
        }

        @Override
        public void onKeyPress ( int keyCode){
            this.gPanel.currentScreen = new Stage1Screen(this.gPanel);
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




package in.codekamp.Screens;

import in.codekamp.main.Game;
import in.codekamp.main.GamePanel;

import java.awt.*;
import java.awt.event.KeyEvent;

public class WelcomeScreen extends Screen {

    public WelcomeScreen(GamePanel panel) {
        super(panel);
    }

    private Color circleColor = Color.red;
    private int counter = 0;
    private static final int CIRCLE_SIZE = 100;
    private static final int BUTTON_WIDTH = 200;
    private static final int BUTTON_HEIGHT = 60;
    private static final int PLAY_BUTTON_Y_CORD = 150;
    private static final int SETTINGS_BUTTON_Y_CORD = 250;

    public void update() {
        this.counter++;
        if (this.counter == 60) {
            this.counter = 0;
            if (this.circleColor == Color.red) {
                this.circleColor = Color.green;
            } else {
                this.circleColor = Color.red;
            }
        }
    }

    public void draw(Graphics g) {
        g.setColor(this.circleColor);
        g.fillArc(Game.GAME_WIDTH / 2 - CIRCLE_SIZE / 2, 20, CIRCLE_SIZE, CIRCLE_SIZE, 0, 360);

        g.setColor(Color.red);
        g.fillRect(Game.GAME_WIDTH / 2 - BUTTON_WIDTH / 2, PLAY_BUTTON_Y_CORD, BUTTON_WIDTH, BUTTON_HEIGHT);
        g.setColor(Color.blue);
        g.drawString("play",Game.GAME_WIDTH / 2 - BUTTON_WIDTH / 2,PLAY_BUTTON_Y_CORD+30);
        g.setColor(Color.green);
        g.fillRect(Game.GAME_WIDTH / 2 - BUTTON_WIDTH / 2, SETTINGS_BUTTON_Y_CORD, BUTTON_WIDTH, BUTTON_HEIGHT);
        g.setColor(Color.blue);
        g.drawString("settings",Game.GAME_WIDTH / 2 - BUTTON_WIDTH / 2,SETTINGS_BUTTON_Y_CORD+30);
    }

    @Override
    public void onMousePress(int xCord, int yCord) {
        int buttonCord = Game.GAME_WIDTH / 2 - BUTTON_WIDTH / 2;
        int buttonEndCord = buttonCord + BUTTON_WIDTH;

        if (xCord > buttonCord && xCord < buttonEndCord
                && yCord > PLAY_BUTTON_Y_CORD
                && yCord < PLAY_BUTTON_Y_CORD + BUTTON_HEIGHT) {
            this.gPanel.currentScreen = new Stage1Screen(this.gPanel);
        } else if (xCord > buttonCord && xCord < buttonEndCord
                && yCord > SETTINGS_BUTTON_Y_CORD
                && yCord < SETTINGS_BUTTON_Y_CORD + BUTTON_HEIGHT) {
            this.gPanel.currentScreen = new SettingsScreen(this.gPanel);
        }
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
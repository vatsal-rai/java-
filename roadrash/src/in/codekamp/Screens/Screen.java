package in.codekamp.Screens;


import in.codekamp.Entities.Car;
import in.codekamp.Entities.Entity;
import in.codekamp.main.GamePanel;

import java.awt.*;
import java.awt.event.KeyListener;
import java.util.*;
import java.util.List;

abstract public class Screen implements KeyListener{

    protected GamePanel gPanel;
    protected List<Car> entities = new ArrayList<Car>();

    public Screen(GamePanel p) {
        super();
        this.gPanel = p;
    }

    public void update() {
        for(Car e: this.entities) {
            e.update();
        }
    }

    public void draw(Graphics g) {
        for(Car e: entities) {

                g.drawImage(e.image, e.x, e.y, null);

        }
    }

    public void onMousePress(int xCord, int yCord) {

    }

    public void onKeyPress(int keyCode) {

    }
}
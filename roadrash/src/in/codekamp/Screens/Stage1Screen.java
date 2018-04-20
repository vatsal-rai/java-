package in.codekamp.Screens;


import in.codekamp.Entities.Car;
import in.codekamp.Entities.Entity;
import in.codekamp.Resources.Resource;
import in.codekamp.main.Game;
import in.codekamp.main.GamePanel;


import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.*;


import static in.codekamp.Entities.Entity.*;
import static in.codekamp.main.Game.GAME_WIDTH;

public class Stage1Screen extends Screen implements KeyListener{


    private static final int GROUND_Y_CORD = 300;

    private ArrayList<Car> cars = new ArrayList<>();
    private Car mycar;

    public Stage1Screen(GamePanel panel) {
        super(panel);

        this.cars.add(new Car(Entity.x1, Entity.y1));
        this.cars.add(new Car(Entity.x2, Entity.y2));
        this.cars.add(new Car(Entity.x3, Entity.y3));


        this.mycar = new Car(350, GROUND_Y_CORD);

        this.entities.addAll(this.cars);
        this.entities.add(this.mycar);
    }

    @Override
    public void update() {
        super.update();

        Random m1 = new Random();
        Random m2 = new Random();
        Random m3 = new Random();

        if(Entity.y1 <= -160)
            s1 = m1.nextInt(4);
        if(Entity.y2 <= -580)
            Entity.s2 = m2.nextInt(4);
        if(Entity.y3 <= -1000)
            s3 = m3.nextInt(4);

        if (s1 == 1)
            x1 = 100;
        if (s1 == 2)
            x1 = 300;
        if (s1 == 3)
            x1 = 500;
        if(s2 == 1)
            x2=100;
        if(s2 == 2)
            x2 = 300;
        if(s2 == 3)
            x2 = 500;
        if(s3 == 1)
            x3=100;
        if(s3 == 2)
            x3 = 300;
        if(s3 == 3)
            x3 = 500;

        if(y1 >= 860)
            y1=-160;
        if(y2 >= 860)
            y2=-580;
        if(y3 >= 860)
            y3=-1000;

        y1+=10;
        y2+=10;
        y3+=10;
    }

    public void draw(Graphics g) {
        g.setColor(Resource.c1);
        g.fillRect(0, 0, GAME_WIDTH / 3, Game.GAME_HEIGHT);
        g.setColor(Resource.c2);
        g.fillRect(200, 0, GAME_WIDTH / 3, Game.GAME_HEIGHT);
        g.setColor(Resource.c3);
        g.fillRect(400, 0, GAME_WIDTH / 3, Game.GAME_HEIGHT);

        g.drawImage(Resource.car1, x1, y1, null);
        g.drawImage(Resource.car2, x2, y2, null);
        g.drawImage(Resource.car3, x3, y3, null);
        g.drawImage(Resource.mycar, xcord, Game.GAME_HEIGHT - 150, null);
        Rectangle r = new Rectangle(xcord, Game.GAME_HEIGHT - 150, 100, 160);
        Rectangle r1 = new Rectangle(x1, y1, 100, 160);
        Rectangle r2 = new Rectangle(x2, y2, 100, 160);
        Rectangle r3 = new Rectangle(x3, y3, 100, 160);

        if (r.intersects(r1) || r.intersects(r2) || r.intersects(r3)){
            this.gPanel.currentScreen = new GameOverScreen(this.gPanel);
        }
    }

    @Override
    public void onKeyPress(int keyCode) {

        }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
            if (xcord < 500)
                xcord = xcord + 200;
        }
        else if(e.getKeyCode() == KeyEvent.VK_LEFT)
        {
            if(xcord >=100)
                xcord = xcord - 200;
        }


    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}


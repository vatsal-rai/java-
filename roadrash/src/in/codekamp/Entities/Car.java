package in.codekamp.Entities;

import in.codekamp.Resources.Resource;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

import static in.codekamp.Resources.Resource.car3;

public class Car extends Entity {

    private List<Image> allImages = new ArrayList<>();
    private int imageIndex = 0;


    public Car(int x, int y) {
        super();

       // this.width = 72;
        //this.height = 90;

        this.allImages.add(Resource.car1);
        this.allImages.add(Resource.car2);
        this.allImages.add(car3);
        this.allImages.add(Resource.mycar);

    }

    public void update() {



    }


}

package in.codekamp.Resources;
import javax.imageio.ImageIO;
import java.awt.*;
import java.io.IOException;

public class Resource {
    public static Image mycar;
    public static Image car1,car2,car3;
    public static Color c1,c2,c3;



    public static void load() {
        c1 = new Color(255,0,0);
        c2 = new Color(0,0,255);
        c3 = new Color(255,255,0);


        try {
            car1 = ImageIO.read(Resource.class.getClassLoader().getResourceAsStream("in/codekamp/Resources/Images/mycar.png"));
            car2= ImageIO.read(Resource.class.getClassLoader().getResourceAsStream("in/codekamp/Resources/Images/mycar.png"));
            car3= ImageIO.read(Resource.class.getClassLoader().getResourceAsStream("in/codekamp/Resources/Images/mycar.png"));

            mycar = ImageIO.read(Resource.class.getClassLoader().getResourceAsStream("in/codekamp/Resources/Images/mycar.png"));

        } catch (IOException e) {

        }
    }





}

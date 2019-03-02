package sample;
import java.util.Random;
public class Controller {

    public static int getRand(int Max){
        Random r = new Random();
        return r.nextInt(Max);
    }

}

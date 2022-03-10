package shoot.day03;

import java.util.Random;

public class Bee extends FlyObject{
    int speedX;
    int speedY;
    int awardType;

    Bee(){
        super(60,51);
        speedX = 1;
        speedY = 2;
        Random rand=new Random();
        awardType = rand.nextInt(2);
    }


}

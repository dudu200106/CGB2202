package shoot.day02;

import java.util.Random;

public class Bee {
    int width;
    int height;
    int x;
    int y;
    int speedX;
    int speedY;
    int awardType;

    Bee(){
        width = 60;
        height = 51;
        Random rand = new Random();
        x = rand.nextInt(400-width);
        y = -height;
        speedX = 1;
        speedY = 2;
        awardType = rand.nextInt(2);
    }

    void step(){
        System.out.println("小蜜蜂的左右,向下移动");
    }

}

package shoot.day02;

import java.util.Random;

public class BigAirplane {
    int width;
    int height;
    int x;
    int y;
    int speed;

    BigAirplane(){
        width = 66;
        height = 89;
        Random rand = new Random();
        x = rand.nextInt(400-width);
        y = -height;
        speed = 2;
    }

    void step(){
        System.out.println("大敌机向下移动, y++");
    }
}

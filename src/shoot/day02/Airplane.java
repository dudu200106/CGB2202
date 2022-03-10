package shoot.day02;

import java.util.Random;

public class Airplane {
    int width;
    int height;
    int x;
    int y;
    int speed;

    Airplane(){
        width = 48;
        height = 50;
        Random rand = new Random();
        x = rand.nextInt(400-width);
        y = -height;
        speed = 2;
    }

    void step(){
        System.out.println("敌机向下移动,y++");
    }
}

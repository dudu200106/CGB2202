package shoot.day03;

import java.util.Random;

public class Airplane extends FlyObject{
    int speed;

    Airplane(){
        super(48,50);
        speed = 2;
    }

    void step(){
        System.out.println("敌机向下移动,y++");
    }
}

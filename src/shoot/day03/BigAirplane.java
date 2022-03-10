package shoot.day03;

import java.util.Random;

public class BigAirplane extends FlyObject{
    int speed;

    BigAirplane(){
        super(66,89);
        speed = 2;
    }

    void step(){
        System.out.println("大敌机向下移动, y++");
    }
}

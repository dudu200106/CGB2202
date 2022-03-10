package shoot.day03;

import java.util.Random;

public class FlyObject {
    int width;
    int height;
    int x;
    int y;

    //for大小敌机, 小蜜蜂--他们的位置是可固定, 大小是不同的
    public FlyObject(int width, int height) {
        this.width = width;
        this.height = height;
        Random rand=new Random();
        x=rand.nextInt(400-width);
        y=-height;
    }

    //for子弹和英雄,天空--大小,位置都不固定
    FlyObject(int width, int height, int x, int y){
        this.width=width;
        this.height=height;
        this.x=x;
        this.y=y;
    }

    void step(){
        System.out.println("飞行物体移动!");
    }
}

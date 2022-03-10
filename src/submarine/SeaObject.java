package submarine;

import java.util.Random;

public class SeaObject {
    //成员变量在哪个类中, 就在该类中设计构造方法给他们赋值
    int width;
    int height;
    int x;
    int y;
    int speed;

    //父类里面设计的构造方法中, width和height是不固定的,不能写死;
    //而其余三个属性一致,可以不添加进父类的构造方法参数列表中
    SeaObject(int width, int height){
        Random rand=new Random(); ///随机数对象
        this.width=64;//前面默认加上this.
        this.height=20;
        x=-width;
        y=rand.nextInt(479-height-150+1)+150; //150~窗口高度-潜艇-海平面+1
        speed=rand.nextInt(3)+1; //速度随机在1~3之间的数
    }

    SeaObject(int width, int height, int x,int y, int speed){
        this.width=width;
        this.height=height;
        this.x=x;
        this.y=y;
        this.speed=speed;
    }
    void move(){
        System.out.println("海洋对象 moveing!");
    }

}

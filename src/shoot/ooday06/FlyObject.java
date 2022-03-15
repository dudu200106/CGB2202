package shoot.ooday06;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.Random;

public abstract class FlyObject {
    protected int width;
    protected int height;
    protected int x;
    protected int y;

    public static final int LIVE =0;
    public static final int DIED=1;
    public static final int REMOVE=2;
    protected int state= LIVE; //当前状态

    //for大小敌机, 小蜜蜂--他们的位置是可固定, 大小是不同的
    public FlyObject(int width, int height) {
        this.width = width;
        this.height = height;
        Random rand=new Random();
        x=rand.nextInt(World.WIDTH-width);
        y=-height;
    }

    //for子弹和英雄,天空--大小,位置都不固定
    FlyObject(int width, int height, int x, int y){
        this.width=width;
        this.height=height;
        this.x=x;
        this.y=y;
    }

    public abstract void step();

    public abstract BufferedImage getImaeg();

    public boolean isLive(){
        return state== LIVE;
    }

    public boolean isDead(){
        return state== DIED;
    }
    public boolean isRemve(){
        return state== REMOVE;
    }

    public abstract Image getImage();
}

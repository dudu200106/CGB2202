package shoot.ooday06;

import java.awt.image.BufferedImage;
import java.util.Random;

public class Bee extends FlyObject {
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

    public void step(){
        x+=speedX; //左右移动
        y+=speedY; //向下飞
        if (x<=0 || x>=World.WIDTH-this.width){
            speedX*=-1; //撞墙则变换方向
        }
    }

    @Override
    public BufferedImage getImaeg() {
        return null;
    }

    int index = 1; //下标
    /** 重写getImage()获取图片 */
    public BufferedImage getImage(){ //每10毫秒走一次
        if(isLive()){
            return Images.bees[0];
        }else if(isDead()){
            BufferedImage img = Images.bees[index++];
            if(index==Images.bees.length){
                state = REMOVE;
            }
            return img;
        }
        return null;
    }

}

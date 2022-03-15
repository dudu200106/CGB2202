package shoot.ooday06;

import java.awt.image.BufferedImage;

public class Bullet extends FlyObject {
    int speed;

    Bullet(int x,int y){
        super(8,20,x,y);
        speed = 3;
    }

    /** 重写step()移动 */
    public void step(){
        y-=speed;
    }

    @Override
    public BufferedImage getImaeg() {
        return null;
    }

    /** 重写getImage()获取图片 */
    public BufferedImage getImage(){ //每10毫秒走一次
        if(isLive()){             //若活着的
            return Images.bullet; //则直接返回子弹图片
        }else if(isDead()) { //若死了的
            state = REMOVE;  //则将当前状态修改为REMOVE删除的
        }
        return null; //死了的和删除的，都不返回图片
           /*
             执行过程:
               1)若活着的，返回bullet图片
               2)若死了的，将当前状态修改为REMOVE删除的，同时不返回图片
               3)若删除的，不返回图片
            */
    }
}

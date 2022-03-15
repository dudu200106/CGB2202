package shoot.ooday06;

import java.awt.image.BufferedImage;

public class Sky extends FlyObject {
    int speed;
    int y1;

    public Sky() {
        super(400,700,0,0);
        speed = 1;
        y1 = -World.HEIGHT;
    }

    @Override
    public void step() {
        y+=speed;
        y1+=speed;
        if (y>=World.HEIGHT){ //若y>=窗口的高，表示移到最下面了
            y=-World.HEIGHT;  //然后将图片重新移动到最顶上重新下移
        }
        if (y1>=World.WIDTH){
            y=-World.HEIGHT;
        }
    }

    @Override
    public BufferedImage getImaeg() {
        return null;
    }

    /** 重写getImage()获取图片 */
    public BufferedImage getImage(){ //每10毫秒走一次
        return Images.sky; //返回sky图片即可
    }

    /** 获取y1坐标 */
    public int getY1(){
        return y1; //返回y1坐标
    }
}

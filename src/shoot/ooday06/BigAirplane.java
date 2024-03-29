package shoot.ooday06;

import java.awt.image.BufferedImage;

public class BigAirplane extends FlyObject {
    int speed;

    BigAirplane(){
        super(66,89);
        speed = 2;
    }

    /** 重写step()移动 */
    public void step(){
        y+=speed; //y+(向下)
    }

    @Override
    public BufferedImage getImaeg() {
        return null;
    }

    int index = 1; //下标
    /** 重写getImage()获取图片 */
    public BufferedImage getImage() { //每10毫秒走一次
        if (isLive()) {
            return Images.bairs[0];
        } else if (isDead()) {
            BufferedImage img = Images.bairs[index++];
            if (index == Images.bairs.length) {
                state = REMOVE;
            }
            return img;
        }
        return null;
    }
}

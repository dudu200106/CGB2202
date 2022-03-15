package shoot.ooday06;

import java.awt.image.BufferedImage;

public class Hero extends FlyObject {
    int life;
    int fire;

    Hero(){
        super(97,139,140,400);
        life = 3;
        fire = 0;
    }

    /** 重写step()移动 */
    public void step(){

    }

    @Override
    public BufferedImage getImaeg() {
        return null;
    }

    int index = 0; //下标
    /** 重写getImage()获取图片 */
    public BufferedImage getImage(){ //每10毫秒走一次
        return Images.heros[index++%Images.heros.length]; //heros[0]和heros[1]来回切换
           /* 执行过程:
                                 index=0
              10M  返回heros[0]  index=1
              20M  返回heros[1]  index=2
              30M  返回heros[0]  index=3
              40M  返回heros[1]  index=4
              50M  返回heros[0]  index=5
            */
    }
}

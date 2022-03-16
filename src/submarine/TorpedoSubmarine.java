package submarine;

import javax.swing.*;

public class TorpedoSubmarine extends SeaObject{
    public String name="TorpedoSub";

    public TorpedoSubmarine( ) {
        super(64,20); //调用父类的构造方法, 随机生成对象
    }

    @Override
    public void move() {
        x+=speed;
    }

    @Override
    public ImageIcon getImage() {
        return Images.torpesubm;
    }
}

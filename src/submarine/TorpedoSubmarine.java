package submarine;

import java.util.Random;

public class TorpedoSubmarine extends SeaObject{

    public TorpedoSubmarine( ) {
        Random rand=new Random(); ///随机数对象
        width=64;
        height=20;
        x=-width;
        y=rand.nextInt(479-height-150+1)+150; //150~窗口高度-潜艇-海平面+1
        speed=rand.nextInt(3)+1; //1~3之间的数
    }

}

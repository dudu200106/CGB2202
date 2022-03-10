package submarine;

import java.util.Random;

public class Mine extends SeaObject{

    public Mine(int x, int y) {
        Random rand=new Random(); ///随机数对象
        width=11;
        height=11;
        this.x=x;
        this.y= y;
        speed=rand.nextInt(3)+1; //1~3之间
    }

}

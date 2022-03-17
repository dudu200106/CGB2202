package submarine;

import javax.swing.*;

public class MineSubmarine extends SeaObject implements EnemyLife{
    public String name="MineSub";

    public MineSubmarine(  ) {
        super(63,19);
    }

    @Override
    public void move() {
        x+=speed;
    }

    @Override
    public ImageIcon getImage() {
        return Images.minesubm;
    }

    public Mine getMine(){
        int x=this.x+this.width;
        int y=this.y-5;
        return new Mine(x,y);
    }

    @Override
    public int getLife() {
        return 1;
    }
}

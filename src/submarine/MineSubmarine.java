package submarine;

import javax.swing.*;

public class MineSubmarine extends SeaObject{

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

}

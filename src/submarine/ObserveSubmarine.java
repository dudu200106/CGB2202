package submarine;

import javax.swing.*;

public class ObserveSubmarine extends SeaObject implements EnemyScore{
    public String name ="ObserveSub";

    public ObserveSubmarine(){
        super(63,19);
        move();
    }

    @Override
    public void move() {
        x+=speed;
    }

    @Override
    public ImageIcon getImage() {
        return Images.obsersubm;
    }

    @Override
    public int getScore() {
        return 10;
    }
}

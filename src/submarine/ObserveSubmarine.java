package submarine;

import javax.swing.*;

public class ObserveSubmarine extends SeaObject{
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

}

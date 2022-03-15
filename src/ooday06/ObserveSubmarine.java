package ooday06;

import javax.swing.*;

public class ObserveSubmarine extends SeaObject {

    public ObserveSubmarine(){
        super(63,19);
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

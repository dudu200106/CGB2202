package ooday06;

import javax.swing.*;

public class Bomb extends SeaObject {

    public Bomb(  int x, int y ) {
        super(9,12,x,y,3);
    }

    @Override
    public void move() {
        y+=speed;
    }

    @Override
    public ImageIcon getImage() {
        return Images.bomb;
    }
}

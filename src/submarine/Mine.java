package submarine;

import javax.swing.*;

public class Mine extends SeaObject{

    public Mine(int x, int y) {
        super(11,11,x,y,3);
    }

    @Override
    public void move() {
        y-=speed;
    }

    @Override
    public ImageIcon getImage() {
        return Images.mine;
    }

    public boolean isOutOfBound(){
        return this.y<=150-this.height;
    }
}

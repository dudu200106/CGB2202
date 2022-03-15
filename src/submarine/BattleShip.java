package submarine;

import javax.swing.*;

public class BattleShip extends SeaObject{

    private int life;

    public BattleShip() {
        super(66,26,270,124,20);
        this.life = 10;
    }

    @Override
    public void move() {

    }

    @Override
    public ImageIcon getImage() {
        return Images.batteship;
    }
}

package submarine;

import javax.swing.*;

public class BattleShip extends SeaObject{

    private int life;

    public BattleShip() {
        super(66,26,270,124,20);
        this.life = 10;
    }

    public void moveLeft() {
        x-=speed;
    }

    public void moveRight() {
        x+=speed;
    }

    @Override
    public void move() {

    }

    public int getLife(){ return life; }

    public void addLife(int num){
        life+=num;
    }
    public void reduceLife(){
        life-=1;
    }

    @Override
    public ImageIcon getImage() {
        return Images.batteship;
    }

    public Bomb shootBomb(){
        return new Bomb(this.x,this.y);
    }
}

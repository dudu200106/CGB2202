package shoot.day03;

public class Bullet extends  FlyObject{
    int speed;

    Bullet(int x,int y){
        super(8,20,x,y);
        speed = 3;
    }
}

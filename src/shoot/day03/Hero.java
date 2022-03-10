package shoot.day03;

public class Hero extends FlyObject{
    int life;
    int fire;

    Hero(){
        super(97,139,140,400);
        life = 3;
        fire = 0;
    }
}

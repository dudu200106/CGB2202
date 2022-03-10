package shoot.day02;

public class Hero {
    int width;
    int height;
    int x;
    int y;
    int life;
    int fire;

    Hero(){
        width = 97;
        height = 139;
        x = 140;
        y = 400;
        life = 3;
        fire = 0;
    }

    void step(){
        System.out.println("Change picture");
    }
}

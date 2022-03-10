package shoot.day02;

public class Bullet {
    int width;
    int height;
    int x;
    int y;
    int speed;

    Bullet(int x,int y){
        width = 8;
        height = 20;
        this.x = x;
        this.y = y;
        speed = 3;
    }

    void step(){
        System.out.println("子弹向上移动");
    }
}

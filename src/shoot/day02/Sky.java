package shoot.day02;

public class Sky {
    int width;
    int height;
    int x;
    int y;
    int speed;
    int y1;

    public Sky( ) {
        width = 400;
        height = 700;
        x = 0;
        y = 0;
        speed = 1;
        y1 = -700;
    }

    void step(){
        System.out.println("第一,二张图片都向下移动");
    }
}

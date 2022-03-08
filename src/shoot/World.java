package shoot;

public class World {
    public static void main(String[] args) {
        Sky s = new Sky();
        s.width = 400;
        s.height = 700;
        s.x = 0;
        s.y = 0;
        s.speed = 1;
        s.y1 = -700;
        s.step();

        Hero h = new Hero();
        h.width = 50;
        h.height = 80;
        h.x = 100;
        h.y = 200;
        h.life = 3;
        h.fire = 0;
        h.step();

        Airplane a1 = new Airplane();
        a1.width = 30;
        a1.height = 40;
        a1.x = 300;
        a1.y = 500;
        a1.speed = 2;
        a1.step();

        Airplane a2 = new Airplane();
        a2.width = 30;
        a2.height = 40;
        a2.x = 100;
        a2.y = 150;
        a2.speed = 2;
        a2.step();

        //如下创建代码及访问代码，与上面同理----此处省略
        BigAirplane ba1=new BigAirplane();
        ba1.width = 30;
        ba1.height = 40;
        ba1.x = 100;
        ba1.y = 150;
        ba1.speed = 2;
        ba1.step();
        BigAirplane ba2=new BigAirplane();
        ba2.width = 30;
        ba2.height = 40;
        ba2.x = 100;
        ba2.y = 150;
        ba2.speed = 2;
        ba2.step();

        Bee b1=new Bee();
        b1.width = 30;
        b1.height = 40;
        b1.x = 300;
        b1.y = 500;
        b1.speedX = 2;
        b1.speedY=2;
        b1.step();
        Bee b2=new Bee();
        b2.width=30;
        b2.height = 40;
        b2.x = 300;
        b2.y = 500;
        b2.speedX = 2;
        b2.speedY=2;
        b2.step();

        Bullet bt1=new Bullet();
        bt1.width=2;
        bt1.height=4;
        bt1.x=h.x;
        bt1.y=h.y;
        bt1.speed=4;
        Bullet bt2=new Bullet();
        bt2.width=2;
        bt2.height=4;
        bt2.x=h.x;
        bt2.y=h.y;
        bt2.speed=4;
    }
}

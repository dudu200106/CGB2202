package shoot.day02;

public class World {
    public static void main(String[] args) {
        Sky s = new Sky();

        Hero h = new Hero();

        Airplane a1 = new Airplane();
        Airplane a2 = new Airplane();
        Airplane a3 = new Airplane();
        Airplane a4 = new Airplane();

        BigAirplane ba1=new BigAirplane();
        BigAirplane ba2=new BigAirplane();

        Bee b1=new Bee();
        Bee b2=new Bee();


        Bullet bt1=new Bullet(100,200);
        Bullet bt2=new Bullet(300,200);

        System.out.println(h.width+","+h.height+","+h.x+","+h.y+","+h.life+","+h.fire);
        System.out.println(a1.width+","+a1.height+","+a1.x+","+a1.y+","+a1.speed);
        System.out.println(a2.width+","+a2.height+","+a2.x+","+a2.y+","+a2.speed);
        System.out.println(a3.width+","+a3.height+","+a3.x+","+a3.y+","+a3.speed);
        System.out.println(a4.width+","+a4.height+","+a4.x+","+a4.y+","+a4.speed);
    }
}

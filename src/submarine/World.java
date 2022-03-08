package submarine;

public class World {
    public static void main(String[] args) {
        BattleShip s = new BattleShip();
        s.width = 50;
        s.height = 30;
        s.x = 100;
        s.y = 200;
        s.speed = 20;
        s.life = 5;
        System.out.println(s.width+","+s.height+","+s.x+","+s.y+","+s.speed+","+s.life);
        s.move();

        ObserveSubmarine os1 = new ObserveSubmarine();
        os1.width = 30;
        os1.height = 40;
        os1.x = 200;
        os1.y = 400;
        os1.speed = 3;
        System.out.println(os1.width+","+os1.height+","+os1.x+","+os1.y+","+os1.speed);
        os1.move();

        ObserveSubmarine os2 = new ObserveSubmarine();
        os2.width = 30;
        os2.height = 40;
        os2.x = 100;
        os2.y = 450;
        os2.speed = 3;
        System.out.println(os2.width+","+os2.height+","+os2.x+","+os2.y+","+os2.speed);
        os2.move();

        TorpedoSubmarine ts1 = new TorpedoSubmarine();
        TorpedoSubmarine ts2 = new TorpedoSubmarine();
        MineSubmarine ms1 = new MineSubmarine();
        MineSubmarine ms2 = new MineSubmarine();
        Mine m1 = new Mine();
        Mine m2 = new Mine();
        Bomb b1 = new Bomb();
        Bomb b2 = new Bomb();
    }
}


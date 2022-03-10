package shoot.day03;

public class World {
    public static void main(String[] args) {
        Sky s = new Sky();

        Hero h = new Hero();

        Airplane[] airs=new Airplane[4];
        airs[0] = new Airplane();
        airs[1] = new Airplane();
        airs[2] = new Airplane();
        airs[3] = new Airplane();
        for (int i = 0; i < airs.length; i++) {
            airs[i].step();
        }

        BigAirplane[] bas=new BigAirplane[2];
        bas[0] =new BigAirplane();
        bas[1] =new BigAirplane();
        for (int i = 0; i < bas.length; i++) {
            airs[i].step();
        }

        Bee[] bees=new Bee[2];
        bees[0]=new Bee();
        bees[1]=new Bee();
        for (int i = 0; i < bees.length; i++) {
            airs[i].step();
        }

        Bullet[] bts=new Bullet[3];
        bts[0]=new Bullet(100,200);
        bts[0]=new Bullet(200,200);
        bts[2]=new Bullet(300,200);
        for (int i = 0; i < bts.length; i++) {
            airs[i].step();
        }

    }
}

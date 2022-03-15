package shoot.ooday06;

import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.*;

public class World extends JPanel{
    public static final int WIDTH=400;
    public static final int HEIGHT=700;

    private Sky sky = new Sky();         //天空对象
    private Hero hero = new Hero();      //英雄机对象
    private FlyObject[] enemies = {
            new Airplane(),
            new BigAirplane(),
            new Bee()
    }; //敌人(小敌机、大敌机、小蜜蜂)数组
    private Bullet[] bullets = {
            new Bullet(100,200)
    };       //子弹数组

    public void action(){ //测试代码
    }

    /** 重写paint()画  g:画笔 */
    public void paint(Graphics g){
        g.drawImage(sky.getImage(),sky.x,sky.y,null); //画天空
        g.drawImage(sky.getImage(),sky.x,sky.getY1(),null); //画天空2
        g.drawImage(hero.getImage(),hero.x,hero.y,null); //画英雄机
        for(int i=0;i<enemies.length;i++){ //遍历所有敌人
            FlyObject f = enemies[i]; //获取每一个敌人
            g.drawImage(f.getImage(),f.x,f.y,null); //画敌人
        }
        for(int i=0;i<bullets.length;i++){ //遍历所有子弹
            Bullet b = bullets[i]; //获取每一个子弹
            g.drawImage(b.getImage(),b.x,b.y,null); //画子弹
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        World world = new World();
        world.setFocusable(true);
        frame.add(world);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(WIDTH+16, HEIGHT+39);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}

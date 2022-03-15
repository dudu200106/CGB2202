package ooday06;

//import javax.swing.*;  不建议全部导入,加载时效率低

import javax.swing.*;
import java.awt.*;

public class World extends JPanel{

    public static final int WIDTH=641; //窗口的宽
    public static final int HEIGHT=479; //窗口的高

    private BattleShip ship = new BattleShip(); //战舰

    private SeaObject[] submarines = {
            new ObserveSubmarine(),
            new TorpedoSubmarine(),
            new MineSubmarine()
    };
    private Mine[] mines = {
            new Mine(260,200)
    };
    private Bomb[] bombs = {
            new Bomb(200,120)
    };

    /** 重写paint()画 g:画笔-----------不要求掌握 */
    public void paint(Graphics g){
        Images.sea.paintIcon(null,g,0,0); //画海洋图
        ship.paintImage(g); //画战舰

        for(int i=0;i<submarines.length;i++){ //遍历所有潜艇
            submarines[i].paintImage(g); //画潜艇
        }
        for(int i=0;i<mines.length;i++){ //遍历所有水雷
            mines[i].paintImage(g); //画水雷
        }
        for(int i=0;i<bombs.length;i++){ //遍历所有深水炸弹
            bombs[i].paintImage(g); //画深水炸弹
        }
    }
    public static void main(String[] args) {
        JFrame frame=new JFrame();
        World world=new World();
        world.setFocusable(true);
        frame.add(world);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(WIDTH+16,HEIGHT+39);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}


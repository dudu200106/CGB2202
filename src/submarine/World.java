package submarine;

//import javax.swing.*;  不建议全部导入,加载时效率低
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Random;

public class World extends JPanel{

    public static final int WIDTH=641; //窗口的宽
    public static final int HEIGHT=479; //窗口的高

    private BattleShip ship = new BattleShip(); //战舰

    private ArrayList<SeaObject> submarines = new ArrayList<>();
    private ArrayList<Mine> mines = new ArrayList<>();
    private ArrayList<Bomb> bombs = new ArrayList<>();

    /*private Mine[] mines = {
            new Mine(260,200)
    };
    private Bomb[] bombs = {
            new Bomb(200,120)
    };*/

    /** 重写paint()画 g:画笔-----------不要求掌握 */
    @Override
    public void paint(Graphics g){ //每次刷新,
        // 重画一次画布
        Images.sea.paintIcon(null,g,0,0); //画海洋图
        ship.paintImage(g); //画战舰

        for(SeaObject ele: submarines){ //遍历所有潜艇
            ele.paintImage(g); //画潜艇
            ele.move();
        }
        for(Mine e: mines){ //遍历所有水雷
            e.paintImage(g); //画水雷
            e.move();
        }
        for(Bomb e: bombs){ //遍历所有深水炸弹
            e.paintImage(g); //画深水炸弹
            e.move();
        }
    }

    public void action(){
        Timer timer=new Timer(); //定时器对象
        int interval=10; //时间间隔(毫秒)
        timer.schedule(new TimerTask() { //定义,新建了一个TimerTask的匿名内部类对象(它的派生类的对象)--向上构造,代码简洁
            @Override
            public void run() { //run方法代表没隔interval毫秒间隔要做的任务
                submarineEnterAction();
                mineEnterAction();
                moveAction();
                repaint(); //重画,重新调用paint方法
            }
        },interval,interval);
    }

    private int subEnterIndex=0;
    public void submarineEnterAction() {
        subEnterIndex++;
        if (subEnterIndex%40==0){
            SeaObject obj=nextSubmarine();
            submarines.add(obj);

        }
    }

    private int mineENterIndex=0;
    public void mineEnterAction(){
        mineENterIndex++;
        if (mineENterIndex%100==0){

        }
    }

    public void moveAction(){
        for (SeaObject e: submarines) {
            e.move();
        }
        for(Mine e: mines){ //遍历所有水雷
            e.move();
        }
        for(Bomb e: bombs){ //遍历所有深水炸弹
            e.move();
        }
    }

    public SeaObject nextSubmarine(){
        Random rand=new Random();
        int type=rand.nextInt(20);
        if (type<10) //控制概率
            return new ObserveSubmarine();
        else if (type<15)
            return new TorpedoSubmarine();
        else
            return new MineSubmarine();
    }

    public static void main(String[] args) {
        JFrame frame=new JFrame();
        World world=new World();
        world.setFocusable(true);
        frame.add(world);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(WIDTH+16,HEIGHT+39);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);// 设置窗口可见, 开始调用paint方法

        world.action(); //启动程序的执行
    }
}


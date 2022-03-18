package submarine;

//import javax.swing.*;  不建议全部导入,加载时效率低
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Random;

/**
 * @author
 */
public class World extends JPanel{

    public static final int WIDTH=641; //窗口的宽
    public static final int HEIGHT=479; //窗口的高

    private BattleShip ship = new BattleShip(); //战舰

    private ArrayList<SeaObject> submarines = new ArrayList<>();
    private ArrayList<Mine> mines = new ArrayList<>();
    private ArrayList<Bomb> bombs = new ArrayList<>();

    /** 重写paint()画方法, World类主动调用
     * g:画笔-----------不要求掌握 */
    @Override
    public void paint(Graphics g){ //每次刷新,
        // 重画一次画布
        Images.sea.paintIcon(null,g,0,0); //画海洋图
        ship.paintImage(g); //画战舰

        for(SeaObject ele: submarines){ //遍历所有潜艇
            ele.paintImage(g); //画潜艇

        }
        for(Mine e: mines){ //遍历所有水雷
            e.paintImage(g); //画水雷

        }
        for(Bomb e: bombs){ //遍历所有深水炸弹
            e.paintImage(g); //画深水炸弹
        }

        g.drawString("Score: " +score, 200,50);
        g.drawString("LIFE: " +ship.getLife(), 400,50);
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

    /**
     * 开始运行方法
     */
    public void action(){
        KeyAdapter k=new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) { //键盘按压执行

                if (e.getKeyCode() == KeyEvent.VK_SPACE) {
                    Bomb obj = ship.shootBomb();
                    bombs.add(obj);
                }
                if (e.getKeyCode() == KeyEvent.VK_LEFT) {
                    ship.moveLeft();
                }
                if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
                    ship.moveRight();
                }
            }
        };

        /*KeyAdapter k=new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) { //当按键抬起时会自动执行
                if (e.getKeyCode()==KeyEvent.VK_SPACE) {
                    Bomb obj=ship.shootBomb();
                    bombs.add(obj);
                }
                if (e.getKeyCode()==KeyEvent.VK_LEFT){
                    ship.moveLeft();
                }
                if (e.getKeyCode()==KeyEvent.VK_RIGHT){
                    ship.moveRight();
                }
            }
        };*/

        this.addKeyListener(k);

        Timer timer=new Timer(); //定时器对象
        int interval=10; //时间间隔(毫秒)
        timer.schedule(new TimerTask() { //定义,新建了一个TimerTask的匿名内部类对象(它的派生类的对象)--向上构造,代码简洁
            @Override
            public void run() { //run方法代表没隔interval毫秒间隔要做的任务
                submarineEnterAction();
                mineEnterAction();
                moveAction();
                deleteAction();
                bombBangAction();
                MineBangAction();
                System.out.println(submarines.size() +" "+ bombs.size() +" "+ ship.getLife()); //检测有没有删除越界潜艇
                repaint(); //重画,重新调用paint方法
            }
        },interval,interval);
    }

    private void MineBangAction() {
        for (int i = 0; i < mines.size(); i++) {
            Mine m=mines.get(i);
            if (m.isLive() && m.isHit(ship)){
                m.goDead();
                ship.reduceLife();
            }
        }
    }

    private int score=0;
    private void bombBangAction() {
        for (int i = 0; i < bombs.size(); i++) {
            Bomb b= bombs.get(i);
            for (int j = 0; j < submarines.size(); j++) {
                SeaObject s=submarines.get(j);
                if (s.isLive() && s.isHit(b)){
                    s.goDead();
                    b.goDead();
                    //采用了类的多态性--适用于任何实现了某个接口的对象, 复用性和维护性良好, 也便于扩展
                    if (s instanceof EnemyLife) {
                        EnemyLife el=(EnemyLife) s;
                        ship.addLife(el.getLife());
                    }
                    if (s instanceof EnemyScore){
                        EnemyScore es=(EnemyScore) s;
                        score+=es.getScore();
                    }
                }
            }
        }
    }

    /**
     * 对象越界删除--防止数据过大及溢出
     */
    private void deleteAction() {//每10毫秒走一次
        for (int i = 0; i < submarines.size(); i++) {
            if ( submarines.get(i).isDead() || submarines.get(i).isOutOfBound()){
                submarines.remove(i);
            }
        }
        for (int i = 0; i < mines.size(); i++) {
            if (mines.get(i).isDead() || mines.get(i).isOutOfBound()){
                mines.remove(i);
            }
        }
        for (int i = 0; i < bombs.size(); i++) {
            if (bombs.get(i).isDead()  || bombs.get(i).isOutOfBound()){
                bombs.remove(i);
            }
        }
    }

    /**
     * 潜艇入场方法
     */
    private int subEnterIndex=0;
    public void submarineEnterAction() {
        subEnterIndex++;
        if (subEnterIndex%40==0){
            SeaObject obj=nextSubmarine();
            submarines.add(obj);

        }
    }

    /**
     * 鱼雷入场方法
     */
    private int mineENterIndex=0;
    public void mineEnterAction(){
        mineENterIndex++;
        if (mineENterIndex%100==0){
            for (int i = 0; i < submarines.size(); i++) {
                if (submarines.get(i) instanceof MineSubmarine) {
                    MineSubmarine obj=(MineSubmarine) submarines.get(i);
                    mines.add(obj.getMine());
                }
            }
        }
    }

    /**
     * 海类对象移动 方法
     */
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

    /*获得一个随机的潜艇--可以控制出现概率*/
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

}


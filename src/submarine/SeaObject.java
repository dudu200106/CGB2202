package submarine;

import javax.swing.ImageIcon;
import java.awt.Graphics;
import java.util.Random;

public abstract class SeaObject {
    //成员变量在哪个类中, 就在该类中设计构造方法给他们赋值
//    protected String name;
    protected int width;
    protected int height;
    protected int x;
    protected int y;
    protected int speed;

    public static final int LIVE=1;
    public static final int DIED=0;
    protected int state=LIVE;

    //父类里面设计的构造方法中, width和height是不固定的,不能写死;
    //而其余三个属性一致,可以不添加进父类的构造方法参数列表中
    public SeaObject(int width, int height){
        Random rand=new Random(); ///随机数对象
        this.width=width;//前面默认加上this.
        this.height=height;
        x=-width;
        y=rand.nextInt(World.WIDTH-height-150+1)+150; //150~窗口高度-潜艇-海平面+1
        speed=rand.nextInt(3)+1; //速度随机在1~3之间的数
    }

    public SeaObject(int width, int height, int x,int y, int speed){
        this.width=width;
        this.height=height;
        this.x=x;
        this.y=y;
        this.speed=speed;
    }

    public abstract void move();

    public abstract ImageIcon getImage();

    /** 对象是否活着*/
    public boolean isLive(){
        return state==LIVE;
    }

    /** 对象是否死了*/
    public boolean isDead(){
        return state==DIED;
    }

    /** 是否越界*/
    public boolean isOutOfBound(){
        return this.x>=World.WIDTH;
    }

    /**
     * 检测碰撞
     * @param other 传入的另一个海类对象
     * @return 是否碰撞
     */
    public boolean isHit(SeaObject other){
        //领空范围
        int x1=this.x-other.width;
        int y1=this.y-other.height;
        int x2=this.x+this.width;
        int y2=this.y+this.height;
        if (other.x>=x1 &&other.x<=x2)
            if (other.y>=y1 && other.y<=y2)
                return true;
        return false;
    }

    public void goDead(){
        state=DIED;
    }

    /** 画对象 g:画笔 */
    public void paintImage(Graphics g){
        if(this.isLive()){ //若活着的
            this.getImage().paintIcon(null,g,this.x,this.y);
        }
    }
}

package submarine;

import javax.swing.ImageIcon;

public class Images {
    public static ImageIcon batteship;
    public static ImageIcon obsersubm;
    public static ImageIcon torpesubm;
    public static ImageIcon minesubm;
    public static ImageIcon mine;
    public static ImageIcon bomb;
    public static ImageIcon sea;
    public static ImageIcon gameover;

    static {//初始化静态图片
        batteship=new ImageIcon("image/battleship.png");
        obsersubm =new ImageIcon("image/obsersubm.png");
        torpesubm=new ImageIcon("image/torpesubm.png");
        minesubm=new ImageIcon("image/minesubm.png");
        mine=new ImageIcon("image/mine.png");
        bomb=new ImageIcon("image/bomb.png");
        sea=new ImageIcon("image/sea.png");
        gameover=new ImageIcon("image/gameover.png");
    }

    public static void main(String[] args) {
        System.out.println(batteship.getImageLoadStatus());
        System.out.println(obsersubm.getImageLoadStatus());
        System.out.println(torpesubm.getImageLoadStatus());
        System.out.println(minesubm.getImageLoadStatus());
        System.out.println(mine.getImageLoadStatus());
        System.out.println(bomb.getImageLoadStatus());
        System.out.println(sea.getImageLoadStatus());
        System.out.println(gameover.getImageLoadStatus());
    }
}

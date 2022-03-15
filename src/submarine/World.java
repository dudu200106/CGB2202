package submarine;

//import javax.swing.*;  不建议全部导入,加载时效率低
import javax.swing.JFrame;
import javax.swing.JPanel;

public class World extends JPanel{

    public static final int WIDTH=641; //窗口的宽
    public static final int HEIGHT=479; //窗口的高

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


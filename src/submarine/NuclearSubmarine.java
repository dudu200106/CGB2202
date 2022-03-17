package submarine;

import javax.swing.*;

public class NuclearSubmarine extends SeaObject implements EnemyLife,EnemyScore{
    public NuclearSubmarine(int width, int height) {
        super(width, height);
    }

    @Override
    public void move() {

    }

    @Override
    public ImageIcon getImage() {
        return null;
    }

    @Override
    public int getLife() {
        return 0;
    }

    @Override
    public int getScore() {
        return 0;
    }
}

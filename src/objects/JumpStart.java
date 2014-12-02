package objects;

/**
 * Created by jackrosenhauer on 12/1/14.
 */
public class JumpStart extends Jump {
    int watch;

    public JumpStart() {

    }

    public JumpStart(int id, int x, int y, int width, int height, String name, int bits, String orientation, int watch) {
        super(id, x, y, width, height, name, bits, orientation);
        this.watch = watch;
    }

    public int getWatch() {
        return watch;
    }

    public void setWatch(int watch) {
        this.watch = watch;
    }
}

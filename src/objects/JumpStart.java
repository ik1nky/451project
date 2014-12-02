package objects;

/**
 * Created by jackrosenhauer on 12/1/14.
 */
public class JumpStart extends JLSElement {
    int id;
    int x;
    int y;
    int width;
    int heigh;
    String name;
    int bits;
    int watch;
    String orientation;

    public JumpStart() {

    }

    public JumpStart(int id, int x, int y, int width, int heigh, String name, int bits, int watch, String orientation) {
        this.id = id;
        this.x = x;
        this.y = y;
        this.width = width;
        this.heigh = heigh;
        this.name = name;
        this.bits = bits;
        this.watch = watch;
        this.orientation = orientation;
    }
}

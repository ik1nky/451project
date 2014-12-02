package objects;

/**
 * Created by jackrosenhauer on 12/1/14.
 */
public class JumpEnd extends JLSElement {
    int id;
    int x;
    int y;
    int width;
    int heigh;
    String name;
    int bits;
    String orientation;

    public JumpEnd() {

    }

    public JumpEnd(int id, int x, int y, int width, int heigh, String name, int bits, String orientation) {
        this.id = id;
        this.x = x;
        this.y = y;
        this.width = width;
        this.heigh = heigh;
        this.name = name;
        this.bits = bits;
        this.orientation = orientation;
    }
}

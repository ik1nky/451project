package objects;

/**
 * Created by jackrosenhauer on 12/1/14.
 */
public class OutputPin extends JLSElement {
    String name;
    int bits;
    int watch;
    String orient;

    public OutputPin() {
    }

    public OutputPin(int id, int x, int y, int width, int height, String name, int bits, int watch, String orient) {
        super(id, x, y, width, height);
        this.name = name;
        this.bits = bits;
        this.watch = watch;
        this.orient = orient;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBits() {
        return bits;
    }

    public void setBits(int bits) {
        this.bits = bits;
    }

    public int getWatch() {
        return watch;
    }

    public void setWatch(int watch) {
        this.watch = watch;
    }

    public String getOrient() {
        return orient;
    }

    public void setOrient(String orient) {
        this.orient = orient;
    }
}

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

    public String toString() {
        return ("ELEMENT OutputPin\n"
                + " int id " + id + "\n"
                + " int x " + x + "\n"
                + " int y " + y + "\n"
                + " int width " + width + "\n"
                + " int height " + height + "\n"
                + " String name " + name + "\n"
                + " int bits " + bits + "\n"
                + " int watch " + watch + "\n"
                + " String orient " + orient + "\n"
                + "END\n"
        );
    }
}
/*
ELEMENT OutputPin
 int id 14
 int x 372
 int y 84
 int width 60
 int height 24
 String name "Output"
 int bits 1
 int watch 0
 String orient "RIGHT"
END
*/
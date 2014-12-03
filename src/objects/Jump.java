package objects;

/**
 * Created by jacksrosenhauerii on 12/1/14.
 */
public class Jump extends JLSElement {
    String name;
    int bits;
    String orientation;


    public Jump() {
    }

    public Jump(String name, int bits, String orientation) {
        this.name = name;
        this.bits = bits;
        this.orientation = orientation;
    }

    public Jump(int id, int x, int y, int width, int height, String name, int bits, String orientation) {
        super(id, x, y, width, height);
        this.name = name;
        this.bits = bits;
        this.orientation = orientation;
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

    public String getOrientation() {
        return orientation;
    }

    public void setOrientation(String orientation) {
        this.orientation = orientation;
    }
}


/*
ELEMENT JumpStart
 int id 20
 int x 84
 int y 36
 int width 60
 int height 0
 String name "InputB"
 int bits 1
 int watch 0
 String orientation "LEFT"
END

ELEMENT JumpEnd
 int id 22
 int x 264
 int y 60
 int width 60
 int height 0
 String name "InputA"
 int bits 1
 String orientation "RIGHT"
END
 */
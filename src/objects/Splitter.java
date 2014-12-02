package objects;

import java.util.ArrayList;

/**
 * Created by jackrosenhauer on 12/1/14.
 */
public class Splitter extends JLSElement {
    int bits;
    String orient;
    String noncontig;
    int tristate;

    public Splitter() {
    }

    public Splitter(int id, int x, int y, int width, int height, int bits, String orient, String noncontig, int tristate) {
        super(id, x, y, width, height);
        this.bits = bits;
        this.orient = orient;
        this.noncontig = noncontig;
        this.tristate = tristate;
    }

    public int getBits() {
        return bits;
    }

    public void setBits(int bits) {
        this.bits = bits;
    }

    public String getOrient() {
        return orient;
    }

    public void setOrient(String orient) {
        this.orient = orient;
    }

    public String getNoncontig() {
        return noncontig;
    }

    public void setNoncontig(String noncontig) {
        this.noncontig = noncontig;
    }

    public int getTristate() {
        return tristate;
    }

    public void setTristate(int tristate) {
        this.tristate = tristate;
    }
}

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
    ArrayList<Pair> pairs;

    public Splitter() {
        pairs = new ArrayList<>();
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

    public ArrayList<Pair> getPairs() {
        return pairs;
    }

    public void setPairs(ArrayList<Pair> pairs) {
        this.pairs = pairs;
    }

    public void addPair(int x, int y){
        Pair p = new Pair(x, y);
        pairs.add(p);
    }

    public Boolean removePair(int x, int y){
        Pair p = new Pair(x, y);
        if (pairs.contains(p)){
            pairs.remove(p);
            return true;
        }
        return false;
    }

    public String toString() {
        String pairsString = "";
        for(Pair p : pairs) {
            pairsString += " " + p.toString() + "\n";
        }
        return ("ELEMENT Splitter\n"
                + " int id " + id + "\n"
                + " int x " + x + "\n"
                + " int y " + y + "\n"
                + " int width " + width + "\n"
                + " int height " + height + "\n"
                + " int bits " + bits + "\n"
                + " String orient " + orient + "\n"
                + " String noncontig " + noncontig + "\n"
                + " int tristate " + tristate + "\n"
                + pairsString
                + "END\n"
        );
    }
}

/*
ELEMENT Splitter
 int id 4
 int x 60
 int y 12
 int width 24
 int height 60
 int bits 4
 String orient "RIGHT"
 String noncontig "true"
 int tristate 0
 pair 0 0
 pair 1 1
 pair 2 2
 pair 3 3
END
 */

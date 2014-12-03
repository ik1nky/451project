package objects;

import objects.JLSElement;

public class InputPin extends JLSElement {
    String name;
    int bits;
    int watch;
    String orient;

    public InputPin() {
    }

    public InputPin(int id, int x, int y, int width, int height, String name, int bits, int watch, String orient) {
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

    //int watch = 0  assumed
    //String orient = "RIGHT" assumed


    public String toString(){
        return ("ELEMENT InputPin\n"
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

        /*ELEMENT InputPin
 int id 15
 int x 12
 int y 24
 int width 48
 int height 24
 String name "Input"
 int bits 4
 int watch 0
 String orient "RIGHT"
END*/
    }
}

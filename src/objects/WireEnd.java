package objects;

import java.util.ArrayList;

public class WireEnd extends JLSElement {
    String put = null;
    ArrayList<Integer> attach;
    ArrayList<Integer> wire;

    public WireEnd() {
        attach = new ArrayList<Integer>();
        wire = new ArrayList<Integer>();
    }

    public String getPut() {
        return put;
    }

    public void setPut(String put) {
        this.put = put;
    }

    public ArrayList<Integer> getAttach() {
        return attach;
    }

    public void setAttach(ArrayList<Integer> attach) {
        this.attach = attach;
    }

    public ArrayList<Integer> getWire() {
        return wire;
    }

    public void setWire(ArrayList<Integer> wire) {
        this.wire = wire;
    }

    public void addWire(int wireId) {
        wire.add(wireId);
    }

    public void removeWire(int wireId) {
        for (Integer id : this.wire) {
            if (id == wireId) {
                wire.remove(id);
            }
        }
    }

    public void addAttach(int wireId) {
        //System.out.println("Adding attach: " + wireId);
        wire.add(wireId);
    }

    public void removeAttach(int wireId) {
        for (Integer id : this.wire) {
            if (id == wireId) {
                attach.remove(id);
            }
        }
    }

    public String toString(){

        return ( "ELEMENT WireEnd\n"
                + " int id " + id + "\n"
                + " int x " + x + "\n"
                + " int y " + y + "\n"
                + " int width " + width + "\n"
                + " int height " + height + "\n"
                + " String put " + put + "\n"
                + " ref attach " + attach + "\n"
                + " ref wire " + wire + "\n"
                + "END\n"
        );
    }
}


/*
ELEMENT WireEnd
 int id 6
 int x 84
 int y 60
 int width 6
 int height 6
 String put "3"
 ref attach 4
 ref wire 7
END
 */
package objects;

import java.util.ArrayList;

/**
 * Created by jacksrosenhauerii on 12/1/14.
 */
public class Wire extends JLSElement {
    String put = null;
    ArrayList<Integer> attach;
    ArrayList<Integer> wire;



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

    public void addWire(int wireId){
        wire.add(wireId);
    }

    public void removeWire(int wireId){
        for (Integer id : this.wire){
            if (id == wireId){
                wire.remove(id);
            }
        }
    }

    public void addAttach(int wireId){
        wire.add(wireId);
    }

    public void removeAttach(int wireId){
        for (Integer id : this.wire){
            if (id == wireId){
                attach.remove(id);
            }
        }
    }

}

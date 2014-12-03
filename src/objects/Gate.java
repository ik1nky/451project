package objects;

/**
 * Created by jacksrosenhauerii on 12/1/14.
 */
public class Gate extends JLSElement {

    int bits;
    int numInputs;
    String orientation;
    int delay;


    public Gate() {

    }

    public Gate(int id, int x, int y, int width, int height, int bits, int numInputs, String orientation, int delay) {
        super(id, x, y, width, height);
        this.bits = bits;
        this.numInputs = numInputs;
        this.orientation = orientation;
        this.delay = delay;
    }

    public int getBits() {
        return bits;
    }

    public void setBits(int bits) {
        this.bits = bits;
    }

    public int getNumInputs() {
        return numInputs;
    }

    public void setNumInputs(int numInputs) {
        this.numInputs = numInputs;
    }

    public String getOrientation() {
        return orientation;
    }

    public void setOrientation(String orientation) {
        this.orientation = orientation;
    }

    public int getDelay() {
        return delay;
    }

    public void setDelay(int delay) {
        this.delay = delay;
    }

    public String toString() {
        return ("ELEMENT " + this.getClass().getSimpleName() + "\n"
                + " int id " + id + "\n"
                + " int x " + x + "\n"
                + " int y " + y + "\n"
                + " int width " + width + "\n"
                + " int height " + height + "\n"
                + " int bits " + bits + "\n"
                + " int numInputs " + numInputs + "\n"
                + " String orientation " + orientation + "\n"
                + " int delay " + delay + "\n"
                + "END\n"
        );
    }
}

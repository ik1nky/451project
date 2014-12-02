package objects;

public class NorGate extends Gate {

    int id;
    int x;
    int y;
    int width;
    int height;
    int bits;
    int numInputs;
    String orientation;
    int delay;

    public NorGate() {
    }

    public String toString() {
        return "ELEMENT NorGate\n" + super.toString();
    }
}
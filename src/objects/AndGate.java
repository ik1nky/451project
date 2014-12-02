package objects;

public class AndGate extends Gate {
    public AndGate(int id, int x, int y, int width, int height, int bits, int numInputs, String orientation, int delay) {
        super(id, x, y, width, height, bits, numInputs, orientation, delay);
    }

    public AndGate() {

    }

    public String toString() {
        return "ELEMENT AndGate\n" + super.toString();
    }
}

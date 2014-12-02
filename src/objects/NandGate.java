package objects;

public class NandGate extends Gate
{
	public NandGate(){

	}

	public NandGate(int id, int x, int y, int width, int height, int bits, int numInputs, String orientation, int delay) {
		super(id, x, y, width, height, bits, numInputs, orientation, delay);
	}

	public String toString(){
		return "ELEMENT NandGate\n" + super.toString();
	}
}

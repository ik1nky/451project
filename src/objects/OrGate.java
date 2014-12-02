package objects;

public class OrGate  extends Gate
{
	//Variables assumed
	int id;
	int x;
	int y;
	int width;
	int height;
	int bits;
	int numInputs;
	String orientation;
	int delay;

	public OrGate() {
	}

	public String toString(){
		return "ELEMENT OrGate\n" + super.toString();
	}
}

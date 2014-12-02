package objects;

import objects.JLSElement;

public class NotGate extends Gate
{
	//variables assumed
	int id;
	int x;
	int y;
	int width;
	int height;
	int bits;
	int numInputs;
	String orientation;
	int delay;

	public NotGate() {
	}

	public String toString(){
		return "ELEMENT NotGate\n" + super.toString();
	}

}

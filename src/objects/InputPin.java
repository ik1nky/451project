package objects;

import objects.JLSElement;

public class InputPin extends JLSElement
{
	int id;
	int x;
	int y;
	int width;
	String name;
	int bits;
	int watch;
	String orient;

	public InputPin() {
	}

	public InputPin(int id, int x, int y, int width, String name, int bits, int watch, String orient) {
		this.id = id;
		this.x = x;
		this.y = y;
		this.width = width;
		this.name = name;
		this.bits = bits;
		this.watch = watch;
		this.orient = orient;
	}

	//int watch = 0  assumed
	 //String orient = "RIGHT" assumed
}

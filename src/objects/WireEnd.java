package objects;

import java.util.ArrayList;

public class WireEnd extends JLSElement
{
	int id;
	int x;
	int y;
	int width;
	int heigh;
	ArrayList<Integer> refWires;

	public ArrayList<Integer> getRefWires() {
		return refWires;
	}

	public void setRefWires(ArrayList<Integer> refWires) {
		this.refWires = refWires;
	}

	public void addRefWire(int ref){
		refWires.add(ref);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeigh() {
		return heigh;
	}

	public void setHeigh(int heigh) {
		this.heigh = heigh;
	}



}

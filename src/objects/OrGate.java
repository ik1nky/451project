package objects;

public class OrGate  extends JLSElement
{
	//Variables assumed
	int id;
	int x;
	int y;
	int width;
	int heigh;
	int bits;
	int numInputs;
	String orientation;
	int delay;


	protected String printObject()
	{
		return (  "ELEMENT OrGate\n"
				+ " int id " + id + "\n"
				+ " int x " + x + "\n"
				+ " int y " + y + "\n"
				+ " int width " + width + "\n"
				+ " int height " + height + "\n"
				+ " int bits 1\n"
				+ " int numInputs 2\n"
				+ " String orientation \"right\"\n"
				+ " int delay 10\n"
				+ "END\n"
				);
	}
}

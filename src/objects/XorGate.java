package objects;

public class XorGate  extends JLSElement
{
	//variables assumed
	
	protected String printObject()
	{
		return (  "ELEMENT XorGate\n"
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

package objects;

/**
 * Created by jackrosenhauer on 12/1/14.
 */
public class JumpEnd extends Jump {

    public JumpEnd() {

    }

    public JumpEnd(int id, int x, int y, int width, int height, String name, int bits, String orientation) {
        super(id, x, y, width, height, name, bits, orientation);
    }

    public String toString(){
        return ("ELEMENT JumpEnd\n"
                + " int id " + id + "\n"
                + " int x " + x + "\n"
                + " int y " + y + "\n"
                + " int width " + width + "\n"
                + " int height " + height + "\n"
                + " String name " + name + "\n"
                + " int bits " + bits + "\n"
                + " String orientation " + orientation + "\n"
                + "END\n"
        );
    }
}


/*
ELEMENT JumpEnd
 int id 22
 int x 264
 int y 60
 int width 60
 int height 0
 String name "InputA"
 int bits 1
 String orientation "RIGHT"
END
 */
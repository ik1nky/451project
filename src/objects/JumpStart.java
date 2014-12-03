package objects;

/**
 * Created by jackrosenhauer on 12/1/14.
 */
public class JumpStart extends Jump {
    int watch;

    public JumpStart() {

    }

    public JumpStart(int id, int x, int y, int width, int height, String name, int bits, String orientation, int watch) {
        super(id, x, y, width, height, name, bits, orientation);
        this.watch = watch;
    }

    public int getWatch() {
        return watch;
    }

    public void setWatch(int watch) {
        this.watch = watch;
    }

    public String toString(){
        return ("ELEMENT JumpStart\n"
                + " int id " + id + "\n"
                + " int x " + x + "\n"
                + " int y " + y + "\n"
                + " int width " + width + "\n"
                + " int height " + height + "\n"
                + " String name " + name + "\n"
                + " int bits " + bits + "\n"
                + " int watch " + watch + "\n"
                + " String orientation " + orientation + "\n"
                + "END\n"
        );
    }
}


/*
ELEMENT JumpStart
 int id 20
 int x 84
 int y 36
 int width 60
 int height 0
 String name "InputB"
 int bits 1
 int watch 0
 String orientation "LEFT"
END
*/
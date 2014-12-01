package objects;

import java.util.ArrayList;

/**
 * Created by jackrosenhauer on 12/1/14.
 */
public class Splitter {
    int id;
    int x;
    int y;
    int width;
    int height;
    int bits;
    String orient;
    String noncontig;
    int tristate;
    ArrayList<Pair> pairs = new ArrayList<Pair>();

    Splitter(){
    }
}

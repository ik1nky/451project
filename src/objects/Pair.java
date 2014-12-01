package objects;

/**
 * Created by jackrosenhauer on 12/1/14.
 */
public class Pair {
    int x;
    int y;

    Pair(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString(){
        return ("pair " + x + " " + y);
    }
}

import objects.JLSElement;

import java.util.Hashtable;

/**
 * Created by jacksrosenhauerii on 12/2/14.
 */
public class Saver {
    public static boolean save(Hashtable hashtable){


        for (Object id : hashtable.keySet()){
            System.out.println(hashtable.get(id).getClass().getSimpleName());
        }

        return true;
    }
}

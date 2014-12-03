import objects.JLSElement;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Hashtable;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 * Created by jacksrosenhauerii on 12/2/14.
 */
public class Saver {
    public static boolean save(Hashtable hashtable, String circuitName, String filename){
        System.out.println("Saving " + circuitName + " in the file " + filename);
        try {
            ZipOutputStream out = new ZipOutputStream(new FileOutputStream(filename));
            out.putNextEntry(new ZipEntry("JLSCircuit"));
            PrintWriter output = new PrintWriter(out);



            output.println("CIRCUIT " + circuitName);

            for (Object id : hashtable.keySet()){
                output.println(hashtable.get(id));
            }

            output.println("ENDCIRCUIT");
            output.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return true;
    }
}

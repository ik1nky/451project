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
    public static boolean save(Hashtable hashtable, String circuitName, String filename, String path){
        System.out.println("Saving " + circuitName + " in the file " + filename + ". Path: " + path + ".");

        try {
            ZipOutputStream out = new ZipOutputStream(new FileOutputStream(path + "test"));
            out.putNextEntry(new ZipEntry("JLSCircuit"));
            PrintWriter output = new PrintWriter(out);

            output.println("CIRCUIT " + circuitName);

            for (Object id : hashtable.keySet()){
                output.print(hashtable.get(id).toString());
            }

            output.print("ENDCIRCUIT");
            output.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return true;
    }
}

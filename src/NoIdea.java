import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.*;

/**
 * Created by jackrosenhauer on 12/2/14.
 */
public class NoIdea {
    /*
    public static void main(String[] args){
        String iHateYou = "Test/ourScript.bash";
        String[] myArray = {"/bin/sh", "-c", "Test/jlsCircuitTester -m 451 Files/fuck.jls Test/umm | grep \"Errors detected\" | awk -F\"-\" '{print $2}' | awk -F\":\" '{print $1}'"};
        try {
            Runtime rt = Runtime.getRuntime();
            Process p = rt.exec(myArray);
            BufferedReader stdInput = new BufferedReader(new InputStreamReader(p.getInputStream()));

            String s = null;
            String temp[] = new String[100];
            int i = 0;
            while ((s = stdInput.readLine()) != null){
                //System.out.println(s);
                temp[i] = s;
                i++;
            }
            //System.out.println(Runtime.getRuntime().exec(iHateYou).getOutputStream().toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    */
    public static void main(String[] args) {

    }

    public String[] getTruthTable(){
        String iHateYou = "Test/ourScript.bash";
        String[] myArray = {"/bin/sh", "-c", "Test/jlsCircuitTester -m 451 Files/fuck.jls Test/umm | grep \"Errors detected\" | awk -F\"-\" '{print $2}' | awk -F\":\" '{print $1}'"};
        String temp[] = new String[100];
        try {
            Runtime rt = Runtime.getRuntime();
            Process p = rt.exec(myArray);
            BufferedReader stdInput = new BufferedReader(new InputStreamReader(p.getInputStream()));

            String s = null;

            int i = 0;
            while ((s = stdInput.readLine()) != null){
                //System.out.println(s);
                temp[i] = s;
                i++;
            }
            //System.out.println(Runtime.getRuntime().exec(iHateYou).getOutputStream().toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return temp;
    }
}
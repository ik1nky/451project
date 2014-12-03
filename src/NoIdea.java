import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by jackrosenhauer on 12/2/14.
 */
public class NoIdea {
    public static void main(String[] args){
        String iHateYou = "/Users/jacksrosenhauerii/Dropbox/Git/451project/Test/ourScript.bash";
        String[] myArray = {"/bin/sh", "-c", "Test/jlsCircuitTester -m 451 Files/fuck.jls Test/umm | grep \"Errors detected\" | awk -F\"-\" '{print $2}' | awk -F\":\" '{print $1}'"};
        try {
            Runtime rt = Runtime.getRuntime();
            Process p = rt.exec(myArray);
            BufferedReader stdInput = new BufferedReader(new InputStreamReader(p.getInputStream()));

            String s = null;

            while ((s = stdInput.readLine()) != null){
                System.out.println(s);
            }

            //System.out.println(Runtime.getRuntime().exec(iHateYou).getOutputStream().toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
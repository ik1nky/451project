import edu.gvsu.cis.kurmasz.jls.JLSCircuitTester;

import java.io.*;
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

        // Create a stream to hold the output
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        // IMPORTANT: Save the old System.out!
        PrintStream old = System.out;
        // Tell Java to use your special stream
        System.setOut(ps);
        // Print some output: goes to your special stream
        JLSCircuitTester.main(new String[] {"-m" , "451", "Files/fuck.jls", "Test/umm"});
        // Put things back
        System.out.flush();
        System.setOut(old);
        // Show what happened
        System.out.println("Here: " + baos.toString());

    }

    public static String[] getTruthTable(String circuitFilename, String testFilename){
        System.out.println(circuitFilename + " --- " + testFilename);
        //circuitFilename = "Files/fuck.jls";
        //testFilename = "Test/umm";
        //String iHateYou = "Test/ourScript.bash";
        //String[] myArray = {"/bin/sh", "-c", "Test/jlsCircuitTester -m 451 Files/fuck.jls Test/umm | grep \"Errors detected\" | awk -F\"-\" '{print $2}' | awk -F\":\" '{print $1}'"};
        String[] myArray = {"/bin/sh", "-c", "Test/jlsCircuitTester -m 451 " + circuitFilename + " " + testFilename + " | grep \"Errors detected\" | awk -F\"-\" '{print $2}' | awk -F\":\" '{print $1}'"};

        String temp[] = new String[100];
        try {
            Runtime rt = Runtime.getRuntime();
            Process p = rt.exec(myArray);
            BufferedReader stdInput = new BufferedReader(new InputStreamReader(p.getInputStream()));

            String s = null;

            int i = 0;
            while ((s = stdInput.readLine()) != null){
                System.out.println(s);
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
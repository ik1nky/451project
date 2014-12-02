import com.sun.tools.doclets.internal.toolkit.util.DocFinder;
import objects.*;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Scanner;
import java.util.zip.Inflater;
import java.util.zip.ZipInputStream;

/**
 * Created by jackrosenhauer on 11/30/14.
 */
public class Loader extends JPanel implements ActionListener {

    ArrayList<JLSElement> elements = new ArrayList<JLSElement>();
    Hashtable<Integer, JLSElement> hashTable = new Hashtable<Integer, JLSElement>();
    public Loader(){
        JFileChooser fc = new JFileChooser(".");
        JFrame main = new JFrame();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("JLS Files", new String[]{"jls"});
        fc.setFileFilter(filter);
        int returnValue = fc.showOpenDialog(main);
        if (returnValue == 0){
            File file;
            String filename;
            String circName;
            try {

                file = fc.getSelectedFile();
                filename = file.getName().trim();
                FileInputStream input = new FileInputStream(file);
                ZipInputStream circ = new ZipInputStream(input);

                Object in = null;
                if (circ.getNextEntry() == null){
                    input.close();
                    in = new FileInputStream(file);
                }else{
                    in = circ;
                }

                Scanner scan = new Scanner((InputStream) in);
                if (!scan.next().equals("CIRCUIT")){
                    System.out.println("invalid header");
                    System.exit(1);
                }else {

                    circName = scan.next();

                    System.out.println("Circuit Name: " + circName);
                    while (scan.next().equals("ELEMENT")) {
                        //System.out.println(scan.nextLine());
                        String componentType = scan.next();
                        JLSElement element = getTypeObject(componentType);
                        System.out.println("Class: " + element.getClass());
                        String token;

                        while (!(token = scan.next()).equals("END")) {
                            String dataType = token;
                            String name = scan.next();
                            String value = scan.next();

                            switch (dataType){
                                case "pair":
                                    System.out.println("Setup a pair...");

                            }

                            switch (name.toLowerCase()){
                                case "id":
                                    element.setId(Integer.parseInt(value));
                                case "x":
                                    element.setX(Integer.parseInt(value));
                                case "y":
                                    element.setY(Integer.parseInt(value));
                                case "width":
                                    element.setWidth(Integer.parseInt(value));
                                case "height":
                                    element.setHeight(Integer.parseInt(value));
                                case "name":
                                    switch (componentType){
                                        case "InputPin":
                                            ((InputPin) element).setName(value);
                                        case "OutputPin":
                                            ((OutputPin) element).setName(value);
                                        case "JumpStart":
                                            ((JumpStart) element).setName(value);
                                        case "JumpEnd":
                                            ((JumpEnd) element).setName(value);
                                        default:
                                            System.out.println("Error when parsing name var: " + componentType);
                                            System.exit(2);
                                    }
                                case "bits":
                                    //splitter, jumpstart, jumpend, outputpin, inputpin,
                                    switch (componentType){
                                        case "InputPin":
                                            ((InputPin) element).setBits(Integer.parseInt(value));
                                        case "OutputPin":
                                            ((OutputPin) element).setBits(Integer.parseInt(value));
                                        case "JumpStart":
                                            ((JumpStart) element).setBits(Integer.parseInt(value));
                                        case "JumpEnd":
                                            ((JumpEnd) element).setBits(Integer.parseInt(value));
                                        case "Splitter":
                                            ((Splitter) element).setBits(Integer.parseInt(value));
                                        default:
                                            System.out.println("Error when parsing bits var: " + componentType);
                                            System.exit(2);
                                    }
                                case "delay":
                                    ((Gate) element).setDelay(Integer.parseInt(value));
                                case "orientation":
                                    if (element instanceof Gate){
                                        ((Gate) element).setOrientation(value);
                                    }else if (element instanceof Jump){
                                        ((Jump) element).setOrientation(value);
                                    }
                                case "numinputs":
                                    ((Gate) element).setNumInputs(Integer.parseInt(value));
                                case "tristate":
                                    ((Splitter) element).setTristate(Integer.parseInt(value));
                                case "noncontig":
                                    ((Splitter) element).setNoncontig(value);
                                case "orient":
                                    if (element instanceof Splitter) {
                                        ((Splitter) element).setOrient(value);
                                    }else if (element instanceof InputPin){
                                        ((InputPin) element).setOrient(value);
                                    }else if (element instanceof OutputPin){
                                        ((OutputPin) element).setOrient(value);
                                    }else{
                                        System.out.println("Error when parsing orient var: " + componentType);
                                    }
                                case "put":
                                    ((WireEnd) element).setPut(value);
                                case "ref":
                                    if (name.equals("attach")){
                                        ((WireEnd) element).addAttach(Integer.parseInt(value));
                                    }else if (name.equals("wire")) {
                                        ((WireEnd) element).addWire(Integer.parseInt(value));
                                    }

                                default:
                                    System.out.println("Problem parsing element. Component type: " + componentType + ", data type: " + dataType + ", name: " + name + " and value: " + value + ".");
                                    System.exit(3);

                            }

                        }
                    }
                }

            } catch (Exception e){
                e.printStackTrace();
            }
        }else{
            System.out.println("Something went wrong");
        }
    }

    public JLSElement getTypeObject(String type){
        if (type.equals("AndGate")){
            return new objects.AndGate();
        }else if (type.equals("InputPin")){
            return new objects.InputPin();
        }else if (type.equals("JumpEnd")){
            return new objects.JumpEnd();
        }else if (type.equals("JumpStart")){
            return new objects.JumpStart();
        }else if (type.equals("NandGate")){
            return new objects.NandGate();
        }else if (type.equals("NorGate")){
            return new objects.NorGate();
        }else if (type.equals("NotGate")){
            return new objects.NotGate();
        }else if (type.equals("OrGate")){
            return new objects.OrGate();
        }else if (type.equals("OutputPin")){
            return new objects.OutputPin();
        }else if (type.equals("Splitter")){
            return new objects.Splitter();
        }else if (type.equals("WireEnd")){
            return new objects.WireEnd();
        }else if (type.equals("XorGate")){
            return new objects.XorGate();
        }else{
            return null;
        }
    }

    public JLSElement processTokens(String type, Scanner scan){

        return null;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}

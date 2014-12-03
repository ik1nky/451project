import objects.Gate;
import objects.JLSElement;

import objects.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.Hashtable;


/**
 * Created by jackrosenhauer on 11/30/14.
 */
public class Main extends JPanel implements ActionListener {

    public static void main(String[] args) {
        //input the file....


        Loader l = new Loader();
        Hashtable table = l.load();


        /*
        System.out.println(table.size());
        System.out.println(table.get(0).toString());

        WireEnd w = (WireEnd) table.get(0);
        System.out.println(w.getAttach());
        System.out.println(w.getWire());
        */

        Saver s = new Saver();

        try {
            s.save(table, l.getCircuitName(), "test" + l.getFilename(), l.getFile().getCanonicalPath());
        } catch (IOException e) {
            e.printStackTrace();
        }

        Main test = new Main();

        Hashtable random = test.randomizer(table);

        try {
            s.save(random, l.getCircuitName(), "test" + l.getFilename(), l.getFile().getCanonicalPath() + "LULZ");
        } catch (IOException e) {
            e.printStackTrace();
        }

        */
        Main test = new Main();
        System.out.println(test.getNumberOfInputs(table));
        //test.truthTable(test.getNumberOfInputs(table));
        System.exit(0);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }



    public int getNumberOfInputs(Hashtable table) {
        int count = 0;
        for (Object id : table.keySet()) {
            JLSElement e = (JLSElement) table.get(id);
            //String name = e.getElementName();
            if (e.getElementName().toLowerCase().equals("inputpin")) {
                count += ((InputPin) e).getBits();
            }
        }
        return count;
    }



    public void truthTable(int num) {
        NoIdea idea = new NoIdea();

        String ary[] = idea.getTruthTable();
        String table = "";
        switch(num) {
            case 2:
                table += "Bits\na b    Output\n";
                int j = 0;
                for(int k = 0; k < 4; k++) {
                    if (j <= ary.length - 1 && ary[j] != null) {
                        if (Integer.parseInt(ary[j]) != k) {
                            int binary[] = new int[25];
                            int index = 0;
                            int tempint = k;
                            while (tempint > 0) {
                                binary[index++] = tempint % 2;
                                tempint = tempint / 2;
                            }
                            for (int d = 1; d >= 0; d--) {
                                table += binary[d] + " ";
                            }
                            table += "   0\n";
                        }
                        else {
                            int binary[] = new int[25];
                            int index = 0;
                            int tempint = Integer.parseInt(ary[j]);
                            while (tempint > 0) {
                                binary[index++] = tempint % 2;
                                tempint = tempint / 2;
                            }
                            for (int d = 1; d >= 0; d--) {
                                table += binary[d] + " ";
                            }
                            table += "   1\n";
                            j++;
                        }
                    }
                    else {
                        int binary[] = new int[25];
                        int index = 0;
                        int tempint = k;
                        while (tempint > 0) {
                            binary[index++] = tempint % 2;
                            tempint = tempint / 2;
                        }
                        for (int d = 1; d >= 0; d--) {
                            table += binary[d] + " ";
                        }
                        table += "   0\n";
                    }
                }
                break;

            case 3:
                table += "Bits\na b c    Output\n";
                int l = 0;
                for(int k = 0; k < 8; k++) {
                    if (l <= ary.length - 1 && ary[l] != null) {
                        if (Integer.parseInt(ary[l]) != k) {
                            int binary[] = new int[25];
                            int index = 0;
                            int tempint = k;
                            while (tempint > 0) {
                                binary[index++] = tempint % 2;
                                tempint = tempint / 2;
                            }
                            for (int d = 2; d >= 0; d--) {
                                table += binary[d] + " ";
                            }
                            table += "     0\n";
                        }
                        else {
                            int binary[] = new int[25];
                            int index = 0;
                            int tempint = Integer.parseInt(ary[l]);
                            while (tempint > 0) {
                                binary[index++] = tempint % 2;
                                tempint = tempint / 2;
                            }
                            for (int d = 2; d >= 0; d--) {
                                table += binary[d] + " ";
                            }
                            table += "     1\n";
                            l++;
                        }
                    }
                    else {
                        int binary[] = new int[25];
                        int index = 0;
                        int tempint = k;
                        while (tempint > 0) {
                            binary[index++] = tempint % 2;
                            tempint = tempint / 2;
                        }
                        for (int d = 2; d >= 0; d--) {
                            table += binary[d] + " ";
                        }
                        table += "     0\n";
                    }
                }
                break;

            case 4:
                table += "Bits\na b c d    Output\n";

                int m = 0;
                for(int k = 0; k < 16; k++) {
                    if (m <= ary.length - 1 && ary[m] != null) {
                        if (Integer.parseInt(ary[m]) != k) {
                            int binary[] = new int[25];
                            int index = 0;
                            int tempint = k;
                            while (tempint > 0) {
                                binary[index++] = tempint % 2;
                                tempint = tempint / 2;
                            }
                            for (int d = 3; d >= 0; d--) {
                                table += binary[d] + " ";
                            }
                            table += "       0\n";
                        }
                        else {
                            int binary[] = new int[25];
                            int index = 0;
                            int tempint = Integer.parseInt(ary[m]);
                            while (tempint > 0) {
                                binary[index++] = tempint % 2;
                                tempint = tempint / 2;
                            }
                            for (int d = 3; d >= 0; d--) {
                                table += binary[d] + " ";
                            }
                            table += "       1\n";
                            m++;
                        }
                    }
                    else {
                        int binary[] = new int[25];
                        int index = 0;
                        int tempint = k;
                        while (tempint > 0) {
                            binary[index++] = tempint % 2;
                            tempint = tempint / 2;
                        }
                        for (int d = 3; d >= 0; d--) {
                            table += binary[d] + " ";
                        }
                        table += "       0\n";
                    }
                }
                break;
        }
        JOptionPane.showMessageDialog(null, table);
    }

    public Hashtable randomizer(Hashtable table) {
        JLSElement element;

        Hashtable<Integer, JLSElement> toreturn = new Hashtable<Integer, JLSElement>();

        for (Object id : table.keySet()) {
            JLSElement e = (JLSElement) table.get(id);
            String name = e.getElementName();
            if (name.equals("AndGate") || name.equals("NandGate") || name.equals("NorGate") || name.equals("OrGate") ||
                    name.equals("XorGate")) {

                double randomnumber = Math.random() * 5;
                int rand = (int)randomnumber % 5;

                /*
                element = new objects.NorGate();
                String nor[] = e.toString().split("\\n");
                String norsplit[] = new String[nor.length - 1];


                for(int i = 1; i < nor.length - 1; i++) {
                    String temp2[] = nor[i].split(" ");
                    norsplit[i - 1] = temp2[3];
                }

                for (int i = 0; i < norsplit.length; i++){
                    System.out.println(norsplit[i]);
                }
                */
                switch (rand) {
                    case 0:
                        //Change to and
                        element = new objects.AndGate();
                        String and[] = e.toString().split("\\n");
                        String andsplit[] = new String[10];
                        for(int i = 1; i < and.length - 1; i++) {
                            String temp2[] = and[i].split(" ");
                            andsplit[i - 1] = temp2[3];
                        }
                        element.setId(Integer.parseInt(andsplit[0]));
                        element.setX(Integer.parseInt(andsplit[1]));
                        element.setY(Integer.parseInt(andsplit[2]));
                        element.setWidth(Integer.parseInt(andsplit[3]));
                        element.setHeight(Integer.parseInt(andsplit[4]));
                        ((Gate) element).setBits(Integer.parseInt(andsplit[5]));
                        ((Gate) element).setNumInputs(Integer.parseInt(andsplit[6]));
                        ((Gate) element).setOrientation(andsplit[7]);
                        ((Gate) element).setDelay(Integer.parseInt(andsplit[8]));
                        break;
                    case 1:
                        //Change to Nand
                        element = new objects.NandGate();
                        String nand[] = e.toString().split("\\n");
                        String Nandsplit[] = new String[10];
                        for(int i = 1; i < nand.length - 1; i++) {
                            String temp2[] = nand[i].split(" ");
                            Nandsplit[i - 1] = temp2[3];
                        }
                        element.setId(Integer.parseInt(Nandsplit[0]));
                        element.setX(Integer.parseInt(Nandsplit[1]));
                        element.setY(Integer.parseInt(Nandsplit[2]));
                        element.setWidth(Integer.parseInt(Nandsplit[3]));
                        element.setHeight(Integer.parseInt(Nandsplit[4]));
                        ((Gate) element).setBits(Integer.parseInt(Nandsplit[5]));
                        ((Gate) element).setNumInputs(Integer.parseInt(Nandsplit[6]));
                        ((Gate) element).setOrientation(Nandsplit[7]);
                        ((Gate) element).setDelay(Integer.parseInt(Nandsplit[8]));
                        break;
                    case 2:
                        //change to Nor
                        element = new objects.NorGate();
                        String nor[] = e.toString().split("\\n");
                        String norsplit[] = new String[nor.length];
                        for(int i = 1; i < nor.length - 1; i++) {
                            String temp2[] = nor[i].split(" ");
                            norsplit[i - 1] = temp2[3];
                        }

                        element.setId(Integer.parseInt(norsplit[0]));
                        element.setX(Integer.parseInt(norsplit[1]));
                        element.setY(Integer.parseInt(norsplit[2]));
                        element.setWidth(Integer.parseInt(norsplit[3]));
                        element.setHeight(Integer.parseInt(norsplit[4]));
                        ((Gate) element).setBits(Integer.parseInt(norsplit[5]));
                        ((Gate) element).setNumInputs(Integer.parseInt(norsplit[6]));
                        ((Gate) element).setOrientation(norsplit[7]);
                        ((Gate) element).setDelay(Integer.parseInt(norsplit[8]));
                        break;
                    case 3:
                        //change to or
                        element = new objects.OrGate();
                        String or[] = e.toString().split("\\n");
                        String orsplit[] = new String[10];
                        for(int i = 1; i < or.length - 1; i++) {
                            String temp2[] = or[i].split(" ");
                            orsplit[i - 1] = temp2[3];
                        }
                        element.setId(Integer.parseInt(orsplit[0]));
                        element.setX(Integer.parseInt(orsplit[1]));
                        element.setY(Integer.parseInt(orsplit[2]));
                        element.setWidth(Integer.parseInt(orsplit[3]));
                        element.setHeight(Integer.parseInt(orsplit[4]));
                        ((Gate) element).setBits(Integer.parseInt(orsplit[5]));
                        ((Gate) element).setNumInputs(Integer.parseInt(orsplit[6]));
                        ((Gate) element).setOrientation(orsplit[7]);
                        ((Gate) element).setDelay(Integer.parseInt(orsplit[8]));
                        break;
                    case 4:
                        //change to xor
                        element = new objects.XorGate();
                        String xor[] = e.toString().split("\\n");
                        String xorsplit[] = new String[10];
                        for(int i = 1; i < xor.length - 1; i++) {
                            String temp2[] = xor[i].split(" ");
                            xorsplit[i - 1] = temp2[3];
                        }
                        element.setId(Integer.parseInt(xorsplit[0]));
                        element.setX(Integer.parseInt(xorsplit[1]));
                        element.setY(Integer.parseInt(xorsplit[2]));
                        element.setWidth(Integer.parseInt(xorsplit[3]));
                        element.setHeight(Integer.parseInt(xorsplit[4]));
                        ((Gate) element).setBits(Integer.parseInt(xorsplit[5]));
                        ((Gate) element).setNumInputs(Integer.parseInt(xorsplit[6]));
                        ((Gate) element).setOrientation(xorsplit[7]);
                        ((Gate) element).setDelay(Integer.parseInt(xorsplit[8]));
                        break;
                    default:
                        if (name.equals("AndGate")) {
                            element = new objects.AndGate();
                        }
                        else if (name.equals("NandGate")) {
                            element = new objects.NandGate();
                        }
                        else if (name.equals("NorGate")) {
                            element = new objects.NorGate();
                        }
                        else if (name.equals("OrGate")) {
                            element = new objects.OrGate();
                        }
                        else {
                            element = new objects.XorGate();
                        }
                        String defaults[] = e.toString().split("\\n");
                        String defaultsplit[] = new String[10];
                        for(int i = 1; i < defaults.length - 1; i++) {
                            String temp2[] = defaults[i].split(" ");
                            defaultsplit[i - 1] = temp2[3];
                        }
                        element.setId(Integer.parseInt(defaultsplit[0]));
                        element.setX(Integer.parseInt(defaultsplit[1]));
                        element.setY(Integer.parseInt(defaultsplit[2]));
                        element.setWidth(Integer.parseInt(defaultsplit[3]));
                        element.setHeight(Integer.parseInt(defaultsplit[4]));
                        ((Gate) element).setBits(Integer.parseInt(defaultsplit[5]));
                        ((Gate) element).setNumInputs(Integer.parseInt(defaultsplit[6]));
                        ((Gate) element).setOrientation(defaultsplit[7]);
                        ((Gate) element).setDelay(Integer.parseInt(defaultsplit[8]));
                        break;
                }
                toreturn.put(element.getId(), element);
            }
            else {
                toreturn.put(e.getId(), e);
            }
        }
        return toreturn;
    }
}

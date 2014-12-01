import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Scanner;
import java.util.zip.Inflater;
import java.util.zip.ZipInputStream;

/**
 * Created by jackrosenhauer on 11/30/14.
 */
public class Loader extends JPanel implements ActionListener {
    public Loader(){
        JFileChooser fc = new JFileChooser(".");
        JFrame main = new JFrame();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("JLS Files", new String[]{"jls"});
        fc.setFileFilter(filter);
        int returnValue = fc.showOpenDialog(main);
        if (returnValue == 0){
            File file;
            String filename;
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
                while (scan.hasNext()){
                    System.out.println(scan.nextLine());
                }

            } catch (Exception e){
                e.printStackTrace();
            }
        }else{
            System.out.println("Something went wrong");
        }
    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }
}

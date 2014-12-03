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
        System.out.println(table.size());
        System.out.println(table.get(1).toString());
        Saver s = new Saver();
        try {
            s.save(table, l.getCircuitName(), "test" + l.getFilename(), l.getFile().getCanonicalPath());
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.exit(0);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Hashtable;

/**
 * Created by jackrosenhauer on 11/30/14.
 */
public class Main extends JPanel implements ActionListener {

    public static void main(String[] args) {
        //input the file....
        Loader l = new Loader();
        Hashtable table = l.load();
        System.out.println(table.values());
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}

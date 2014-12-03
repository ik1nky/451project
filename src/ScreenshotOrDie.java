import edu.gvsu.cis.kurmasz.jls.JLSUtilities;
import edu.mtu.cs.jls.Circuit;
/**
 * Created by kinkemm1 on 12/3/2014.
 */
public class ScreenshotOrDie {
    public static void makeScreenShot(String fileName)
    {
        Circuit circ;
        try{
            circ = JLSUtilities.loadCircuit(fileName);

            circ.exportImage("screengrab.jpg");
        } catch (JLSUtilities.BadFileException e) {
            e.printStackTrace();
        } catch (JLSUtilities.BadCircuitException e) {
            e.printStackTrace();
        }
    }
}

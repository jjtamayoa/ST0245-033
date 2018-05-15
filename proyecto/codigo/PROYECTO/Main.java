import javax.swing.JFrame;
/**
 * codigo extraido de 
 * https://github.com/rubencm/spatial-hashing/blob/swing/src/net/rubencm/spatialhashing/
 */
public class Main {

    public static void main(String[] argc) {

        ventana f = new ventana();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.addComponentsToPane(f.getContentPane());
        f.pack();
        f.setVisible(true);
        
    }

}

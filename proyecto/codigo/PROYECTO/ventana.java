import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
/**
 * codigo extraido de 
 * https://github.com/rubencm/spatial-hashing/blob/swing/src/net/rubencm/spatialhashing/
 * con modificaciones hechas por Omar Becerra y JUan Jose Tamayo
 */

public class ventana extends JFrame {
 /**
     * metodo para crear la ventana
     */

    public ventana() {
        super("Spatial-Hashing Algorithm Test");
        setResizable(false);
    }
/**
     * metodo que agrega componenetes al panel y ejecuta la deteccion de colisiones
     */
    public void addComponentsToPane(final Container pane) {

        JPanel panel1 = new JPanel();
        panel1.setLayout(new GridLayout(0,2,10,10));

        panel1.add(new JLabel("Numero de objetos"));
        JTextField txtNumObjects = new JTextField("100");
        panel1.add(txtNumObjects);

        JPanel panel2 = new JPanel();

        JButton button = new JButton("Ejecutar simulaciÃ³n");
        button.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {

                    Thread t = new Thread(new Runnable() {
                                @Override
                                public void run() {

                                    info map = new info(0,500,250,	
                                            Integer.parseInt(txtNumObjects.getText()),5);

                                    map.addWindowListener(new WindowAdapter() {
                                            public void windowClosing(WindowEvent e) {
                                                System.exit(0);
                                            }
                                        });
                                    map.pack();
                                    map.setVisible(true);
                                    map.world.run();
                                }

                            });
                    t.start();
                }
            });
        panel2.add(button);

        pane.add(panel1, BorderLayout.NORTH);
        pane.add(panel2, BorderLayout.SOUTH);
    }

}

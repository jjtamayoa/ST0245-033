import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import javax.swing.JComponent;
import javax.swing.SwingUtilities;
/**
 * metodo para hacer el panel y detectar las colisiones en lcada celda
 */
public class cuadradocolisiones extends JComponent {

    private static final long serialVersionUID = 1L;

    public float min; // inicio mapa
    public float max; // fin mapa
    public int cell_size; // tamaÃ±o lado celda

    public int width; // numero de celdas por lado
    public int buckets; // celdas totales
    public float conversion_factor;

    public List<posicionpintar> objects;
    public Hashtable<Integer, List<posicionpintar>> hashtable;
     /**
     * metodo donde cada celda se crea con determinado tamaño y nuemro de celdas
     */

    public cuadradocolisiones(int min, int max, int cell_size) {

        this.min = min;
        this.max = max;
        this.cell_size = cell_size;

        width = (max-min)/cell_size;
        buckets = width*width;
        conversion_factor = 1f/cell_size;

        // Todos los objetos
        objects = new ArrayList<posicionpintar>();

        // Inicializar hashtable
        hashtable = new Hashtable<Integer, List<posicionpintar>>();
        for(int i=0; i<buckets; i++) {
            hashtable.put(i, new ArrayList<posicionpintar>());
        }
    }

/**
     * Añade una abeja al mundo
     */
    public void addObject(posicionpintar o) {
        objects.add(o);
        hashtable.get(o.getCell()).add(o);
    }
/**
     * Obtiene las abejas de una celda
     */
    public List<posicionpintar> getObjectsInCell(int cell) {
        return hashtable.get(cell);
    }

   /**
     * Dadas unas coordenadas obtiene la celda a la que pertenece
     */
    public int getCell(float x, float y) {
        return (int)(x*conversion_factor)+(int)(y*conversion_factor)*width;
    }
/**
     * pinta la ventana
     */
    public void paint(Graphics g) {

        // pintar lineas
        for(int i=1; i<width; i++) {
            g.setColor(Color.LIGHT_GRAY);
            g.drawLine(i*cell_size, 0, i*cell_size, (int) max);
            g.drawLine(0, i*cell_size, (int) max, i*cell_size);
        }

        // pintar entidades
        for(posicionpintar o: objects) {
            o.draw(g);
        }
    }

    /**
     * deteccion de colisiones y pinta las colisones y toma tiempo y memoria
     */
    public void run() {
        Runtime runtime = Runtime.getRuntime();
        long inicio = System.currentTimeMillis();
        ;
        // Redibujar objetos
        for(posicionpintar o: objects) {
            o.color = Color.BLUE;
            for(posicionpintar n: o.getNearObjects()) {
                // http://stackoverflow.com/questions/1736734/circle-circle-collision
                if(n != o &&
                Math.pow(n.position.x-o.position.x, 2) +
                Math.pow(o.position.y-n.position.y, 2) <= 0.0001
                ) {
                    System.out.println("la abeja x = " + n.position.x +" y = "+
                        n.position.y + " colisiona con la abeja x = " + o.position.x +
                        "y = "+ o.position.y);
                    o.color = Color.RED;
                }
            }
        }
        
        long fin = System.currentTimeMillis() - inicio;
        long memory = runtime.totalMemory() - runtime.freeMemory();
        memory = memory / 1000000;
        System.out.println("Tiempo  " + fin + "mls" );
        System.out.println("Memoria  " + memory + "MG");
    }
}


import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/**
 * clase para crear la ventana y la posicion
 */
// Comprobar, un objeto no puede ser nunca mas grande que una celda
public class posicionpintar {
    /**
     * clase que que almacena la posicion x,y de la abeja
     */
    public class Position {
        public float x;
        public float y;

        public Position(float x, float y) {
            this.x = x;
            this.y = y;
        }
    }

    public cuadradocolisiones world;
    public Position position;
    public float radius;
    Color color = Color.BLUE;
    /**
     * metodo para crear la ventana
     */
    public posicionpintar(cuadradocolisiones world, float radius, float x, float y) {
        this.world = world;
        this.radius = radius;
        this.position = new Position(x, y);
    }

    /**
     * Devuelve la celda donde esta el objeto
     */

    public int getCell() {
        return world.getCell(position.x, position.y);
    }

    /**
     * Devuelve los indices de las celdas que ocupa el objeto
     */
    public Set<Integer> getCells() {
        Set<Integer> cells = new HashSet<Integer>();
        int[][] pos = {{-1, -1}, {-1, 1}, {1, -1}, {1, 1}};
        int c;

        for(int i=0; i<pos.length; i++) {
            c = world.getCell(position.x+(pos[i][0]*radius), position.y+(pos[i][1]*radius));
            if(c>=0 && c<world.buckets) {
                cells.add(c);
            }
        }

        return cells;
    }

    /**
     * Obtiene los objetos cercanos en todas las celdas que ocupa
     */
    public List<posicionpintar> getNearObjects() {
        List<posicionpintar> objects = new ArrayList<posicionpintar>();
        Set<Integer> cells = getCells();

        for(int s: cells) {
            objects.addAll(world.getObjectsInCell(s));
        }

        return objects;
    }

    /**
     * Dibujar el circulo que representa la abeja
     */
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillOval((int)position.x-(int)radius, (int)position.y-(int)radius, 2*(int)radius, 2*(int)radius);
    }

}

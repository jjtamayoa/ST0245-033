
import java.util.ArrayList;
import java.util.List;
class Node {
    int x, y, valor;
    Node(int x, int y, int valor) {
        this.x = x;
        this.y = y;
        this.valor = valor; 
    }
}

class limite {
    int xMin, yMin, xMax, yMax;

    public limite(int xMin, int yMin, int xMax, int yMax) {
        this.xMin = xMin;
        this.yMin = yMin;
        this.xMax = xMax;
        this.yMax = yMax;
    }

    public int getxMin() {
        return xMin;
    }

    public int getyMin() {
        return yMin;
    }

    public int getxMax() {
        return xMax;
    }

    public int getyMax() {
        return yMax;
    }

    public boolean estaenelrango(int x, int y) {
        return (x >= this.getxMin() && x  <= this.getxMax()  && y >= this.getyMin() && y <= this.getyMax());
    }
}

public class QuadTree {

    final int MAX_CAPACITY = 4;//maxima capacidad antes de dividirse
    int level = 0; //nivel del nodo
    List<Node> nodes;
    QuadTree no= null;
    QuadTree ne = null;
    QuadTree so = null;
    QuadTree se = null;
    limite limite;

    QuadTree(int level, limite limite) {
        this.level = level;
        nodes = new ArrayList<Node>();
        this.limite = limite;
    }

    /* recorremos el arbol usando busqueda por profundidad para ver como ha quedado los nodos*/
    static void dfs(QuadTree tree) {
        if (tree == null){
            return;
        }

        System.out.printf("\nLevel = %d [X1=%d Y1=%d] \t[X2=%d Y2=%d] ", tree.level, tree.limite.getxMin(), tree.limite.getyMin(), tree.limite.getxMax(), tree.limite.getyMax());

        for (Node node : tree.nodes) {
            System.out.printf(" \n\t  x=%d y=%d", node.x, node.y);
        }

        if (tree.nodes.size() == 0) {
            System.out.printf(" \n\t nodo vacio.");
        }
        dfs(tree.no);
        dfs(tree.ne);
        dfs(tree.so);
        dfs(tree.se);

    }

    void dividir() {
        int xOffset = this.limite.getxMin() + (this.limite.getxMax() - this.limite.getxMin()) / 2;
        int yOffset =this.limite.getyMin() +(this.limite.getyMax() - this.limite.getyMin()) / 2;

        no = new QuadTree(this.level + 1, new limite(this.limite.getxMin(), this.limite.getyMin(), xOffset, yOffset));
        ne = new QuadTree(this.level + 1, new limite(xOffset, this.limite.getyMin(), xOffset, yOffset));
        so = new QuadTree(this.level + 1, new limite(this.limite.getxMin(), xOffset, xOffset,this.limite.getyMax()));
        se= new QuadTree(this.level + 1, new limite(xOffset, yOffset,this.limite.getxMax(), this.limite.getyMax()));

    }

    void insert(int x, int y, int value) {

        if (!this.limite.estaenelrango(x, y)) {
            return;
        }
        Node node = new Node(x, y, value);

        if (nodes.size() < MAX_CAPACITY) {
            nodes.add(node);
            return;
        }

        if (no == null) {
            dividir();
        }

        if (this.no.limite.estaenelrango(x, y))
        {
            this.no.insert(x, y, value);
        }

        else if (this.ne.limite.estaenelrango(x, y))
        {
            this.ne.insert(x, y, value);
        }

        else if (this.so.limite.estaenelrango(x, y))
        {
            this.so.insert(x, y, value);
        }

        else if (this.se.limite.estaenelrango(x, y)){
            this.se.insert(x, y, value);
        }
        else
        {
            System.out.printf("ERROR : no se puede particionar %d %d", x, y);
        }
    }

    public static void main(String args[]) {
        leer a = new leer();
        a.lee();
    }
}
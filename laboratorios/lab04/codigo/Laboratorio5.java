public class Laboratorio5 {
    /**
     * metodo que genera el codigo para dibujar el arbol genealogico
     */
    public static void dibujarArbol(BinaryTree a)
    {
        System.out.println(" ingrese a  http://www.webgraphviz.com/ y cloque los siguientes datos"); 
        System.out.println("digraph arbolito {");
        System.out.println("size=\"6,6\";");
        System.out.println("node [color=pink, style=filled];");
        dibujarArbolAux(a.root);
        System.out.println("}");
    }

    /**
     * metodo que  dice como se conectan los miembros de la familia y genera el codigo para ser dibujado
     */
    public static void dibujarArbolAux(Node nodo)
    {
        if (nodo != null){
            for(Node n: new Node[] {nodo.left, nodo.right} ){
                if (n != null)
                    System.out.println("\"" + nodo.data + "\" -> \"" + n.data + "\";");
                dibujarArbolAux(n);
            }
        }
    }

    /**
     * metodo princiopal con un arbol ya creado
     */
    public static void main(String[] args) {

        System.out.println("Los miembros de mi familia son :"); 

        //Crea el árbol familiar
        BinaryTree tree = new BinaryTree("Omar");

        Node Omar = new Node ("Omar");

        Node Nelson = new Node ("Nelson");
        Node Yolanda = new Node ("Yolanda");

        Node Ezequiel = new Node ("Ezequiel");
        Node Enrique = new Node ("Enrique");

        Node Antonia = new Node ("Antonia");
        Node Flor = new Node ("Flor");

        tree.insertLeft(Omar,Nelson);
        tree.insertRight(Omar,Yolanda);

        tree.insertLeft(Nelson,Ezequiel);
        tree.insertRight(Nelson,Flor);
         
        tree.insertLeft(Yolanda,Enrique);
        tree.insertRight(Yolanda,Antonia);

        //Imprime el árbol 
        tree.recursivePrint();

        System.out.println();
        //Dibuja el árbol 
        dibujarArbol(tree);
    }
}
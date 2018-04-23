
/**
 * Write a description of class Grandmother here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Grandmother
{
    BinaryTree tree = new BinaryTree("Omar");
    Node b = tree.root;
    Node Omar = new Node ("Omar");

    /**
     * metodo princiopal con un arbol ya creado
     */
    public void main(String[] args) {

        //Crea el árbol familiar

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
        
        
        System.out.println("Mi abuela materna es:"); 
        System.out.println(searchGrandma("Omar"));
        //Dibuja el árbol 
    }

    public  String searchGrandma (String name){
        Node node = search(b,name);
        String a = node.data;
        if (node == null){
            return "";
        }
        else {
            if (node.right != null){
                node = node.right;
                if (node.right != null){
                    return  node.right.data;
                }else {
                    return "";
                }
            }
            else {
                return "";
            }
        } 
    }

    /**
     * metodo para buscar un nodo de manera recursiva
     */
    public  Node search(Node r,String data){
        if (r != null){
            if (data.equals(r.data)){
                return r;
            }
            else {
                search(r.left,data);
                search(r.right,data);
            }
        }
        return null; 
    }

}

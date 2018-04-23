public class BinaryTree { 
    public Node root;
    public BinaryTree(String data){
        root = new Node (data);
    }

    /**
     * metodo auxiliar para calcular la altura maxim
     * recibe dos enteros para ser comparados
     */

    private int max2(int i, int j)  
    {
        if (i > j){
            return i;
        }
        return j;
    }

    /**
     * metodo auxiliar para calcular la altura maxima
     */

    private int maxheightAUX(Node node) 
    {
        if (node == null){
            return 0;
        }
        else {
            return max2(maxheightAUX(node.left), maxheightAUX(node.right))+1;
        }
    }

    /**
     * metodo para calcular la altura maxima
     */
    public int maxheight() 
    {
        return maxheightAUX(root);
    }

    /**
     * metodo auxiliar para imprimir de manera recursiva un arbol
     */
    private void recursivePrintAUX(Node node)
    {
        if (node != null)
        {
            recursivePrintAUX(node.left);
            recursivePrintAUX(node.right);
            System.out.println(node.data);
        }

    }

    /**
     * metodo para imprimir de manera recursiva un arbol
     */
    public void recursivePrint()
    {
        recursivePrintAUX(root);
    }

    /**
     * metodo para insertar un nodo a la izquierda 
     */
    public void insertLeft(Node son,Node mother){
        if (root.left==null){
            root.left = mother;
        }
        else {
            insertLeftAux (root,son,mother);
        }

    }

    /**
     * metodo auxiliar para insertar un nodo a la izquierda
     */
    private void insertLeftAux(Node node,Node son,Node mother){
        if(node==null){
            return;
        }
        else if (node.data.equals(son.data)){
            node.left = mother;
            return;
        }
        else if (node.left == null && node.right == null){
            return;
        }
        insertLeftAux(node.right,son,mother);
        insertLeftAux(node.left,son,mother);
    }

    /**
     * metodo para insertar un nodo a la derecha
     */
    public void insertRight (Node son, Node father){
        if (root.right == null){
            root.right = father;
        }
        else {
            insertRightAux(root,son,father);
        }
    }

    /**
     * metodo auxiliar para insertar un nodo a la derecha
     */  
    private void insertRightAux (Node node, Node son,Node father){
        if (node == null){
            return;
        }

        else if (node.data.equals(son.data)){
            node.right= father;
            return;
        }
        else if (node.left== null && node.right == null){
            return;
        }

        insertRightAux(node.left,son,father);
        insertRightAux(node.right,son,father);
    }

    /**
     * metodo para buscar la abuela materna
     */

    public  String searchGrandma (String name){
        Node node = search(root,name);
        String a = node.data;
        if (node == null){
            return "";
        }
        else {
            if (node.left != null){
                node = node.left;
                if (node.left != null){
                    return  node.data;
                }

                else {
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
    public   Node search(Node r,String data){
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

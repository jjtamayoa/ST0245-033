import java.util.*;
/**
 * Este es el test para la clase de SmartInsert en linkedList
 */
public class TESTSMART{
    /**
     * Este es el test para los el linkedlist
     */
    public static void testlinked(String [] args){
        SmartInsert x = new SmartInsert();
        LinkedList<Integer> linked = new LinkedList<>();//linked list original
        linked.addAll(Arrays.asList(new Integer[] {1, 3, 5, 7}));
        LinkedList<Integer> c = new LinkedList<>(); //linked de prueba
        c.addAll(Arrays.asList(new Integer[] {1, 3, 5, 7, 9})); 
        x.SmartInsert(linked,9);
        boolean d = linked.equals(c);
        if(d){
            System.out.println("esta correcto");
        }else{
            System.out.println("NO esta correcto");
        }

        x.SmartInsert(linked,7);
        d = linked.equals(c);

        if(d){
            System.out.println("esta correcto");
        }else{
            System.out.println("NO esta correcto");
        }

        x.SmartInsert(linked,12);
        d = !linked.equals(c);

        if(d){
            System.out.println("esta correcto");
        }else{
            System.out.println("NO esta correcto");
        }
    }

    /**
     * Este es el test para la clase de SmartInsert en array
     */
    public static void testarraylis(String [] args){
        SmartInsert x = new SmartInsert();
        ArrayList<Integer> array = new ArrayList<>(); //arraylist original
        array.addAll(Arrays.asList(new Integer[] {2, 4, 6, 8}));
        ArrayList<Integer> c= new ArrayList<>(); //ararylist prueba
        c.addAll(Arrays.asList(new Integer[] {2, 4, 6, 8, 7 }));
        x.SmartInsert(array,8);
        boolean d = array.equals(c);
        if(!d){
            System.out.println("esta correcto");
        }else{
            System.out.println("NO esta correcto");
        }

        x.SmartInsert(array,7);
        d = array.equals(c);

        if(d){
            System.out.println("esta correcto");
        }else{
            System.out.println("NO esta correcto");
        }

        x.SmartInsert(array,2);
        d = array.equals(c);

        if(d){
            System.out.println("esta correcto");
        }else{
            System.out.println("NO esta correcto");
        }
    }
}

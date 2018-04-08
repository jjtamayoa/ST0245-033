import java.util.*;
/**
 * Clase utilizada para multiplicar los terminos de un un ArryList y un LinkedList
 */
public class Multiply
{
    /**
     * Multiplica los terminos de un Arrylist 
     */
    public static int mul(ArrayList<Integer> lista){
        int mul = 1;
        for (int i= 0; i < lista.size();i++){
            mul = lista.get(i) * mul;
        }
        return mul;
    }

    /**
     *Multiplica los terminos de un LinkedList
     */
    public static int mul(LinkedList<Integer> lista){
        int mul = 1;
        for (int i= 0; i < lista.size();i++){
            mul = lista.get(i) * mul;
        }
        return mul;
    }
}

import java.util.*;
/**
 * Este codigo agregar un elemento a una linked o arraylist si este no esta en la lista
 * Nombre de la clase propuesta por el profesor en el taller  SmartInsert
 */
public class SmartInsert
{

    /**
     * Este codigo es el encargado de agregar un elemento si este es un ArrayList
     * 
     */
    public static ArrayList<Integer> SmartInsert(ArrayList<Integer> lista ,int data){
        if(lista.contains(data)){
            return lista;
        }else{
            lista.add(data);
        }
        return lista;
    }  

    /**
     * Este codigo es el encargado de agregar un elemento si este es un LinkedList
     * 
     */
    public static LinkedList<Integer> SmartInsert(LinkedList<Integer> lista ,int data){
        if(lista.contains(data)){
            return lista;
        }else{
            lista.add(data);
        }
        return lista;
    }
}

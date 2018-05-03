
import java.util.ArrayList;
import java.util.LinkedList;
/**
 * Esta clase es una implementación de un digrafo usando listas de adyacencia
 * 
 * @author Mauricio Toro
 * @version 1
 */
public class DigraphAL extends Graph
{
   public LinkedList<LinkedList<Pair<Integer,Integer>>> grafo;
   /**
    * metodo que le da tamaño a la lista
    */
   public DigraphAL(int size){
     super(size);
     grafo = new LinkedList<>();
     for (int i =0; i<size;++i){
         grafo.add(new LinkedList<Pair<Integer,Integer>>());   
     }
   }
   
    /**
    * metodo que obtiene el valor en una posicion de la lista en una pareja dada
    */
   @Override
   public int getWeight(int source, int destination){
      LinkedList weight=grafo.get(source);
      for(int i =0; i< weight.size();++i){
          Pair a = (Pair)weight.get(i);
          if((int)(a.first)== destination){
              return (int)a.second;
          }
      }
      return 0;
   }
   
   
   
      /**
    * metodo que agrega un valor en una posicion dada
    */
   @Override
   public void addArc(int source, int destination, int weight){
     LinkedList arco = grafo.get(source);
     arco.add(new Pair(destination,weight));
   }

    /**
   * metodo que devuelve una lista con los valor de enlazados a un nodos
   */
   @Override
   public ArrayList<Integer> getSuccessors(int vertice){
    ArrayList<Integer> successor = new ArrayList<>();
    int a = grafo.get(vertice).size();
    for (int i =0; i<a; ++i){
        successor.add(grafo.get(vertice).get(i).first);
    }
    return successor;
   }
}

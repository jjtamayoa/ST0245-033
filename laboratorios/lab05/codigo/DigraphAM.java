import java.util.ArrayList;
/**
 * Esta clase es una implementación de un digrafo usando matrices de adyacencia
 * 
 * @author Mauricio Toro
 * @version 1
 */
public class DigraphAM extends Graph
{
    int [][] grafo = new int [size][size];
   /**
    * metodo que le da tamaño ala matriz n x n 
    */
   public DigraphAM(int size){
         super(size);
   }
   /**
    * metodo que obtiene el valor en una posicion de la matriz
    */
    @Override
   public int getWeight(int source, int destination){
      return grafo[source][destination];
    }
   /**
    * metodo que agrega un valor en una posicion dada
    */
    @Override
   public void addArc(int source, int destination, int weight){
      grafo [source][destination] = weight;
   }
  /**
   * metodo que devuelve una lista con los valor de enlazados a un nodos
   */
    @Override
   public ArrayList<Integer> getSuccessors(int vertex)
   {
      ArrayList<Integer> get= new ArrayList<>();
      for(int i =0; i < grafo.length;++i){
         if (grafo[vertex][i] != 0){
             get.add(i);
            }
        }
        return get;
   }
}

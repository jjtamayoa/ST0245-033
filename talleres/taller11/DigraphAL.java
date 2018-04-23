import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;
import java.util.Arrays;
/**
 * Esta clase es una implementación de un digrafo usando listas de adyacencia
 * 
 * @author Mauricio Toro 
 * @version 1
 */
public class DigraphAL extends Graph
{
    ArrayList<LinkedList<Integer>> adlist;
    public DigraphAL(int size){
        super(size);
        adlist = new ArrayList<LinkedList<Integer>>(size);
        for(int i = 0; i < size; i++){
            LinkedList<Integer> list = new LinkedList<>();
            for(int j = 0; j < size; j++){
                list.add(0);
            }
            adlist.add(list);
        }
    }

    public void addArc(int source, int destination, int weight)
    {
        adlist.get(source).add(destination, weight);
        adlist.get(source).remove(destination + 1);
    }

    public int getWeight(int source, int destination) {
        return adlist.get(source).get(destination);
    }

    public ArrayList<Integer> getSuccessors(int vertice){
        ArrayList<Integer> a = new ArrayList<>();
        for(int i = 0; i < adlist.get(vertice).size(); i++){
            if(adlist.get(vertice).get(i) != 0){
                a.add(i);
            }
        }
        return a;

    }

}

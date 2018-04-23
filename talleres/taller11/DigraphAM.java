import java.util.ArrayList;
/**
 * Esta clase es una implementación de un digrafo usando matrices de adyacencia
 * 
 * @author Mauricio Toro 
 * @version 1
 */
public class DigraphAM extends Graph
{
    int [][] m;

    public DigraphAM(int size){
        super(size);
        m = new int[size][size];
    }

    public int getWeight(int source, int destination)
    {
        return  m[source][destination];
    }

    public void addArc(int source, int destination, int weight)
    {
        m[source][destination] = weight;
    }

    public ArrayList<Integer> getSuccessors(int vertex){
        ArrayList<Integer> a = new ArrayList<>();
        for(int i = 0; i < m[vertex].length; i++){
            if(m[vertex][i] != 0){
                a.add(i);
            }
        }
        return a;
    }
}

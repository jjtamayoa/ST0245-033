import java.util.*;
/**
 *  Esta clase se utiliza para utilizar encontrar el mejor pivote 
 */

public class pivote{
    /**
     * metodo que recibe una lista y busca el mejor lugar para el pivote
     */
    public static int pivote (List <Integer> l){
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;

        for (int i=0; i<l.size()-1;i++ ){
            d = 0;
            if (i == 0){
                for (int h = 0; h<l.size(); h++){
                    b= b+l.get(h);    
                }
            }
            else {
                c = c+ l.get(i-1);
                for (int j=i+1; j<l.size(); j++){
                    d = d+l.get(j);
                }
                if (Math.abs(c-d)<b){
                    a= i;
                    b= Math.abs(c-d);
                }
            }
        }
        return a;
    }
}

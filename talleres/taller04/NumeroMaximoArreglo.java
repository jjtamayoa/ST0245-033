
import java.util.Random;
public class NumeroMaximoArreglo
{
    
    // metodo que calcula el tiempo de encontrar el maximo en un arrglo de 1 a 20 elementos
    public static void main(String[] args) {
        for(int i = 0; i <= 20 ; i++){ 
            long inicio = System.nanoTime();
            Max_arreglos(f(i));
            long fin = System.nanoTime() - inicio;
            System.out.println( fin );
        
       }
    }
    //metodo que genera el arreglo aleatorio
    public static int[] f(int size) {
        int max = 5000;
        int[] array = new int[size];
        Random generator = new Random();
        for (int i =0; i<size; i++){
            array[i] = generator.nextInt(max);
        }
        return array;
    }

    //metodod para calcular el maximon numero que hay en un arreglo
    public static int Max_arreglos(int [] a){
        return Max_arregloAux(a,0,0);
    }

    private static int Max_arregloAux(int[]a,int i,int Max){
        if(i == a.length) { 
            return Max;
        }else if(a[i]>Max){
                Max = a[i];
                return Max_arregloAux(a,i+1,Max);
        }else{
                return Max_arregloAux(a,i+1,Max);
        }
    }
}


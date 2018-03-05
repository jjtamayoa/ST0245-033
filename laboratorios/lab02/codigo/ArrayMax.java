
import java.util.Random;
public class ArrayMax
{
    public static void main(String[] args) {
        for(int i = 0; i <= 20 ; i++){ 
            long inicio = System.nanoTime();
            ArrayMax(f(i));
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

    public static int ArrayMax(int [] a){
        int Max = 0; 
        for(int j = 0; j < a.length; j++){
            if(a[j]> Max){
                Max = a[j];
            }
        }
        return Max;
    }
}

import java.util.Random;
/**
 * Write a description of class Ordenar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class OrdenarArr
{
     public static long [] f(int size) {
        int max = 100;
        long[] array = new long[size];
        Random generator = new Random();
        for (int i =0; i<size; i++){
            array[i] = generator.nextInt(max);
        }
        return array;
 }

    public static void main(String[] args) {
        for(int  i = 0; i <= 21 ; i++){ 
            long inicio = System.nanoTime();
            insertionSort(f(i));
            long fin = System.nanoTime() - inicio;
            System.out.println( fin );
        
        }
    }
    public static long [] insertionSort (long [] a){
        int temp = 0;
     for(int i = 0; i < a.length;i++){
         for(int j = 0; j < a.length-1;j++){
             if(a[j] > a[j+1]){
                 temp  =(int) a[j];
                 a[j] = a[j+1];
                 a[j+1] =  temp;          
              }
          }  
     }  
    return a;
    }
}

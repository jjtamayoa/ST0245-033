import java.util.Random;
public class insertSort{

    public static void main(String[] args) {
        for(int i = 0; i <= 20 ; i++){ 
            long inicio = System.nanoTime();
            InsertionSort(f(i));
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

    public static int[] InsertionSort(int[] input){

        int temp;
        for (int i = 1; i < input.length; i++) {
            for(int j = i ; j > 0 ; j--){
                if(input[j] < input[j-1]){
                    temp = input[j];
                    input[j] = input[j-1];
                    input[j-1] = temp;
                }
            }
        }
        return input;
    }
}
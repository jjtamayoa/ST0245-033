
import java.util.Random;
public class GroupSum
{
     // metodo que calcula el tiempode de ejecucion de groupSum
   public static void main(String[] args) {
        for(int i = 0; i <= 20; i++){ 
            long inicio = System.nanoTime();
            groupSum(0,f(i),i);
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

   public static boolean groupSum(int start, int[] nums, int target) {
         if (start == nums.length){ 
                return target == 0;
            }else{
                return groupSum(start+1, nums, target - nums[start])        
                || groupSum(start+1, nums, target);
        }
   } 
}
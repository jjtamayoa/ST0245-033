
/**
 * Write a description of class TablasDeMultiplicar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TablasMul
{
     public static void main(String[] args) {
        for(int  i = 0; i <= 20 ; i++){ 
            long inicio = System.nanoTime();
            mul(i*10);
            long fin = System.nanoTime() - inicio;
            System.out.println( fin );
        
        }
    }
   public static void mul(int n){
       int a=0;
       for(int i = 0;i<n;i++){
           for(int j = 0;j<10;j++){
             a = i*j;
            }
    }
    }
}

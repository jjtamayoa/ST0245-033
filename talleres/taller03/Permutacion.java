
/**
 * @authors Omar Becerra - Juan José Tamayo 
 */

public class Permutacion
{    
   public static void permutacion(String base){
       punt3("",base);
   }

   private static void punt3(String base,String a){
       int n = a.length();
       if(n==0){
           System.out.println(base);           
       }else{
           for(int i =0 ;i < n; i++){
            punt3(base + a.charAt(i),a.substring(0,i) + a.substring(i+1,n));
            }
       }
   }
}

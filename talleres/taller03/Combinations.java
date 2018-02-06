
/**
 * @authors Omar Becerra - Juan José Tamayo 
 */
public class Combinations{
    public static void Combination(String base){
        punt3(base,"");
   }

   private static void punt3(String base,String a){
       if(base.length()==0){
           System.out.println(a);           
       }else{
           punt3(base.substring(1),a + base.substring(0,1));
           punt3(base.substring(1),a);
       }
    }
}


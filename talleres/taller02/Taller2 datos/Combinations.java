public class Combinations{
    public static void Combination(String base){
        punto3(base,"");
   }

   static void punto3(String base,String a){
       if(base.length()==0){
           System.out.println(a);
       }else{
           punto3(base.substring(1),a + base.substring(0,1));
           punto3(base.substring(1),a);
       }
    }
}

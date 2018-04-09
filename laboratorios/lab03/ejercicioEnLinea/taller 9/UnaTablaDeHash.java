import java.util.*;
public class UnaTablaDeHash{
   private int[] tabla;
   public UnaTablaDeHash(){
      tabla = new int[27];
   }

   private int funcionHash(String k){
       return ((int) k.charAt(0)) % (int) (Math.pow(2,9));
   }

   public int get(String k){
       int x = funcionHash(k);
       return tabla[x];
   }

   public void put(String k, int v){
       int x = funcionHash(k);
       tabla[x] = v;
   }


    public static void agregar(HashMap<String, String> empresas,String key, String value){
        empresas.put(key,value);
    }

    public static void buscar(HashMap<String, String> empresas,String key){
        String a = empresas.get(key);
        System.out.println(a);
    }

    public static boolean contienekey(HashMap<String, String> empresas,String value){
        return empresas.containsKey(value);
    } 

    public static void main(String [] args){
        HashMap<String, String> dic = new HashMap();
        agregar(dic,"Google","Estado Unidos");
        agregar(dic,"La Locur","Colombia");
        agregar(dic,"Nokia","Finlandia");
        agregar(dic,"Sony","Japon");

        buscar(dic,"Colombia");
        buscar(dic,"India");

        System.out.println(contienekey(dic,"Motorola"));
        System.out.println(contienekey(dic,"Google")); 
    }
}
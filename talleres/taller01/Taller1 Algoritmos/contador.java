public class contador {
    int incrementos;
    String id;
    contador(String id){
       this.id=id;
    }
   
    void incrementar(){
       incrementos ++;
       id += " + 1" ;
    }
    
    int incrementos(){
       return incrementos;  
    }
    
    @Override
    public String toString(){
       return id;
    }   
}
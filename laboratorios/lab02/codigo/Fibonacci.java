
public class Fibonacci
{
    // metodo principal ejecuta y mide el tiempod e ejecucion de 20 primeros numeros de fibonacci
    public static void main(String[] args) {
        for(int i = 0; i <= 31; i++){ 
            long inicio = System.nanoTime();
            fibonacci(i);
            long fin = System.nanoTime() - inicio;
            System.out.println( fin );

        }
    }
    //calcula los numeros de fibonnacci
    public static int fibonacci(int n){
        if(n<=1){
            return 1;
        }else{
            return fibonacci(n-1) + fibonacci(n-2);    
        }
    }
}
/**
 * Write a description of class n here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fibonacci
{
    public static int Fibo_Aux(int n){
        if(n<=1){
            return 1;
        }else{
            return Fibo_Aux(n-1) + Fibo_Aux(n-2);    
        }
    }
}

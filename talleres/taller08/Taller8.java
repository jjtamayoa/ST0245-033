import java.util.*;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;
/**
 * @authors Omar Alexis Becerra - Juan José Tamayo 
 * @version 12/03/2018
 */
public class Taller8
{   
    //Punto 1
    public static Stack<Integer> invertirStack (int[] stack){
        Stack<Integer> Stack = new Stack<Integer>();   
        for(int i = stack.length-1; i >= 0; i--){
            Stack.push(stack[i]);
        }
        return Stack;
    }
    //Punto2
    public static void atenderenorden (String [] a){
        Queue<String> queue = new LinkedList<String>();
        for (int i=0;i<a.length;i++){
            queue.add(a[i]);
        }
        int b = queue.size();
        for (int i=0; i<b;i++){
            System.out.println("Atendiendo a "+ queue.remove());
        }
    }
    //Punto3 
    //nota para que funcione el algoritmo todo debe estar pegado ej :("34*4-")esto daria como resultado 8
    public static int polaca  (String string){
        Stack <Integer> Stack = new Stack<Integer>();
        for (int i=0; i<string.length();i++){
            char a= string.charAt(i);
            if (a=='+' || a== '-' || a == '*' || a== '/'){
                // si hay menos de dos elementos en la pila
                if (Stack.size()<2){
                    System.out.println ("error no esta bien escrito");
                    return 0;
                }

                if (a == '+'){
                    int x= Stack.pop();
                    int y= Stack.pop();
                    Stack.push(x+y);
                }
                else if (a == '-'){
                    int x= Stack.pop();
                    int y= Stack.pop();
                    Stack.push(y-x);
                }
                else if (a == '*'){
                    int x= Stack.pop();
                    int y= Stack.pop();
                    Stack.push(x*y);
                }
                else if (a == '/'){
                    int x= Stack.pop();
                    int y= Stack.pop();
                    Stack.push(y/x);
                }
            }
            else {
                int c= Integer.parseInt(""+a);
                Stack.push(c);
            }
        }
        //if hay solo dos elementos en la pila y no hay operadoor
        if (Stack.size()>1){
            System.out.println ("error esta mal escrito");
            return 0;
        }
        //devuelva lo que que en la pila
        return Stack.pop();
    }

}


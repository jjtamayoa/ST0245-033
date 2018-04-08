import java.util.*;
import java.io.*;

/**
 * este codigo es hecho para solucionar el problema de el teclado dañado
 * esta clase arregla un texto que de un teclado que esta dañado
 * 
 */
public class Arreglartexto {
    /**
     * metodo principal encargado de leer el archivo txt y llamar el metodo arreglar
     */
    public static void lecturaarreglar(){
        try{
            File f = new File("leer.txt");  //C
            Scanner s = new Scanner(f); //C
            while(s.hasNextLine()){ //N
                //lee linea
                String a = ""; //C * N
                a += s.next(); //C * N
                System.out.println(arreglar(a)); //C * N
            }
        }catch(FileNotFoundException e){
            System.out.println("El archivo no existe..."); //C 
        }  
    } 

    /**
     * este metodo es el encargado de arreglar el texto 
     */
    private static String arreglar(String consola){
        LinkedList<Character> lista = new LinkedList<>(); //C
        int index=0; //C 
        for (char c: consola.toCharArray()){ // N

            if (c == ']'){ //C * N
                index= lista.size(); //C * N
            }
            else if(c =='['){ //C * N
                index=0; //C * N
            }else { 
                lista.add(index++,c); //C * N
            }
        }
        StringBuilder string = new StringBuilder(); 
        for (char c: lista){ //N
            string.append(c); //C * N
        }
        return string.toString();  //C 
    }
}

import java.io.*;
public class leer
{
    public static void lee(){
        double primero = 0;
        double segundo = 0;
        QuadTree anySpace = new QuadTree(1, new limite(-1000000,-1000000, 5000000, 7000000));
        try {
            FileReader fr = new FileReader("leer1.txt");
            BufferedReader entrada = new BufferedReader(fr);
            String s = null;
            while((s=entrada.readLine())!=null){
                int numero = 0;
                numero = s.indexOf(",");
                primero = Double.parseDouble(s.substring(0,numero))*100;
                segundo = Double.parseDouble(s.substring(numero+1,s.length()))* 1000;
                anySpace.insert((int)primero,(int) segundo, 1);
            }
            entrada.close();
            QuadTree.dfs(anySpace);
        }
        catch(java.io.FileNotFoundException fnfex) {
            System.out.println("Archivo no encontrado: " + fnfex);}
        catch(java.io.IOException ioex) {}
    }
}


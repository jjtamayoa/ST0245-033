import java.util.Random;
import java.io.*;
import javax.swing.JFrame;
/**
 *clase que lee y agrega las abejas a el panel del hash espacial
 */
public class info extends JFrame{
    cuadradocolisiones world;
     /**
     * 
     * metodo que lee las abejas y las agrega al panel
     * metodo define el tamaño maximo de la ventana y el numero de celdas
     * y objetos y el radio de las abejas que se dibujan
     */
    public info(int min, int max, int cell_size, int objects,float radius) {
        String a = objects + ".txt";
        world = new cuadradocolisiones(min, max, cell_size);
        this.add(world);

       double primero = 0;
       double segundo = 0;
        try {
            FileReader fr = new FileReader(a);
            BufferedReader entrada = new BufferedReader(fr);
            String s = null;
            while((s=entrada.readLine())!=null){
                int numero = 0;
                numero = s.indexOf(",");
                primero = Double.parseDouble(s.substring(0,numero))*-1;
                segundo = Double.parseDouble(s.substring(numero+1,s.length()));
                posicionpintar o = new posicionpintar(world, radius, (float)primero, (float)segundo);
                world.addObject(o);

            }
            entrada.close();

        }
        catch(java.io.FileNotFoundException fnfex) {
            System.out.println("Archivo no encontrado: " + fnfex);}
        catch(java.io.IOException ioex) {}
    }
}	



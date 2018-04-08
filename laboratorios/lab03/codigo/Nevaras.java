import java.util.*;
/**
 * clase principal para entregar nevaras
 */
public class Nevaras
{
    /**
     * Esta clase se utiliza para utilizar encontrar el mejor pivote 
     */
    public static class Solicitudes {
        public String nombre;
        public int solicitud;
        /**
         * metodo que procesa las solicitudes 
         */
        public Solicitudes (String a, int b){
            nombre = a;
            solicitud = b;
        }
    }

    /**
     * metodo que tiene la descricion de la nevera y la marca de la misma
     */
    public static class Almacen {
        public int codigo;
        public String descripcion;
        /**
         * recibe la posicion y la marca de la nevera
         */
        public Almacen (int a, String b){
            codigo= a;
            descripcion= b;
        }
    }

    /**
     * este metodo recibe dos lista una de soliitudes y otra de neveras y determina como se despachan
     */

    public static void ejercicio4(List <Almacen> neveras,List <Solicitudes> solicitudes){
        int cont = 0;

        for (int i=solicitudes.size()-1;i>=0;i--){
            Solicitudes Solicitud = solicitudes.get(i);
            int c= Solicitud.solicitud;
            int x=0;
            for (int j= neveras.size()-(1+cont);c>0;c--){
                Almacen nevera= neveras.get(j-x);
                System.out.println(Solicitud.nombre + " : " + nevera.codigo + " " + nevera.descripcion);
                cont++;
                x++;
            }
        }

    }
}

import java.util.*;
public class convertir
{
    public static int euc(double x1, double y1, double x2,double y2){ 
        double  sumx = Math.pow(x2 - x1, 2); 
        double sumy = Math.pow(y2 - y1, 2);
        double sumt= sumx + sumy;
        double dist = Math.sqrt(sumt); 
        int distmetros =(int) dist * 100000;
        return distmetros; 
    } 
}

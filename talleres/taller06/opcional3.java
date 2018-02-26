import java.util.Arrays;
public class opcional3
{
    public static int [] f(int n){
        int [] a = new int[1];
        int b = 1;
        int c = 0;
        while(b<=n){
            for(int i = 1; i <= b; i++){
                a[c] = i;
                c++;
                a = Arrays.copyOf(a,a.length+1);
            }
            b++;
        }
        a = Arrays.copyOf(a,a.length-1);
        return a;
    }
}



public class NumeroMaximoArreglo
{
    private static int [] GeneArrUnMillon(int a){
        int b = 0;
        int c[]= new int[a];
        while(b < a){
            c[b] = (int)(Math.random() * 5) + 1;
            b++;
        }
        return c;
    }

    public static int Max_arreglos(int [] a){
        return Max_arregloAux(a,0,0);
    }

    public static int Max_arreglos100MILlONES(){
        return Max_arregloAux(GeneArrUnMillon(1000),0,0);
    }

    private static int Max_arregloAux(int[]a,int i,int Max){
        if(i == a.length) { return Max;
        }else if(a[i]>Max){
            Max = a[i];
            return Max_arregloAux(a,i+1,Max);
        }else{
            return Max_arregloAux(a,i+1,Max);
        }
    }
}


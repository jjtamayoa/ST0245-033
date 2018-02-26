import java.util.Arrays;
import java.io.IOException;
public class Myarraylist {
    private int size;
    private static final int DEFAULF_CAPACITY = 10;
    private int elements[];

    public  Myarraylist(){
        this.elements = new int[DEFAULF_CAPACITY];
        size = 0;
    }

    public  Myarraylist(int [] a){
        elements = a;
    }

    public int size(){
        //size = elements.length;
        return size;
    }

    public void add(int e) {
        if (elements.length == size){
            elements = Arrays.copyOf(elements,size() + 1);
            elements[size()] = e;
        }else{
            elements[size()] = e;
        }
        size++;
    }

    public int get(int i) throws IOException {
        if (i < 0 || i >= size){
            throw new IndexOutOfBoundsException("excepcion fuera del limite del indice  "+ i);
        }else{
            return elements[i];
        }
    }

    public void add(int index, int e){
        if(elements.length == size){
            int[] a = Arrays.copyOf(elements,size());
            elements = Arrays.copyOf(elements,size() + 1);
            for (int i = 0; i < size()-1;i++){
                if(i == index ){
                    elements[i]= e;
                }
                if(i > index){
                    elements[i]= a[i-1];
                }

            }
            elements[size()-1]= a[size()-2];
        }else{

            for (int i = 0; i < size()-1;i++){
                if(i == index ){
                    elements[i]= e;
                }
                if(i > index){
                    elements[i]= elements[i-1];
                }     
            }
        }
        size++;
    }

    public int[] ver(){
        return elements;
    }
}

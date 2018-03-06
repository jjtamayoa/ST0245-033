import java.util.*;
public class LinkedListn{
    public Nodo primero,fin;
    private int size;
    public class Nodo {
        public int dato;
        public Nodo siguiente;//puntero de enlace nodo
        public Nodo(int dato) {
            siguiente = null;
            this.dato = dato;
        }

        public Nodo(int dato,Nodo n){
            this.dato = dato;
            siguiente = n;
        }
    }

    public LinkedListn(){
        size = 0;
        primero = null;
    }

    public LinkedListn(int[]a){   
        for(int i = 0; i < a.length ; i++){
            insert(a[i],i);
        }
    }

    public LinkedListn(LinkedListn a){
        size = a.size();   
        for(int i = 0; i < size ; i++){
            insert(a.get((size-1)-i));
        }

    }

    private Nodo getNode(int index) throws IndexOutOfBoundsException {
        if (index >= 0 && index < size) {
            Nodo temp = primero;
            for (int i = 0; i < index; i++) {
                temp = temp.siguiente;
            }
            return temp;
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    public int get(int index){
        Nodo temp = null;
        try {
            temp = getNode(index);
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
            System.exit(0);
        }
        return temp.dato;
    }

    public void insert(int elemento){
        primero = new Nodo(elemento,primero);
        if(fin == null){
            fin = primero;
        }
        size++;
    }

    public void mostrarlista(){
        Nodo recorrer = primero;
        while(recorrer != null){
            System.out.print("["+recorrer.dato+"] -->");//imprime el nodo lafecha es simular el apuntador
            recorrer = recorrer.siguiente;//pasa al siguinete
        }
    }

    public int size(){
        return size;
    }

    public void insert(int data, int index)
    {
        //Si el tamaño es 0
        if (index < 0 || index > size) {
            return;
        }else{
            if(size()==0){
                primero = new Nodo(data);
            }else if(index == 0){
                Nodo act = primero;
                Nodo n = new Nodo(data);
                primero = n;
                n.siguiente = act;
            }else{
                Nodo act = primero;
                Nodo sig = primero;
                for (int i = 0; i < index; ++i) {
                    act = sig;
                    sig = sig.siguiente;
                }
                Nodo n = new Nodo(data);
                act.siguiente = n;
                n.siguiente = sig;
            }
            size++;
        }
    }

    public void remove(int elemento){
        if(size()!=0){
            if(primero == fin && elemento == primero.dato){
                primero = fin = null;
            }else if( elemento == primero.dato){
                primero = primero.siguiente;
                size--;
            }else{
                Nodo anterior,temporal;
                anterior = primero;
                temporal= primero.siguiente;
                while(temporal != null &&temporal.dato != elemento){
                    anterior=anterior.siguiente;
                    temporal=temporal.siguiente;
                }

                if(temporal != null){
                    anterior.siguiente = temporal.siguiente;
                    if(temporal==fin){
                        fin = anterior;
                    }
                }
                size--;
            }
        }
    }

    public boolean contains(int dato){
        Nodo temporal = primero;
        while(temporal != null && temporal.dato != dato){
            temporal = temporal.siguiente;
        }
        return temporal != null;
    }

    public int maximo(LinkedListn l){
        Nodo temporal = l.primero;
        return maximoAux(temporal,0);
    }
    //aux anterior
    private int maximoAux(Nodo temp,int max){
        if(temp != null){
            if(temp.dato > max){
                max = temp.dato;
                temp = temp.siguiente;
                return maximoAux(temp,max);
            }
        }
        return max;
    }

    public boolean compara(LinkedListn a,LinkedListn b){
        Nodo temporal = a.primero;
        Nodo temporal1 = b.primero;
        if(a.size != b.size()||a.primero == null){
            return false;
        }else{
            while(temporal != null){
                if(temporal.dato != temporal1.dato)return false;
                temporal = temporal.siguiente;
                temporal1 = temporal1.siguiente;
            }
            return true;
        }
    }

}

class Arbol {
    public Nodo raiz;
    Arbol(){
        raiz = null;
    }

    public  void insertar(int n){
        Nodo nuevo = new Nodo(n);
        if(raiz == null){
            raiz = nuevo;
        }
        else{
            Nodo aux = raiz;
            Nodo padre;
            while(true){
                padre = aux;
                if(n<aux.dato){
                    aux = aux.izquierda;
                    if(aux == null){
                        padre.izquierda = nuevo;
                        return;
                    }
                }else{
                    aux = aux.derecha;
                    if(aux == null){
                        padre.derecha = nuevo;
                        return;
                    }
                }
            }
        }
    }

    public boolean buscar(int n){
        Nodo aux = raiz;
        if(raiz == null){
            return false;
        }
        else{
            while(aux.dato != n){
                if(n < aux.dato){
                    aux = aux.izquierda;
                }else{
                    aux = aux.derecha;
                }

                if(aux == null){
                    return false;
                }
            }

            if(aux.dato == n){
                return true;
            }
            return false;
        }
    }

    public void eliminar(int dato){
        Eliminar2(raiz,dato);
    }

    private void Eliminar2( Nodo r, int dato)
    {
        Nodo otro = r;
        Nodo aux = null;
        Nodo aux1 = null;
        if(r == null){
            return;
        }

        if(r.dato == dato){
            r = null;
            return;
        }

        if (dato < r.dato ){
            Eliminar2(r.izquierda, dato);
        } 

        if (dato >= r.dato){
            Eliminar2(r.derecha, dato);
        }

        if ((otro.derecha == null) && (otro.izquierda== null)){
            otro = null;
        }else{
            if (otro.derecha == null){
                r = otro.izquierda;
            }else
            if (otro.izquierda== null){
                r= otro.derecha;}

            else{
                aux = otro.izquierda;
                aux1 = aux;
                while (aux.derecha != null){
                    aux1 = aux;
                    aux = aux.derecha;
                }
                otro.dato = aux.dato;
                otro = aux;
                aux1.derecha = aux.izquierda;
                aux = null;
            }
        }

    }

}

public class Nodo
{
    //miembros de acceso
    Nodo izquierda;
    int dato;
    Nodo derecha;

    //iniciar dato y hacer de este nodo un nodo hoja
    public Nodo(int dato_)
    {
        dato = dato_;
        izquierda = derecha = null; //el nodo no tiene hijos
    }

}

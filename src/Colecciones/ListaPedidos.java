package Colecciones;

import Clases.NodoPedido;
import Clases.Pedido;
import java.io.Serializable;
import java.util.ArrayList;

public class ListaPedidos implements Serializable{

    public NodoPedido cabeza;
    private int longitud;

    public ListaPedidos() {
        cabeza = null;
        longitud = 0;
    }

    public void insertar(Pedido p) {
        NodoPedido nodo = new NodoPedido(p);
        nodo.siguiente = cabeza;
        cabeza = nodo;
        longitud++;
    }

    public int getLongitud() {
        return longitud;
    }

    public boolean estaVacia() {
        return cabeza == null;
    }

    public int nElementos() {
        return longitud;
    }
}

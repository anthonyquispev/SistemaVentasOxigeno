
package Clases;

public class NodoCola {
    public Pedido INFO;
    public NodoCola siguiente;
    
    public NodoCola(Pedido dato){
        this.INFO = dato;
        this.siguiente = null;
    }
}


package Clases;

import java.io.Serializable;

public class NodoPedido implements Serializable{
    public Pedido pedido;
    public NodoPedido siguiente;
    
    public NodoPedido(Pedido pedido) {
        this.pedido = pedido;
        this.siguiente = siguiente;
    }
}

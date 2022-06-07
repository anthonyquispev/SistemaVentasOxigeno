package Clases;

import java.io.Serializable;
import java.util.Date;

public class Pedido implements Serializable {

    //Atributos
    private String ClienteDni;
    private Date fechaPedido;
    private int cantidadTotal;
    private int montoCobrar;
    //Contructor

    public Pedido(String ClienteDni, int cantidadTotal, int montoCobrar) {
        this.ClienteDni = ClienteDni;
        this.fechaPedido = new Date();
        this.cantidadTotal = cantidadTotal;
        this.montoCobrar = montoCobrar;
    }

    public String getClienteDni() {
        return ClienteDni;
    }

    public void setClienteDni(String ClienteDni) {
        this.ClienteDni = ClienteDni;
    }

    public Date getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(Date fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    public int getCantidadTotal() {
        return cantidadTotal;
    }

    public void setCantidadTotal(int cantidadTotal) {
        this.cantidadTotal = cantidadTotal;
    }

    public int getMontoCobrar() {
        return montoCobrar;
    }

    public void setMontoCobrar(int montoCobrar) {
        this.montoCobrar = montoCobrar;
    }
}

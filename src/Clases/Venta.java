
package Clases;

public class Venta {
    private int numVenta;
    private Fecha fechaVenta;

    public Venta(int numVenta, Fecha fechaVenta) {
        this.numVenta = numVenta;
        this.fechaVenta = fechaVenta;
    }

    public int getNumVenta() {
        return numVenta;
    }

    public void setNumVenta(int numVenta) {
        this.numVenta = numVenta;
    }

    public Fecha getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(Fecha fechaVenta) {
        this.fechaVenta = fechaVenta;
    }
    
    public void mostrarVenta(){
        System.out.println("Número de venta: "+numVenta);
        System.out.println("Fecha de venta: "+fechaVenta.toString());
    }
}

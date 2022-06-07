
package Clases;

public class Tarjeta {
    
    private String idTarjeta;
    private float saldo;

    public Tarjeta(String idTarjeta, float saldo) {
        this.idTarjeta = idTarjeta;
        this.saldo = saldo;
    }

    public float getSaldo() {
        return saldo;
    }

    public String getIdTarjeta() {
        return idTarjeta;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
      
}

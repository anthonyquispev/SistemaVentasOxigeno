package Clases;

public class Repartidor extends Persona {

    //Atributos
    private int codRepartidor;
    private float sueldo;
    private String direccionAsignada;
    //Constructor

    public Repartidor(int codRepartidor, float sueldo, String DNI, String Nombres, String Apellidos, String Email) {
        super(DNI, Nombres, Apellidos, Email);
        this.codRepartidor = codRepartidor;
        this.sueldo = sueldo;
    }

    public int getCodRepartidor() {
        return codRepartidor;
    }

    public void setCodRepartidor(int codRepartidor) {
        this.codRepartidor = codRepartidor;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    public String getDireccionAsignada() {
        return direccionAsignada;
    }

    public void setDireccionAsignada(String direccionAsignada) {
        this.direccionAsignada = direccionAsignada;
    }

}

package Clases;

public class Planta {

    private int ruc;
    private String razonSocial;
    private int telefono;
    private String direccion;

    public Planta(int ruc, String razonSocial, int telefono, String direccion) {
        this.ruc = ruc;
        this.razonSocial = razonSocial;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public int getRuc() {
        return ruc;
    }

    @Override
    public String toString() {
        return "DATOS DE LA PLANTA\n" + "RUC: " + ruc + "\nRazon Social: " + razonSocial + "\nTelefono: " + telefono + "\nDireccion: " + direccion + "\n";
    }
}

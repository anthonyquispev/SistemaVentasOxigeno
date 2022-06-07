package Clases;

public class NodoBoleta {

    Cliente C;
    NodoBoleta sig;
    NodoBoleta ant;

    public NodoBoleta(Cliente C) {
        this.C = C;
        this.sig = null;
        this.ant = null;
    }
}

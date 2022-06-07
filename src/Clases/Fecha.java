
package Clases;

import java.io.Serializable;

public class Fecha implements Serializable {
    int dia;
    int mes;
    int anio;

    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public Fecha(){
        this.anio = 0;
        this.mes = 0;
        this.dia = 0;
    }
    @Override
    public String toString() {
        return dia +"/"+mes+"/"+anio;
    }
}

package Clases;

import java.io.Serializable;

public class Hora implements Serializable {
    private int hora;
    private int min;
    private int seg;

    public Hora(int hora, int min, int seg) {
        this.hora = hora;
        this.min = min;
        this.seg = seg;
    }
    
    public Hora(){
        this.hora = 0;
        this.min = 0;
        this.seg = 0;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getSeg() {
        return seg;
    }

    public void setSeg(int seg) {
        this.seg = seg;
    }

    @Override
    public String toString() {
        return hora + ":" + min + ":" + seg;
    } 
}

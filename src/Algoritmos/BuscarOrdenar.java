
package Algoritmos;

import Clases.Lista;
import Clases.Repartidor;

public class BuscarOrdenar {

    private final Repartidor repartidores[];
    private Lista ListaRepartidores;
    private final int NUMERO_REPARTIDORES = 20;
       
    public BuscarOrdenar() {
        int codigos[] = {100, 102, 105, 106, 147, 165, 180, 204, 205, 215, 
            305, 312, 340, 415, 420, 500, 510, 540, 600, 601};
        String nombres[] = {"Martha", "Rosa", "Rosa", "Pedro", "Pablo",
            "Marcelo", "Luis", "Juan", "Carlos", "Francis", "Ana",
            "Diana", "Ricardo", "Raúl", "Karen", "Rosario", "Carolina",
            "Saúl", "Dámaris", "Ingrid"};
        float sueldos[] = {900, 750, 2000, 3500, 950, 1400, 3500, 1500, 550, 1500,
            800, 1800, 1200, 1200, 4000, 1800, 600, 750, 4000, 5500};
        String DNI[] = {"4674142484", "4674142484", "4674142484", "4674142484", "4674142484", "4674142484", "4674142484", "4674142484", "4674142484", "4674142484",
            "4674142484", "4674142484", "4674142484", "4674142484", "4674142484", "4674142484", "4674142484", "4674142484", "4674142484", "4674142484"};
        String apellidos[] = {"Gomez", "Lopez", "Gonzalez", "Zacarias", "Aybar", "Fernandez", "Guerra", "Farfán", "Suarez", "Valdéz",
            "Flores", "Díaz", "Herrera", "Álvarez", "Guillén", "Pedraza", "Palacios", "Rodriguez", "Brivio", "Moreno"};
        String emails[] = {"Martha@gmail.com", "Rosa@gmail.com", "Rosa@gmail.com", "Pedro@gmail.com", "Pablo@gmail.com",
            "Marcelo@gmail.com", "Luis@gmail.com", "Juan@gmail.com", "Carlos@gmail.com", "Francis@gmail.com", "Ana@gmail.com",
            "Diana@gmail.com", "Ricardo@gmail.com", "Raúl@gmail.com", "Karen@gmail.com", "Rosario@gmail.com", "Carolina@gmail.com",
            "Saúl@gmail.com", "Dámaris@gmail.com", "Ingrid@gmail.com"};
        
        repartidores = new Repartidor[NUMERO_REPARTIDORES];
        ListaRepartidores = new Lista();
        for (int i = 0; i < repartidores.length; i++) {
            repartidores[i] = new Repartidor(codigos[i], sueldos[i], DNI[i], nombres[i], apellidos[i], emails[i]);
            ListaRepartidores.agregarAlInicio(repartidores[i]); //Agregando a una Lista
        }
        ListaRepartidores.mostrarLista();
    }
    
    public int busquedaBinariaRecursiva (int codigo) {
        return binariaRecursiva (0, repartidores.length-1, codigo);
    }
    
    private int binariaRecursiva (int ini, int fin, int codigo) {
        int medio;
        if (ini > fin) {    
            return -1;
        } else {
            medio = (ini + fin)/2;
            if (codigo == repartidores[medio].getCodRepartidor()) {
                return medio;
            } else {
                if (codigo < repartidores[medio].getCodRepartidor()) {
                    return binariaRecursiva (ini, medio-1, codigo);
                } else {
                    return binariaRecursiva (medio+1, fin, codigo);
                }
            }
        }
    }
    public int getCodigoDelEmpleado(int i) {
        return repartidores[i].getCodRepartidor();
    }

    public void setCodigoDelEmpleado(int codigo, int i) {
        repartidores[i].setCodRepartidor(codigo);
    }

    public String getNombreDelEmpleado(int i) {
        return repartidores[i].getNombres();
    }

    public void setNombreDelEmpleado(String nombre, int i) {
        repartidores[i].setNombres(nombre);
    }

    public float getSueldoDelEmpleado(int i) {
        return repartidores[i].getSueldo();
    }

    public void setSueldoDelEmpleado(float sueldo, int i) {
        repartidores[i].setSueldo(sueldo);
    }
    
    public String getDNIEmpleado(int i){
        return repartidores[i].getDNI();
    }
    public void setDNIEmpleado(String DNI, int i){
        repartidores[i].setDNI(DNI);
    }
    public String getApellidoEmpleado(int i){
        return repartidores[i].getApellidos();
    }
    public void setApellidoEmpleado(String Apellido, int i){
        repartidores[i].setApellidos(Apellido);
    }
    public String getEmail(int i){
        return repartidores[i].getEmail();
    }
    public void setEmail(String email, int i) {
        repartidores[i].setEmail(email);
    }
    public int getNumeroDeEmpleados() {
        return NUMERO_REPARTIDORES;
    }
    
}

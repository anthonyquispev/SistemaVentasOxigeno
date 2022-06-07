
package Clases;

import java.io.Serializable;

public class NodoLista implements Serializable{
    public Repartidor dato;
    public NodoLista siguiente; //Puntero enlace
    
    //Constructor para insertar al final
    public NodoLista(Repartidor d){
        dato = d;
        siguiente = null;
    }
    //Constructor para insertar al inicio
    public NodoLista(Repartidor d, NodoLista n){
        dato = d;
        siguiente = n;
    }
}

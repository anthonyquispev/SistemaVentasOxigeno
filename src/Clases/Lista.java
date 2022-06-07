
package Clases;

import javax.swing.JOptionPane;

public class Lista {

    protected NodoLista inicio, fin; //Punteros para saber donde está el inicio y el final

    public Lista() {
        inicio = null;
        fin = null;
    }
    
    //Método para saber si una Lista está vacía
    public boolean estaVacia() {
        return inicio == null;
    }
    //Método para agregar un nodo al inico de la Lista
    public void agregarAlInicio(Repartidor elemento) {
        //Creando al nodo 
        inicio = new NodoLista(elemento, inicio);
        if (fin == null) {
            fin = inicio;
        }
    }
    //Método para agregar un nodo al final de la Lista
    public void agregarAlFinal(Repartidor elemento) {
        if (!estaVacia()) {
            fin.siguiente = new NodoLista(elemento);
            fin = fin.siguiente;
        } else {
            inicio = fin = new NodoLista(elemento);
        }
    }
    //Método para borrar el nodo del inicio
    public Object borrarDelInicio() {
        Object elemento = inicio.dato;
        if (inicio == fin) {
            inicio = fin = null;
        } else {
            inicio = inicio.siguiente;
        }
        return elemento;
    }
    //Método para borrar el nodo del final
    public Object borrarDelFinal() {
        Object elemento = fin.dato;
        //En el caso que solo haya un nodo
        if (inicio == fin) {
            inicio = fin = null;
        } else {
            NodoLista temporal = inicio;
            while (temporal.siguiente != fin) {
                temporal = temporal.siguiente;
            }
            fin = temporal;
            fin.siguiente = null;
        }
        return elemento;
    }

    //Método para eliminar un nodo específico
    public void eliminarNodoEspecifico(Object elemento) {
        //En caso que solo haya un nodo 
        if (inicio == fin && elemento == inicio.dato) {
            inicio = fin = null;
            //Verificamos el nodo inicial
        } else if (elemento == inicio.dato) {
            inicio = inicio.siguiente;
        } else {
            NodoLista anterior, temporal;
            anterior = inicio;
            temporal = inicio.siguiente;

            while (temporal != null && temporal.dato != elemento) {
                anterior = anterior.siguiente;
                temporal = temporal.siguiente;
            }
            if (temporal != null) {
                anterior.siguiente = temporal.siguiente;
                if (temporal == fin) {
                    fin = anterior;
                }
            }
        }
    }

    //Método para buscar un elemento de la Lista
    public boolean estaEnLaLista(Object elemento) {
        NodoLista temporal = inicio;

        while (temporal != null && temporal.dato != elemento) {
            temporal = temporal.siguiente;
        }
        return temporal != null;
    }
    //Método para mostrar los datos
    public void mostrarLista() {
        NodoLista recorrer = inicio;
        if (recorrer == null) {
            JOptionPane.showMessageDialog(null, "La Lista está vacía");
        } else {
            System.out.print("\n");
            while (recorrer != null) {
                System.out.println(recorrer.dato.getCodRepartidor());
                System.out.println(recorrer.dato.getNombres());
                System.out.println(recorrer.dato.getApellidos());
                System.out.println(recorrer.dato.getDNI());
                System.out.println(recorrer.dato.getSueldo());
                System.out.println(recorrer.dato.getEmail());
                recorrer = recorrer.siguiente;
                System.out.println("-------------------------------------");
            }
        }
    }
   
    public void recorridoRecursivo(NodoLista cab) {
        if (cab != null) {
            System.out.print(cab.dato + " ");
            recorridoRecursivo(cab.siguiente);
        }
    }
    public void mostarRecursivo() {
        recorridoRecursivo(inicio);
    }
     
}

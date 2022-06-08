package Colecciones;

import Clases.NodoPedido;
import Clases.Pedido;
import java.io.Serializable;

public class ColaPedidos implements Serializable{

    public NodoPedido frente, ultimo;
    private int longitud;

    public ColaPedidos() {
        frente = ultimo = null;
        longitud = 0;
    }

    //Inserción por el final
    public void encolar(Pedido p) {
        NodoPedido nuevoNodo = new NodoPedido(p);
        if (frente == null) {
            frente = ultimo = nuevoNodo;
        } else {
            ultimo.siguiente = nuevoNodo;
            ultimo = nuevoNodo;
        }
        longitud++;
    }

    //Eliminar por el frente
    public Pedido desencolar() {
        Pedido p = null;
        if (!vacio()) {
            p = frente.pedido;
            if (frente == ultimo) {
                frente = ultimo = null;
            } else {
                frente = frente.siguiente;
            }
            longitud--;
        }
        return p;
    }

    public boolean vacio() {
        return frente == null;
    }

    public String[][] obtenerPedidosClientes() {
        if (!vacio()) {
            String[][] s = new String[longitud][4];
            int i = 0;
            NodoPedido temp = frente;
            while (temp != null) {
                s[i][0] = String.valueOf(temp.pedido.getClienteDni());
                s[i][1] = String.valueOf(temp.pedido.getFechaPedido());
                s[i][2] = String.valueOf(temp.pedido.getCantidadTotal());
                s[i][3] = String.valueOf(temp.pedido.getMontoCobrar());
                i++;
                temp = temp.siguiente;
            }
            return s;
        }
        return null;
    }

    private int npedidos(int barra, int opcion) {
        int n = 0;
        int r = 0;
        if (opcion == 2) {
            r = 2;
        }
        if (opcion == 3) {
            r = 3;
        }
        String datos[][] = obtenerPedidosClientes();
        for (int i = 0; i < datos.length; i++) {
            if (Integer.parseInt(datos[i][r]) == barra) {
                n++;
            }
        }
        return n;
    }

    public String[][] getDatosPedidos(int barra, int opcion) {
        int r = 0;
        if (opcion == 2) {
            r = 2;
        }
        if (opcion == 3) {
            r = 3;
        }

        String datos[][] = obtenerPedidosClientes();
        int n = datos.length;
        String[][] s = new String[npedidos(barra, opcion)][4];
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (Integer.parseInt(datos[i][r]) == barra) {
                s[j][0] = datos[i][0];
                s[j][1] = datos[i][1];
                s[j][2] = datos[i][2];
                s[j][3] = datos[i][3];
                j++;
            }
        }
        return s;
    }

    public String[][] OrdenSeleccionDirecta(int opcion) {
        String[] menor = new String[4];
        int k;
        int r = 0;
        if (opcion == 1) {
            r = 2;
        }
        if (opcion == 2) {
            r = 3;
        }
        String datos[][] = obtenerPedidosClientes();
        if (datos != null) {
            for (int i = 0; i <= datos.length - 2; i++) {
                menor = datos[i];
                k = i;
                for (int j = i + 1; j <= datos.length - 1; j++) {
                    if (Integer.parseInt(datos[j][r]) < Integer.parseInt(menor[r])) {
                        menor = datos[j];
                        k = j;
                    }
                }
                datos[k] = datos[i];
                datos[i] = menor;
            }
        }

        return datos;
    }
}

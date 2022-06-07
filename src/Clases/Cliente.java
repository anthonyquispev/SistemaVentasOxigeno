package Clases;

import Colecciones.ListaPedidos;
import java.io.Serializable;

public class Cliente extends Persona implements Serializable {

    //Atributos
    String Usuario;
    String Contrasenia;
    String Direccion;
    String Telefono;
    private Tarjeta tarjeta;
    private ListaPedidos pedidos;
    //Constructor

    public Cliente(String Usuario, String Contrasenia, String Direccion,
            String Telefono, String DNI, String Nombres, String Apellidos,
            String Email) {
        super(DNI, Nombres, Apellidos, Email);
        this.Usuario = Usuario;
        this.Contrasenia = Contrasenia;
        this.Direccion = Direccion;
        this.Telefono = Telefono;
        this.pedidos = new ListaPedidos();
    }

    //Getter&Setter
    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getContrasenia() {
        return Contrasenia;
    }

    public void setContrasenia(String Contrasenia) {
        this.Contrasenia = Contrasenia;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    //Métodos
    public boolean validar(String usuario, String DNI) {
        if (this.Usuario.equalsIgnoreCase(usuario) && this.DNI.equals(DNI)) {
            return true;
        }
        return false;
    }

    public boolean sesion(String contrasenia, String usuario) {
        if (this.Usuario.equalsIgnoreCase(usuario) && this.Contrasenia.equals(contrasenia)) {
            return true;
        }
        return false;
    }

    public void insertarPedido(Pedido pedido) {
        this.pedidos.insertar(pedido);
    }

    public String[][] obtenerPedidos() {
        if (!this.pedidos.estaVacia()) {
            String[][] s = new String[pedidos.nElementos()][4];
            int i = 0;
            NodoPedido temp = pedidos.cabeza;
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
        String datos[][] = obtenerPedidos();
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

        String datos[][] = obtenerPedidos();
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
        String datos[][] = obtenerPedidos();
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

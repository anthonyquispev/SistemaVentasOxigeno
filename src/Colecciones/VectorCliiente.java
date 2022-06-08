package Colecciones;

import Clases.Cliente;
import java.io.Serializable;
import java.util.Vector;

public class VectorCliiente implements Serializable {
    //Atributos
    private Vector<Cliente> Client = new Vector<Cliente>();
    
    //Constructor
    public VectorCliiente() {
        this.Client = new Vector<>();
    }

    //Getters && Setters
    public Vector<Cliente> getClient() {
        return Client;
    }

    public void setClient(Vector<Cliente> Client) {
        this.Client = Client;
    }

    //Métodos
    public void Agregar(Cliente c) {
        this.Client.add(c);
    }

    public Vector Mostrar() {
        return this.Client;
    }

    public boolean buscarCliente(String NombreUsuario) {//Búsqueda secuencial
        for (Cliente cli : this.Client) {
            if (cli.getUsuario().equalsIgnoreCase(NombreUsuario)) {
                return true;
            }
        }
        return false;
    }

    public Cliente validar(String DNI, String usuario) {
        for (Cliente obj : this.Client) {
            if (obj.validar(usuario, DNI)) {
                return obj;
            }
        }
        return null;
    }

    public Cliente sesion(String contrasenia, String usuario) {
        for (Cliente obj : this.Client) {
            if (obj.sesion(contrasenia, usuario)) {
                return obj;
            }
        }
        return null;
    }

    public boolean ingresar(Cliente cli) {
        if (!buscarCliente(cli.getUsuario())) {
            validar(cli.getDNI(), cli.getUsuario());
            Agregar(cli);
            return true;
        }
        return false;
    }

    public String[] get_Título_Cliente() {
        String result[] = new String[8];
        result[0] = "Usuario";
        result[1] = "Contraseña";
        result[2] = "Direccion";
        result[3] = "Telefono";
        result[4] = "DNI";
        result[5] = "Nombres";
        result[6] = "Apellidos";
        result[7] = "Email";
        return result;
    }

    public String[][] getCliente() {
        String[][] result = new String[this.Client.size()][8];
        int i = 0;
        for (Cliente cli : this.Client) {
            if (cli != null) {
                result[i][0] = cli.getUsuario();
                result[i][1] = cli.getContrasenia();
                result[i][2] = cli.getDireccion();
                result[i][3] = cli.getTelefono();
                result[i][4] = cli.getDNI();
                result[i][5] = cli.getNombres();
                result[i][6] = cli.getApellidos();
                result[i][7] = cli.getEmail();
                i++;
            }
        }
        return result;
    }

    public String[][] obtenerUsuarios() {
        String[][] s = new String[Client.size()][3];
        int i = 0;
        for (Cliente c : Client) {
            s[i][0] = c.getNombres() + " " + c.getApellidos();
            s[i][1] = c.getUsuario();
            s[i][2] = c.getContrasenia();
            i++;
        }
        return s;
    }

}

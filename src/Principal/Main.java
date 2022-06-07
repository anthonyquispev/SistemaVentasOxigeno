package Principal;

import Clases.Sistema;
import VentanaPrincipal.JFrame_Login;
import Serializador.SerializadoraGen;

public class Main {

    public static void main(String[] args) {

//        Serializar
//        VectorCliiente tempC = new VectorCliiente();
//        tempC.Agregar( new Cliente("usuario01", "contra01", "Carabayllo", "945125632", "789456121", "Miguel", "Sánchez Velásquez", "Migu@yahoo.com"));
//        SerializadoraGen.serializarClientes("Clientes.txt", tempC);

        /* CUENTAS
            -Clientes  ->  usuario01 : contra01
            -Admin     ->  admin : admin
        */

        //Deserializar
        Sistema.cliente = SerializadoraGen.deserializarClientes("Clientes.txt");
        Sistema.colaPedidos = SerializadoraGen.deserializarMensajesClientes("ColaPedidos.txt");

        JFrame_Login VP = new JFrame_Login();
        VP.setLocationRelativeTo(null);
        VP.setVisible(true);

        VP.show();
    }
}

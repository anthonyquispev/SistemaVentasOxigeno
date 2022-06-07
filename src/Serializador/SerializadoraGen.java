
package Serializador;

import Colecciones.VectorCliiente;
import Colecciones.ColaPedidos;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializadoraGen {
    
    public static void serializarClientes(String nombreArchivo, VectorCliiente tempClientes) {
        try{
            FileOutputStream file = new FileOutputStream(nombreArchivo);
            ObjectOutputStream escritor = new ObjectOutputStream(file);
            escritor.writeObject(tempClientes);
            escritor.flush();
        }catch(IOException e){
            throw new RuntimeException(e);
        }        
    }

    public static VectorCliiente deserializarClientes(String nombreArchivo){
        VectorCliiente retorno = new VectorCliiente();
        try{
            FileInputStream file = new FileInputStream(nombreArchivo);
            ObjectInputStream lector = new ObjectInputStream(file);
            retorno = (VectorCliiente) lector.readObject();
        }catch( FileNotFoundException e){
            throw new RuntimeException(e);
        }catch(IOException e){
            throw new RuntimeException(e);
        }catch(ClassNotFoundException e){
            throw new RuntimeException(e);
        }
        return retorno;
    }
 
    public static void serializarMensajesClientes(String nombreArchivo, ColaPedidos pedidos) {
        try{
            FileOutputStream file = new FileOutputStream(nombreArchivo);
            ObjectOutputStream escritor = new ObjectOutputStream(file);
            escritor.writeObject(pedidos);
            escritor.flush();
        }catch(IOException e){
            throw new RuntimeException(e);
        }        
    }

    public static ColaPedidos deserializarMensajesClientes(String nombreArchivo){
        ColaPedidos retorno = new ColaPedidos();
        try{
            FileInputStream file = new FileInputStream(nombreArchivo);
            ObjectInputStream lector = new ObjectInputStream(file);
            retorno = (ColaPedidos) lector.readObject();
        }catch( FileNotFoundException e){
            throw new RuntimeException(e);
        }catch(IOException e){
            throw new RuntimeException(e);
        }catch(ClassNotFoundException e){
            throw new RuntimeException(e);
        }
        return retorno;
    }    
    
}


package Serializador;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Vector;

public class Serializador {
    
    public static void Serializar (String sNombreArchivo, Vector  arreglo) {
        try {
            ObjectOutputStream escritor = new  ObjectOutputStream (new FileOutputStream (sNombreArchivo));
            escritor.writeObject(arreglo);
            escritor.flush();
            System.out.println("Archivo "+sNombreArchivo+ " guardado correctamete\n");
            escritor.close();
        } catch (IOException e) {
            System.out.println("ERROR -> SERIALIZAR USUARIOS -> SERIALIZADOR");
        }
    }
    
    public static Vector Deserializar (String sNombreArchivo) {
        Vector v = new Vector ();
        try{
            ObjectInputStream lector = new ObjectInputStream(new FileInputStream(sNombreArchivo)); 
            v = (Vector)lector.readObject();
            lector.close();
        } catch (Exception e){
            System.out.println("ERROR -> DESSERIALIZAR USUARIOS -> SERIALIZADOR");
        }
        return v;
    }
    
}

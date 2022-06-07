
package Serializador;

import Clases.NodoCola;
import Clases.Pedido;
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
        //    throw new RuntimeException(e);
            System.out.println("ERROR -> SERIALIZAR USUARIOS -> SERIALIZADOR");
        }
    }
    
    public static Vector Deserializar (String sNombreArchivo) {
        Vector v = new Vector ();
        try{
            ObjectInputStream lector = new ObjectInputStream(new FileInputStream(sNombreArchivo)); 
            v = (Vector)lector.readObject();
            lector.close();
    /*    } catch ( FileNotFoundException e){
            throw new RuntimeException(e);
        } catch (IOException e){
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);*/
        } catch (Exception e){
            System.out.println("ERROR -> DESSERIALIZAR USUARIOS -> SERIALIZADOR");
        }
        return v;
    }
    
//    public static void SerializarPedido(Cola A){
//        String fichero = "FicheroPedido";
//        Cola C = A;
//        NodoCola aux = A.inicio;
//        // inicio y fin (Cola) los hize public
//        // siguiente (NodoCola) también public
//        try {
//            ObjectOutputStream escritor = new  ObjectOutputStream (new FileOutputStream (fichero));
//            while(aux != null){
//                escritor.writeObject(aux.INFO);
//                escritor.flush();
//                aux = aux.siguiente;
//            }
//            escritor.writeUnshared(null); // indica final
//            escritor.close();
//        } catch (IOException e) {
//            System.out.println(" ERROR -> SERIALIZAR PEDIDO -> SERIALIZADOR");
//        }
//    }
//    
//    public static Cola DeserializarPedido(){
//        String fichero = "FicheroPedido";
//        Pedido P;
//        Cola C = new Cola();
//        
//        try{
//            ObjectInputStream lector = new ObjectInputStream(new FileInputStream(fichero));
//            P = (Pedido) lector.readObject();
//            
//            while(P != null){
//                C.insertar(P);
//                P = (Pedido) lector.readObject();
//            }
//            
//            lector.close();
//            return C;
//        }catch(Exception e){
//            System.out.println(" ERROR -> DESERIALIZAR PEDIDO -> SERIALIZADOR");
//            return null;
//        }
//    }
    
}

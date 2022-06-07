/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

//CLASE BALON_GAS
public class Balon_Gas {
//    int stock;
//    String tipo;
//    float precio;
//    int capacidadLitros;
//    boolean estado;

//    public Balon_Gas(int stock, String tipo, float precio, int capacidadLitros) {
//        this.stock = stock;
//        this.tipo = tipo;
//        this.precio = precio;
//        this.capacidadLitros = capacidadLitros;
//    }
    private static final String tipo[] = {"M2","M4","ML6","M6","M7","M9","M15","M22","M24"};
    private static final int precio[] = {80,100,150,200,250,300,400,500,550};
    private static final int capacidadLitros[] = {42,113,165,164,198,255,425,640,680};
    private static final int stock[] = {5, 5, 5 ,5 ,5, 5, 5, 5, 5};
    private static boolean estado;
    public Balon_Gas(){
        /*
        
        m2 - 80
        m4 - 100
        m6 - 150
        
        String 
        
        
        
        
        
        
        
        
        
        
        */
    }
  
//    public void datosBalon(int po){
//        if(disponible()){
//            System.out.println("DATOS DEL BALON\n"
//                    +"Tipo: "+tipo[po-1]+"\n"+
//                    "Precio: "+precio[po-1]+"\n"+
//                    "Capacidad: "+capacidadLitros[po-1]+"\n"+
//                    "Stock: "+stock+"\n");
//        }else{
//            System.out.println("Balon del tipo "+tipo[po-1]+" AGOTADO");
//        }
//    }
    
    public static boolean disponible(int i, int j){
        return stock[j]>=i;
    }
    
    public static void reducir(int i, int j){
        if (disponible(j, i)) {
            stock[i] = stock[i]-j;
        }
    }

    public static void restaurar(){
        for (int i = 0; i < stock.length; i++) {
            stock[i] = 5;
        }
    }
}

package Clases;

// CLASE BOLETA (LISTA)
public class ListaBoleta {
    
    NodoBoleta Inicio;
    NodoBoleta Final;

    public ListaBoleta() {
        this.Inicio = null;
        this.Final = null;
    }
    
    public void  AñadirBoleta(Cliente C){ // añade al final
        NodoBoleta Nuevo = new NodoBoleta(C);
        if(Inicio == null){
            Inicio = Nuevo;
            Final = Nuevo;
        }else{
            Nuevo.ant = Final;
            Final.sig = Nuevo;
            Final = Nuevo;
        }
    }
    
    public NodoBoleta EliminarBoleta(){ //eliminar la del final
        if(Vacio())
            return null;
        
        NodoBoleta aux;
        aux = Final;
        
        if(Inicio == Final)// un solo nodo
            Inicio = Final = null;
        
        Final = Final.ant;
        Final.sig = null;
        return aux;
    }
    
    public boolean Vacio()
    {   return (Inicio == null && Final == null);  }
    
}

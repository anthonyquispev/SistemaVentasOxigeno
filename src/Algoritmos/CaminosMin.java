
package Algoritmos;

public class CaminosMin {
    
    public String algoritmoFloyd(long [][] mAdy){
        int nodos = mAdy.length;
        long matrizAdyacencia [][] = mAdy;
        String caminos [][] = new String [nodos][nodos];
        String caminosAuxiliares [][]=new String [nodos][nodos];
        String caminoRecorrido = " ", cadena = " ", caminitos = " ";
        int i,j,k;
        float temporal1, temporal2, temporal3, temporal4, minimo;
        
        //inicializar matrices y caminos 
        for(i=0;i<nodos;i++) {
            for(j=0;j<nodos;j++){
                caminos[i][j]="";
                caminosAuxiliares[i][j]="";
            }
        }
        
        for (k = 0; k < nodos; k++) {
            for (i = 0; i < nodos; i++) {
                for (j = 0; j < nodos; j++) {
                    temporal1 = matrizAdyacencia[i][j];
                    temporal2 = matrizAdyacencia[i][k];
                    temporal3 = matrizAdyacencia[k][j];
                    temporal4 = temporal2 + temporal3;
                    //encontrando al minimo
                    minimo = Math.min(temporal1, temporal4);
                    if (temporal1 != temporal4) {
                        if (minimo == temporal4) {
                            caminoRecorrido = "";
                            caminosAuxiliares[i][j] = k + "";
                            caminos[i][j] = caminosR(i, k, caminosAuxiliares, caminoRecorrido) + (k + 1);

                        }
                    }
                    matrizAdyacencia[i][j] = (long) minimo;
                }
            }
        }

        for (int l = 0; l < nodos; l++) {
            if (l!=2) {
                System.out.print("   "+(l+1));
            }else{
                System.out.print("     "+(l+1));
            }
        }
        System.out.println("");
        for(i=0;i<nodos;i++) {
            cadena+=(i+1)+" ";    
            for(j=0;j<nodos;j++){
                cadena=cadena+"["+matrizAdyacencia[i][j]+"]";
            }
            cadena=cadena+"\n";
        }
        //Imprime todos los caminos minimos
        for(i=0;i<nodos;i++) {
                for(j=0;j<nodos;j++){
                    if(matrizAdyacencia[i][j]!=10000){
                        if(i!=j){
                            if(caminos[i][j].equals("")){
                                caminitos +="de "+ distrito(i+1)+" ----> "+distrito(j+1)+" irse por "+(i+1)+"->"+(j+1)+"\n";
                            }else{ caminitos +="de "+ distrito(i+1)+" ----> "+distrito(j+1)+" irse por "+(i+1)+"->"+caminos[i][j] + "->" +(j+1)+"\n";
                        }
                    }
                }
            }
        }

        return cadena+"\nLOS DIFERENTES CAMINOS MÁS CORTOS ENTRE LOS DIFERENTES DISTRITOS SON:\n"+caminitos;
    }
    
    public String caminosR(int i, int k, String[][] caminosAuxiliares, String caminoRecorrido) {
        if(caminosAuxiliares[i][k].equals("")){
            return "";
        }else{
            caminoRecorrido +=caminosR(i, Integer.parseInt(caminosAuxiliares[i][k].toString()), caminosAuxiliares, caminoRecorrido)+(Integer.parseInt(caminosAuxiliares[i][k].toString())+1)+"->";
            return caminoRecorrido;
        }
    }
    public String distrito(int d){
        String dist = "";
        switch (d) {
            case 1:
                dist = "Ate"; break;
            case 2:
                dist = "Barranco";break;
            case 3:
                dist = "Breña"; break;
            case 4:
                dist = "Chorrillos"; break;
            case 5:
                dist = "El Agustino"; break;
            case 6:
                dist = "La Molina"; break;
            case 7:
                dist = "Miraflores"; break;
            case 8:
                dist = "San Borja"; break;
            case 9:
                dist += "San Isidro"; break;
            case 10:
                dist += "SJL"; break;
            case 11:
                dist += "San Miguel"; break;
            case 12:
                dist += "Surco"; break;
            case 13:
                dist += "Surquillo"; break;        
            default:
                throw new AssertionError();
        }
        return dist;
    }
    public void rutas(){
        System.out.println("-------------------------------");
        System.out.println("Distritos de entrega de pedidos");
        System.out.println("-------------------------------");
        String cad = "";
        cad += "(1) Ate\n" +
                "(2) Barranco\n" +
                "(3) Breña\n" +
                "(4) Chorrillos\n" +
                "(5) El Agustino\n" +
                "(6) La Molina\n" +
                "(7) Miraflores\n" +
                "(8) San Borja\n" +
                "(9) San Isidro\n" +
                "(10) SJL\n" +
                "(11) San Miguel\n" +
                "(12) Surco\n" +
                "(13) Surquillo";
        System.out.println(cad);
    }
    
    public static void main(String[] args) {
        //Matriz de rutas directas
        long matrizA[][]={{0, 999, 110, 999, 90, 999, 999, 999, 999, 999, 999, 999, 999},
                        {999, 0, 999, 83, 999, 999, 999, 999, 999, 999, 999, 999, 999},
                        {999, 999, 0, 999, 70, 999,999, 999, 999, 999, 999, 999, 999},
                        {999, 999, 999, 0, 999, 999,999, 999, 999, 999, 999, 121, 999},
                        {999, 999, 999, 999, 0, 999,999, 80, 999, 80, 999, 999, 999},
                        {999, 999, 999, 999, 90, 0,999, 999, 999, 999, 999, 999, 999},
                        {999, 65, 160, 999, 999, 999,0, 999, 999, 999, 999, 999, 999},
                        {999, 999, 999, 999, 999, 80,68, 0, 999, 999, 110, 73, 65},
                        {999, 999, 999, 999, 999, 999, 40, 999, 0, 999, 999, 999, 999},
                        {100, 999, 999, 999, 80, 999, 999, 999, 999, 0, 999, 999, 999},
                        {999, 999, 999, 999, 999, 999, 999, 999, 50, 999, 0, 999, 999},
                        {999, 999, 999, 121, 999, 999, 999, 999, 999, 999, 999, 0, 999},
                        {999, 60, 999, 79, 999, 999, 999, 999, 999, 999, 999, 999, 0}};
        CaminosMin ruta = new CaminosMin();
        System.out.println(ruta.algoritmoFloyd(matrizA));
    }
}

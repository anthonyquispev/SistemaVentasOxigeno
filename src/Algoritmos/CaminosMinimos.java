
package Algoritmos;

import javax.swing.JOptionPane;

public class CaminosMinimos {
    int nodos;
    int A[][];  // Matriz de distancias directas
    int D[][];  //distancias mínimas
    int P[][]; //camino más corto. Ej. 1 -> 3 -> 6

    public CaminosMinimos(int v[][]) {
        nodos = v.length;
        A = new int[nodos][nodos];
        for (int i=0; i< nodos; i++){
            for (int j=0; j< nodos; j++){
                A[i][j]=  v[i][j];
            }   
        }
    } 
    
    public void MetodoFloyd (int a, int b){
        D = new int[nodos][nodos]; //matriz de distancias mínimas
        P = new int[nodos][nodos]; //matriz de camino más corto

        for (int i=0; i<nodos; i++){
            for (int j=0; j<nodos; j++){
                D[i][j]= A[i][j]; 
                P[i][j]= 0;
            }
        }
        for (int n=0; n<nodos; n++){
            for (int i=0; i<nodos; i++){
                for (int j=0; j<nodos; j++){
                    if(D[i][j]>D[i][n]+D[n][j]){
                        D[i][j] = D[i][n]+D[n][j];
                        P[i][j] = n+1;
                    }
                }
            }
        }
    }
    
    public void Camino (int a, int b){
        if (D[a-1][b-1] != 999) {
            JOptionPane.showMessageDialog(null, "\nDistancia Mínima entre "+distrito(a)+" y "+distrito(b)+" es de: "+D[a-1][b-1]+
                    " km\n\nLa Ruta que debe tomar es: "+Minimo(a, b), "Caminos entre distritos", 1);
            //Minimo(a, b);
        }else{
            JOptionPane.showMessageDialog(null, "No hay ruta entre los distritos seleccionados", 
                    "No existe ruta", 1);
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
    public String Minimo (int a, int b){
        String RT = "";
        int C[] = new int[5];
        int i = 1;
        int r = P[a-1][b-1];
        C[0] = b;
        
        while (r >0){
            C[i]= r;
            r = P[a-1][r-1];
            i++;
        }
        C[i] = a;
        // Imperime la ruta de nodos
        for (int n=i;n>=0;n--){
            RT = RT +" " +C[n];
            if (n!=0)
                RT += " → ";
        }
        return RT;
    }
}

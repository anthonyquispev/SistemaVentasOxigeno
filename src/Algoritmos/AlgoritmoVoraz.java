package Algoritmos;

public class AlgoritmoVoraz {

    public static boolean Voraz(double v[], int s[], int cant[], double cambio) {
        int i = 0;
        double sumaAcumulada = 0;
        double x, auxSuma;
        while ((sumaAcumulada < cambio) && (i < v.length)) {
            //Seleccionar moneda
            x = v[i];
            auxSuma = Math.rint((sumaAcumulada + x) * 100) / 100;
            if ((auxSuma <= cambio) && cant[i] > 0) { //¿Es factible?
                //Insertar moneda
                s[i]++;
                sumaAcumulada = auxSuma;
                cant[i]--;//Se reduce en 1 la cantidad disponible para ese tipo de moneda
            } else {
                //Rechazar moneda
                i++;
            }
        }
        if (sumaAcumulada == cambio) {
            return true;
        }
        return false;
    }

    public static boolean Voraz2(double v[], int s[], double cambio) {
        int i = 0;
        double sumaAcumulada = 0;
        double x, auxSuma;
        while ((sumaAcumulada < cambio) && (i < v.length)) {
            //Seleccionar moneda
            x = v[i];
            auxSuma = Math.rint((sumaAcumulada + x) * 100) / 100;
            if (auxSuma <= cambio) { //¿Es factible?
                //Insertar moneda
                s[i]++;
                sumaAcumulada = auxSuma;
            } else {
                //Rechazar moneda
                i++;
            }
        }
        if (sumaAcumulada == cambio) {
            return true;
        }
        return false;
    }

    public static String MostrarCambio(double v[], int s[], double cambio) {
        String resultado = "Vuelto: " + cambio + "\n";
        for (int i = 0; i < s.length; i++) {
            if (s[i] > 0) {
                if (i < 5) {
                    resultado += s[i] + " billete(s) de " + v[i] + " soles\n";
                } else {
                    resultado += s[i] + " moneda(s) de " + v[i] + " soles\n";
                }
            }
        }
        return resultado;
    }

}

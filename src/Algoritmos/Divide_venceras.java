package Algoritmos;

public class Divide_venceras {

    public static int Multiplicacion(int a, int b) {
        int n = Math.max(Tamaño(a), Tamaño(b));
        if (n < 2) {
            return a * b;
        } else {
            int s = n / 2;
            int t = (int) Math.pow(10, s);
            int xi = a / t;
            int xd = a % t;
            int yi = b / t;
            int yd = b % t;
            int r = Multiplicacion(xi + xd, yi + yd);
            int p = Multiplicacion(xi, yi);
            int q = Multiplicacion(xd, yd);
            int v = (int) Math.pow(10, 2 * s);
            int res = p * (v) + (r - p - q) * t + q;
            return res;
        }
    }

    private static int Tamaño(int n) {
        int ncifras = 0;
        while (n > 0) {
            n = n / 10;
            ncifras++;
        }
        return ncifras;
    }
}

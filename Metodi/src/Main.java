public class Main {
    public static void main(String[] args) {
        int totaleSpeso = addizione(2, 4);
        /*System.out.println(totaleSpeso);*/
    }

/*    static int addizione(int a, int b) {
        int risultato = a + b;
        return risultato;
    }*/

    // Overloaded Methods
    int doppioInt = addizione(2, 3);
    int triploInt = addizione(5, 10, 9);
    double doppioDouble = addizione(2.5, 6.3);

static int addizione(int a, int b) {
    int risultato = a + b;
    return risultato;                                // ---> Java permette di scrivere due metodi uguali ma con
}                                                   //       tipi di dato diversi

static int addizione(int a, int b, int c) {
    int risultato = a + b;
    return risultato;
}

static double addizione(double a, double b) {
    double risultato = a + b;
    return risultato;
}
}

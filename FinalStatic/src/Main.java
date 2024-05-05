// Final --> variabile che non può essere modificata nel corso del programma (come un const)
// Static --> Attributo univoco per tutte le istanze della classe

public class Main {
    public static void main(String[] args) {
    Persona persona1 = new Persona("Luca", "Rossi");
        Persona persona2 = new Persona("Marco", "Verdi");

        /*System.out.println("numero persone: " + Persona.numeroPersone);*/
        Persona.mostraNumPersone();
    }
}
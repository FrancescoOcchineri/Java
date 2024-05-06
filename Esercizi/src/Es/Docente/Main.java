package Es.Docente;

public class Main {
    public static void main (String[] args) {
        Universita universita = new Universita();

        Docente docente1 = new Docente("Luca", "Rossi", 45);
        universita.aggiungiDocente(docente1);

        Docente docente2 = new Docente("Marco", "Verdi", 21);
        universita.aggiungiDocente(docente2);

        Docente docente3 = new Docente("Anna", "Neri", 32);
        universita.aggiungiDocente(docente3);

        int etaMinima = universita.etaMinima();
        System.out.println("L'eta minima tra i docenti e': " + etaMinima);
    }
}

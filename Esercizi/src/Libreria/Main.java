package Libreria;

import java.util.ArrayList;

public class Main {
    public static void main (String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        biblioteca.aggiungiLibro(new Libro("Il Signore degli Anelli", "J.R.R. Tolkien", 1954));
        biblioteca.aggiungiLibro(new Libro("1984", "George Orwell", 1949));
        biblioteca.aggiungiLibro(new Libro("Cronache del ghiaccio e del fuoco", "George R.R. Martin", 1996));

        // Ricerca di un libro per titolo
        String titoloCercato = "1984";
        Libro libroCercato = biblioteca.cercaPerTitolo(titoloCercato);
        if (libroCercato != null) {
            System.out.println("Il libro '" + titoloCercato + "' è presente nella biblioteca.");
        } else {
            System.out.println("Il libro '" + titoloCercato + "' non è presente nella biblioteca.");
        }

        // Ricerca dei libri di un autore
        String autoreCercato = "George R.R. Martin";
        ArrayList<Libro> libriAutore = biblioteca.cercaPerAutore(autoreCercato);
        if (!libriAutore.isEmpty()) {
            System.out.println("I libri dell'autore " + autoreCercato + " sono:");
            for (Libro libro : libriAutore) {
                System.out.println("- " + libro.getTitolo());
            }
        } else {
            System.out.println("Non ci sono libri dell'autore " + autoreCercato + " nella biblioteca.");
        }
    }
}

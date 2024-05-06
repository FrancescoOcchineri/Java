package Libreria;

import java.util.ArrayList;

public class Biblioteca {

    private ArrayList<Libro> libri;

    public Biblioteca() {
        libri = new ArrayList<>();
    }

    public void aggiungiLibro(Libro libro) {
        libri.add(libro);
    }

    public Libro cercaPerTitolo(String titolo) {
        for(Libro libro: libri) {
            if(libro.getTitolo().equals(titolo)) {
                return libro;
            }
        }
        return null;
    }

    public ArrayList<Libro> cercaPerAutore(String autore) {
        ArrayList<Libro> libriAutore = new ArrayList<>();
        for(Libro libro: libri) {
            if(libro.getAutore().equalsIgnoreCase(autore)) {
                libriAutore.add(libro);
            }
        }
        return libriAutore;
    }
}

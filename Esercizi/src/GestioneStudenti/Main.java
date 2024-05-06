package GestioneStudenti;

import java.util.ArrayList;

public class Main {
    public static void main (String[] args) {
        Università università = new Università();

        Studente studente1 = new Studente("Luca", 25, 2019);
        Studente studente2 = new Studente("Marco", 42, 2017);
        Studente studente3 = new Studente("Anna", 97, 2022);

        int matricola = 25;
        Studente studenteCercato = università.cercaPerMatricola(matricola);
        if (studenteCercato != null) {
            System.out.println("Lo studente con matricola " + matricola + " è presente nell'università.");
        } else {
            System.out.println("Lo studente con matricola " + matricola + " non è presente nell'università.");
        }

        int anno = 2022;
        ArrayList<Studente> studenti = università.cercaPerAnnoIscrizione(anno);
        if (!studenti.isEmpty()) {
            System.out.println("Gli studenti iscritti nell'anno " + anno + " sono:");
            for (Studente studente : studenti) {
                System.out.println("- " + studente.getNome());
            }
        } else {
            System.out.println("Non ci sono studenti iscritti nell'anno " + anno + ".");
        }
    }
}

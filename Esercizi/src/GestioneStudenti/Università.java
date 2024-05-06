package GestioneStudenti;

import java.util.ArrayList;

public class Università {

    private ArrayList<Studente> studenti;

    Università() {
        studenti = new ArrayList<>();
    }

    public void aggiungiStudente(Studente studente) {
        studenti.add(studente);
    }

    public Studente cercaPerMatricola(int matricola) {
        for(Studente studente: studenti) {
            if(studente.getMatricola() == matricola) {
                return studente;
            }
        }
        return null;
    }

    public ArrayList<Studente> cercaPerAnnoIscrizione(int annoIscrizione) {
        ArrayList<Studente> studentiAnno = new ArrayList<>();
        for(Studente studente: studenti) {
            if(studente.getAnnoIscrizione() == annoIscrizione) {
                studentiAnno.add(studente);
            }
        }
        return studentiAnno;
    }
}

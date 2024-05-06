package Es.Docente;

import java.util.ArrayList;

public class Universita {
    protected ArrayList<Docente> docenti;

    Universita() {
        docenti = new ArrayList<>();
    }

    public void aggiungiDocente(Docente docente) {
        docenti.add(docente);
    }

    public int etaMinima() {
        int min = docenti.get(0).eta;

        for(Docente docente: docenti) {
            if(docente.eta < min) {
                min = docente.eta;
            }
        }
        return min;
    }
}

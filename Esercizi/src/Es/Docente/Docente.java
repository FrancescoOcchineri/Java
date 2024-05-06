package Es.Docente;

public class Docente {
    protected String nome;
    protected String cognome;
    protected int eta;

    Docente(String nome, String cognome, int eta) {
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
    }

    public String toString() {
        String stringa = nome + " " + cognome + " " + eta;
        return stringa;
    }
}

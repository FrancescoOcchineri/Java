package GestioneStudenti;

public class Studente {
    private String nome;
    private int matricola;
    private int annoIscrizione;

    Studente(String nome, int matricola, int annoIscrizione) {
        this.nome = nome;
        this.matricola = matricola;
        this.annoIscrizione = annoIscrizione;
    }

    public String getNome() {
        return nome;
    }

    public int getMatricola() {
        return matricola;
    }

    public int getAnnoIscrizione() {
        return annoIscrizione;
    }

    

}

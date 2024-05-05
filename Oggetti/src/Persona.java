public class Persona {

    /*String nome = "Luca";
    String cognome = "Rossi";
    int eta = 25;
    String colorePreferito = "Blu";

    void saluta() {
        System.out.println("Ciao sono " + nome);
    }

    void cammina() {
        System.out.println("Sto camminando...");
    }*/

    String nome;
    String cognome;
    int eta;
    String colorePreferito;

    Persona(String nome, String cognome, int eta, String colorePreferito) {
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
        this.colorePreferito = colorePreferito;
    }

    // Metodo toString()
    public String toString() {
        String stringa = this.nome + " " + this.cognome + " " + this.eta + " " + this.colorePreferito;
        return stringa;
    }

    void saluta(Persona personaDaSalutare) {
        System.out.println("Ciao " + personaDaSalutare.nome + " io sono " + this.nome);
    }
}

public class Persona {
    String nome;
    String cognome;
    static int numeroPersone;

    Persona(String nome, String cognome) {
        this.nome = nome;
        this.cognome = cognome;
        numeroPersone++;
    }

    // Metodo toString()
    public String toString() {
        String stringa = this.nome + " " + this.cognome;
        return stringa;
    }

    static void mostraNumPersone() {
        System.out.println("Il numero di persone create è: " + numeroPersone);
    }
}

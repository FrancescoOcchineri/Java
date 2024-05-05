public class Insegnante extends Persona {

    String materia;

    Insegnante(String nome, String cognome, String materia) {
        super(nome, cognome);
        this.materia = materia;
    }

    void insegna() {
        System.out.println("sto insegnando...");
    }

    @Override
    void saluta() {
        System.out.println("Buongiorno ragazzi!");
    }

    public String toString() {
        String stringa = "Sono " + nome + " " + cognome + " e insegno " + materia;
        return stringa;
    }
}

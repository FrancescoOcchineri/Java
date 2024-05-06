public class Main {
    public static void main(String[] args) {

        Studente studente1 = new Studente("Luca", "Rossi");
        Studente studente2 = new Studente("Anna", "Verdi");
        Insegnante insegnante1 = new Insegnante("Marco", "Verdi");

        Persona[] classe = {studente1, studente2, insegnante1};

        for(Persona persona: classe) {
            persona.saluta();
        }
    }
}
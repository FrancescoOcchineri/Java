public class Main {
    public static void main(String[] args) {

    Studente studente1 = new Studente("Luca","Rossi", "Storia");
    studente1.saluta();

    Insegnante insegnante1 = new Insegnante("Luca", "Rossi", "Matematica");
    insegnante1.saluta();

    System.out.println(insegnante1);
    }
}
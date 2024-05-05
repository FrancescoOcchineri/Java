public class Main {
    public static void main(String[] args) {
        // Array di oggetti
        /*Persona[] persone = new Persona[3];*/

        Persona persona1 = new Persona("Luca", "Rossi", 25, "blu");
        Persona persona2 = new Persona("Marco", "Verdi", 29, "rosso");
        Persona persona3 = new Persona("Lucia", "Neri", 22, "giallo");

        /*persone[0] = persona1;
        persone[1] = persona2;
        persone[2] = persona3;*/

        Persona[] persone = {persona1, persona2, persona3};

        /*System.out.println(persone[0]);*/

        // Oggetti come parametri di metodi
        Persona persona4 = new Persona("Luca", "Rossi", 25, "blu");
        Persona persona5 = new Persona("Marco", "Verdi", 37, "rosso");

        persona4.saluta(persona5);
    }
}
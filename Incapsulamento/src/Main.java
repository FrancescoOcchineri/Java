public class Main {
    public static void main(String[] args) {

        Persona persona1 = new Persona("Luca", "Rossi");
        Persona persona2 = new Persona(persona1);

        System.out.println(persona1);
        System.out.println(persona2);
        System.out.println();
        System.out.println(persona1.getNome());
        System.out.println(persona1.getCognome());
        System.out.println(persona2.getNome());
        System.out.println(persona2.getCognome());
    }
}
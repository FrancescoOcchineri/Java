public class Costruttore {

        // Variabili scope globale
        String nome;
        String cognome;
        int eta;
        String colorePreferito;

        Costruttore(String nome, String cognome, int eta, String colorePreferito){

            this.nome = nome;
            this.cognome = cognome;
            this.eta = eta;
            this.colorePreferito = colorePreferito;
        }

        void saluta() {

            // Variabili scope locale
            int prova = 5;
        }

        void addizione(int a, int b) {
            int risultato = a + b;
            this.qwerty(risultato);
        }

        void qwerty(int prova) {
            int risultato = 100;
            System.out.println("il risultato è " + prova);
            System.out.println("da qwerty " + risultato);
        }

        void videogame(String nome, int ore) {
            nome = "Starfield";
            ore = 100;
            String gioco = "Ha giocato a " + nome + " Per un totale di " + ore;
            this.Stampa(gioco);
        }

        void Stampa(String prova) {
            System.out.println(prova);
        }
    }

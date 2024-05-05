public class Banca {
    String nome;
    private double saldo;
    static int clienti;

    Banca(String nome, double saldo) {
        this.nome = nome;
        this.saldo = saldo;
        clienti++;
    }

    public void deposita(double importo) {
        saldo += importo;
        System.out.println(nome + " ha depositato " + importo + " euro");
    }

    public void preleva(double importo) {
        if (saldo >= importo) {
            saldo -= importo;
            System.out.println(nome + " ha prelevato " + importo + " euro");
        } else {
            System.out.println("Non ci sono abbastanza soldi");
        }
    }

    public static void getClienti() {
        System.out.println("Numero di clienti: " + clienti);
    }
}

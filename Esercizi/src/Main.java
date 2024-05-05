public class Main {
    public static void main(String[] args) {
        // Esercizio 1
        Rettangolo rettangolo1 = new Rettangolo(20, 10);
        Rettangolo rettangolo2 = new Rettangolo(23, 7);
        Rettangolo rettangolo3 = new Rettangolo(45, 22);

        rettangolo3.Ridimensiona(10, 5);

        int perimetro1 = rettangolo1.perimetro();
        int perimetro2 = rettangolo2.perimetro();
        int perimetro3 = rettangolo3.perimetro();

        int area1 = rettangolo1.area();
        int area2 = rettangolo2.area();
        int area3 = rettangolo3.area();

        /*System.out.println(perimetro1 + perimetro2 + perimetro3);
        System.out.println(area1 + area2 + area3);*/

        // Esercizio 2
        Operazioni operazione = new Operazioni(20, 2);
        /*operazione.add();
        operazione.sott();
        operazione.molt();*/

        Banca cliente1 = new Banca("Luca", 24000);
        Banca cliente2 = new Banca("Marco", 50000);
        cliente1.preleva(1200.50);
        cliente1.deposita(20000.5);

        Banca.getClienti();
    }
}
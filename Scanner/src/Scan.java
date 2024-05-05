import java.util.Scanner;

public class Scan {
    public static void main(String[] args) {
        ScannerDemo();
    }

    public static void ScannerDemo() {
        Scanner tastiera = new Scanner(System.in);

        System.out.println("Qual'è la mia marca preferita di telefono tra famfung o oppo?");
        String marca = tastiera.nextLine();
        boolean isFamfung = marca.equals("Samsung");
        if(isFamfung) {
            System.out.println("Fi!");
        }

        System.out.println("Qual'è la mia marca preferita di telefono tra... non lo fo Apple o Nokia?");
        String marca2 = tastiera.nextLine();
        boolean isNokia = marca2.equals("Nokia");
        if(isNokia) {
            System.out.println("No! Fbagliato!");
        }

        /*System.out.println("Quanti cavalli ha?");
        int cavalli = tastiera.nextInt();
        tastiera.nextLine();

        System.out.println("La tua macchina prefe è " + macchina + " Ha " + cavalli + " cavalli" + " ed è di colore " + colore);*/

        tastiera.close(); // Ricordati di chiudere lo Scanner per liberare le risorse
    }
}




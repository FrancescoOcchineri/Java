import java.util.Scanner;

public class PrimoProgramma {
    public static void main(String[] args) {
        System.out.println("Ciao!");
        int n1, n2;
        Scanner tastiera = new Scanner(System.in);
        System.out.println("Inserisci il primo numero:");
        n1 = tastiera.nextInt();
        System.out.println("Inserisci il secondo numero:");
        n2 = tastiera.nextInt();
        System.out.println("Ecco la somma dei due numeri:");
        System.out.println(n1 + n2);
    }
}

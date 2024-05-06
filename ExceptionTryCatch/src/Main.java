import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Inserisci un numero");
            int x = scanner.nextInt();

            System.out.println("Inserire il secondo numero");
            int y = scanner.nextInt();

            int result = x / y;
            System.out.println("risultato: " + result);
        } catch (ArithmeticException error) {
            System.out.println("non puoi dividere per 0");
        } catch (InputMismatchException error) {
            System.out.println("non puoi dividere un numero per una stringa");
        } catch (Exception error) {
            System.out.println("C'è stato un problema");
        } finally {
            scanner.close();
        }
    }
}
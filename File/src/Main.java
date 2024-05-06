import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        /*try {
            FileWriter writer = new FileWriter("prova.txt");
            writer.write("Ciao a tutti \nSto facendo il corso di Java");
            writer.append("\nBellissimo file");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }*/

        try {
            FileReader reader = new FileReader("prova.txt");
            int data = reader.read();

            while(data != -1) {
                System.out.print((char) data);
                data = reader.read();
            }
            System.out.println(data);
        } catch (FileNotFoundException error) {
            error.printStackTrace();
        } catch (IOException error) {
            error.printStackTrace();
        }
    }
}
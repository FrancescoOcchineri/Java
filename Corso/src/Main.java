import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Condizioni con IF
    boolean isOnline = false;
    String nome = "Luca";

    if(nome == "Luca") {
       /* System.out.println(("è Luca"));*/
    } else if(nome == "Marco") {
    System.out.println("è Marco");
    } else {
       /* System.out.println("è Mario");*/
    }

    String nome2 = "Marco";

    switch(nome2) {
        case "Luca":
            System.out.println("Ciao " + nome2);
            break;
        case "Marco":
            /*System.out.println("Ciao " + nome2);*/
            break;
        default:
            System.out.println("non è online");
    }

    int i = 0;
    while (i < 5) {
      /*  System.out.println(i);*/
        i++;
    }

    do {
        /*System.out.println("dowhile " + i);*/
        i++;
    } while(i<0);

    for(int j = 0; j < 5; j++) {
        /*System.out.println("for " + i);*/
    }

    // foreach
        int[] numeri = {1, 2, 3, 4, 5, 6};
        for(int numero: numeri)  {
           /* System.out.println(numero);*/
        }

        // Array
        int [] array = new int[3];
        numeri[0] = 10;
        numeri[1] = 20;
        numeri[2] = 30;

        //Modifico l'indice 1
        numeri[1] = 100;
        /*System.out.println(numeri[1])*/;

        // Array 2d o multidimensionali
       /* String[][] classi = new String[3][3];
        classi[0][0] = "Luca";
        classi[0][1] = "Anna";
        classi[0][2] = "Marco";

        classi[1][0] = "Lucia";
        classi[1][1] = "Paolo";
        classi[1][2] = "Mario";

        classi[2][0] = "Marta";
        classi[2][1] = "Simone";
        classi[2][2] = "Federico";

        classi[1][2] = "Orazio";*/

        String[][] classi = {
                {"Luca", "Anna", "Marco"},
                {"Lucia", "Mario", "Fede"},
                {"Simone", "Paolo", "Adri"}
        };

       /* System.out.println(classi[1][2]);*/

        for(int classe = 0; classe < classi.length; classe++) {
           /* System.out.println();*/
            for(int studente = 0; studente < classi[classe].length; studente++) {
                /*System.out.print(classi[classe][studente] + " ");*/
            }
        }

        for(String[] classe: classi) {
            /*System.out.println();*/
            for(String studente: classe) {
                /*System.out.print(studente + " ");*/
            }
        }

        // Metodi stringhe
        /*String nome = "Leonardo";
        boolean risultato = nome.equals("Leonardo");
        boolean risultato = nome.equalsIgnoreCase("Leonardo");*/  /*--> IgnoreCase ignora minuscole o maiuscole*/
        /*char risultato = nome.charAt(7);
        boolean risultato = nome.isEmpty();
        String risultato = nome.trim();
        String risultato = nome.replace('o', 'w');*/

        /*System.out.println(risultato);*/

        // Wrapper Class
        Boolean vero = true;
        Character carattere = 'a';
        Integer numero = 5;
        Double virgola = 5.23;
        String stringa = "ciao";

        boolean a = true;
        char b = 'a';
        int c = 5;
        double d = 5.23;

        if (vero == a) {
            /*System.out.println("prova");*/
        }

        //Array List
       /* ArrayList<Integer> persone = new ArrayList<Integer>();

        persone.add("Luca");
        persone.add("Marco");
        persone.add("Anna");

        persone.set(2, "Paola");
        persone.remove(0);
        persone.clear();

        persone.add(1);

        for (int p = 0; p<persone.size(); p++) {
            System.out.println(persone.get(p));
        }*/

        ArrayList<ArrayList<String>> classes = new ArrayList<>();

        ArrayList<String> classe1 = new ArrayList<String>();

        classe1.add("Luca");
        classe1.add("Marco");

        ArrayList<String> classe2 = new ArrayList<String>();
        classe1.add("Anna");
        classe1.add("Orazio");

        classes.add(classe1);
        classes.add(classe2);

        for(int g = 0; g<classes.size(); g++) {
            /*System.out.println();*/
            for(int z = 0; z<classes.get(g).size(); z++) {
                /*System.out.print(classes.get(g).get(z) + " ");*/
            }
            }
        }
    }
public class Operazioni {
    int a;
    int b;

    Operazioni(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void add() {
        System.out.println(a + b);
    }

    public void sott() {
        System.out.println(a - b);
    }

    public void molt() {
        System.out.println(a * b);
    }
}

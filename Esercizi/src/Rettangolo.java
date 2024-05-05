public class Rettangolo {
    int base;
    int altezza;

    Rettangolo(int base, int altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    public void Ridimensiona(int nuovaBase, int nuovAltezza) {
        this.base = nuovaBase;
        this.altezza = nuovAltezza;
    }

    public int perimetro() {
        int perimetro = (base * 2) + (altezza * 2);
        return perimetro;
    }

    public int area() {
        int area = base * altezza;
        return area;
    }
}

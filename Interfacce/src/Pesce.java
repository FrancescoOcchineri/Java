public class Pesce implements Preda, Predatore {
    @Override
    public void scappa() {
        System.out.println("Il pesce piccolo scappa da quelli più grossi");
    }

    public void caccia() {
        System.out.println("Il pesce grosso caccia quelli più piccoli");
    }
}

public class Main {
    public static void main(String[] args) {
        Koszyk koszyk = new Koszyk();

        koszyk.dodajProdukt(new Maskotka());
        koszyk.dodajProdukt(new Smycz());
        koszyk.dodajProdukt(new Rabat(10));
        koszyk.dodajProdukt(new KosztTransportu(13));

        koszyk.wyswietlZakupy();
    }
}
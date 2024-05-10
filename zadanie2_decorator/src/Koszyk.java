import java.util.ArrayList;
import java.util.List;
class Koszyk {
    private List<Produkt> produkty = new ArrayList<>();

    public void dodajProdukt(Produkt produkt) {
        produkty.add(produkt);
    }

    public double obliczCene() {
        double cena = 0;
        for (Produkt produkt : produkty) {
            cena += produkt.cena();
        }
        return cena;
    }

    public void wyswietlZakupy() {
        System.out.println("Zakupione produkty:");
        for (Produkt produkt : produkty) {
            System.out.println("- " + produkt.opis());
        }
        double cena = obliczCene();
        System.out.println("Łączna cena: " + (cena >= 0 ? cena : 0) + " PLN");
    }
}
import java.util.ArrayList;
import java.util.List;
class Zamowienie {
    private List<Pizza> listaPizz = new ArrayList<>();

    public void dodajPizza(Pizza pizza) {
        listaPizz.add(pizza);
    }

    public double obliczKoszt() {
        double koszt = 0.0;
        for (Pizza pizza : listaPizz) {
            koszt += pizza.koszt();
        }
        return koszt;
    }

    public void wyswietlZamowienie() {
        for (Pizza pizza : listaPizz) {
            System.out.println("Pizza: " + pizza.opis() + ", cena: " + pizza.koszt() + " zł");
        }
        System.out.println("Łączny koszt zamówienia: " + obliczKoszt() + " zł");
    }
}
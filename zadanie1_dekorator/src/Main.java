public class Main {
    public static void main(String[] args) {
        Pizza pizza1 = new StandardowaPizza();
        pizza1 = new Ser(pizza1);
        pizza1 = new Pieczarki(pizza1);

        Pizza pizza2 = new StandardowaPizza();
        pizza2 = new Ser(pizza2);
        pizza2 = new UsunSkladnikiDecorator(pizza2, "pieczarki");

        Zamowienie zamowienie = new Zamowienie();
        zamowienie.dodajPizza(pizza1);
        zamowienie.dodajPizza(pizza2);

        zamowienie.wyswietlZamowienie();
    }
}
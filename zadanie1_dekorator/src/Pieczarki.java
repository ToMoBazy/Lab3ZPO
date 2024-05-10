class Pieczarki extends DodatkiDecorator {
    public Pieczarki(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String opis() {
        return pizza.opis() + ", pieczarki";
    }

    @Override
    public double koszt() {
        return pizza.koszt() + 1.5;
    }
}

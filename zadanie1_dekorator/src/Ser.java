class Ser extends DodatkiDecorator {
    public Ser(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String opis() {
        return pizza.opis() + ", ser";
    }

    @Override
    public double koszt() {
        return pizza.koszt() + 2.0;
    }
}
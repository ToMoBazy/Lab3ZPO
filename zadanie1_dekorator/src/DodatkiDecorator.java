abstract class DodatkiDecorator implements Pizza {
    protected Pizza pizza;

    public DodatkiDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String opis() {
        return pizza.opis();
    }

    @Override
    public double koszt() {
        return pizza.koszt();
    }
}
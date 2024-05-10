class UsunSkladnikiDecorator implements Pizza {
    protected Pizza pizza;
    private String skladnik;

    public UsunSkladnikiDecorator(Pizza pizza, String skladnik) {
        this.pizza = pizza;
        this.skladnik = skladnik;
    }

    @Override
    public String opis() {
        return pizza.opis().replace(", " + skladnik, "");
    }

    @Override
    public double koszt() {
        // Z racji, że usuwamy składnik, jego koszt jest równy 0
        return pizza.koszt();
    }
}
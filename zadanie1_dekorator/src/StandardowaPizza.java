class StandardowaPizza implements Pizza {
    @Override
    public String opis() {
        return "Standardowa pizza";
    }

    @Override
    public double koszt() {
        return 10.0;
    }
}
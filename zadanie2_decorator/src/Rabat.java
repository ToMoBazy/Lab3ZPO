class Rabat implements Produkt {
    private double rabat;

    public Rabat(double rabat) {
        this.rabat = rabat;
    }

    @Override
    public String opis() {
        return "Rabat w wysokości " + rabat + " PLN";
    }

    @Override
    public double cena() {
        return -rabat;
    }
}
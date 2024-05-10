class KosztTransportu implements Produkt {
    private double koszt;

    public KosztTransportu(double koszt) {
        this.koszt = koszt;
    }

    @Override
    public String opis() {
        return "Dodatkowy koszt transportu";
    }

    @Override
    public double cena() {
        return koszt;
    }
}
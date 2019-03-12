package lekcje.lekcja1.zadania.zadanie4;

public enum MenuMcDonnalds {
    BigMac(12.0d),
    HappyMeal(15.3d),
    Frytki(3.5d);

    private double cena;

    private MenuMcDonnalds(double _cena){
        cena = _cena;
    }

    public double getCena(){
        return cena;
    }
}

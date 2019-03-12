package lekcje.lekcja1.przyklady.przyklad4;

public enum Produkty {

    jablko(1.2d),
    sok(2.0d),
    wafelek(2.5d);

    private double cena;

    private Produkty(double _cena){
        cena = _cena;
    }

    public double getCena(){
        return cena;
    }
}

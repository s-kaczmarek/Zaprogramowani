package lekcje.lekcja1.zadania.zadanie5;

public class Samochod {
    private String numerRejestracyjny;
    private Wlasciciel wlasciciel;
    private Marka marka;

    public Samochod(String _numerRejestracyjny, Wlasciciel _wlasciciel, Marka _marka){
        numerRejestracyjny = _numerRejestracyjny;
        wlasciciel = _wlasciciel;
        marka = _marka;
    }

    public String getNumerRejestracyjny() {
        return numerRejestracyjny;
    }

    public Wlasciciel getWlasciciel() {
        return wlasciciel;
    }

    public Marka getMarka() {
        return marka;
    }
}

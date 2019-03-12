package lekcje.lekcja1.przyklady.przyklad1;

public class Osoba {

    private String imie;
    private int wiek;

    public Osoba (String _imie, int _wiek){
        imie = _imie;
        wiek = _wiek;
    }

    public void przedstawSie(){
        System.out.println("mam na imię: " + imie);
    }

    public String getImie() {
        return imie;
    }
}

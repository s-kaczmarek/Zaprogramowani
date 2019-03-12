package lekcje.lekcja1.przyklady.przyklad2;

public class OsobaWszkole {

    private String imie;
    private int wiek;
    private RolaWszkole rolaWszkole;

    public OsobaWszkole (String _imie, int _wiek, RolaWszkole _rolaWszkole){
        imie = _imie;
        wiek = _wiek;
        rolaWszkole = _rolaWszkole;
    }

    public void przedstawSie(){
        System.out.println("mam na imię: " + imie + "i mam " + wiek + " lat");
    }

    public void jakaJestRolaWszkole(){
        System.out.println("moja rola w szkole to: " + rolaWszkole);
    }
}

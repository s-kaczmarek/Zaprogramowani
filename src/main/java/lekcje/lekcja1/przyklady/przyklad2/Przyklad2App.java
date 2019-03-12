package lekcje.lekcja1.przyklady.przyklad2;

public class Przyklad2App {
    public static void main(String[] args) {

        OsobaWszkole olek = new OsobaWszkole("Olek", 10, RolaWszkole.uczen);
        OsobaWszkole paniOla = new OsobaWszkole("Aleksandra", 30, RolaWszkole.nauczyciel);
        OsobaWszkole panJanusz = new OsobaWszkole("Janusz", 45, RolaWszkole.dyrektor);

        olek.jakaJestRolaWszkole();
        paniOla.jakaJestRolaWszkole();
        panJanusz.jakaJestRolaWszkole();

    }
}

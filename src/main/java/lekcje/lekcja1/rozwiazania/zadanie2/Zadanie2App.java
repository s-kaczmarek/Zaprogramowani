package lekcje.lekcja1.rozwiazania.zadanie2;

public class Zadanie2App {
    public static void main(String[] args) {

        Zwierze2 lewBartek = new Zwierze2("Lew", "Bartek", "Wraaaaa", false, Dieta.miesozerne);
        Zwierze2 chomikAndrzej = new Zwierze2("Chomik", "Andrzej", "Pipi", true, Dieta.roslinozerne);

        lewBartek.zjedz(chomikAndrzej);
        chomikAndrzej.zjedz(lewBartek);

    }
}

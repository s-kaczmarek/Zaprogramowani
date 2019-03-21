package lekcje.lekcja1.rozwiazania.zadanie1;

public class Zadanie1App {

    public static void main(String[] args) {

        /**
         * Przykład 1
         *
         * - Tworzymy dwa obiekty klasy Zwierze
         * - Tworzymy dwie scenki zachowań zwierząt:
         *      1. Zwierze wydaje swój dźwięk
         *      2. Jedno zwierze ucieka przed drugim
         */

        Zwierze lewBartek = new Zwierze("lew", "Bartek", "Wrrraaa", false);
        Zwierze chomikAndrzej = new Zwierze("chomik", "Andrzej", "Pipi", true);

        // Scenka 1
        lewBartek.dajGlos();
        chomikAndrzej.dajGlos();

        // Scenka 2
        lewBartek.czyUcieklPrzedZwierzeciem(chomikAndrzej);
        chomikAndrzej.czyUcieklPrzedZwierzeciem(lewBartek);
    }
}

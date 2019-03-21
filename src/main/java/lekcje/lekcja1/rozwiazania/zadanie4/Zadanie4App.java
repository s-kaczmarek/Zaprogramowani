package lekcje.lekcja1.rozwiazania.zadanie4;

import lekcje.lekcja1.przyklady.przyklad1.Osoba;

public class Zadanie4App {
    public static void main(String[] args) {

        Osoba janusz = new Osoba("Janusz", 16);
        McDonnalds mcDonnalds = new McDonnalds(MenuMcDonnalds.BigMac, janusz);
        mcDonnalds.kup(3.5d);
        mcDonnalds.kup(15.0d);
        mcDonnalds.kup(12.0d);
    }
}

package lekcje.lekcja1.przyklady.przyklad3;

import lekcje.lekcja1.przyklady.przyklad1.Osoba;

import java.util.ArrayList;
import java.util.List;

public class Przyklad3App {
    public static void main(String[] args) {

        /** Tworzenie obiektów, które dodamy do listy */

        Osoba osoba1 = new Osoba("Janusz", 15);
        Osoba osoba2 = new Osoba("Krysia", 13);

        /** Tworzenie listy osób */

        List<Osoba> listaOsob = new ArrayList<Osoba>();

        /** Dodanie osób do listy */

        listaOsob.add(osoba1);
        listaOsob.add(osoba2);

        /** Metoda size() podaje ilość elementów w liście */

        System.out.println(listaOsob.size());

        /** Pobranie jednego elementu z listy (numeracja zaczyna się od 0) */

        Osoba osobaPobranaZlisty = listaOsob.get(0);
        osobaPobranaZlisty.przedstawSie();

    }
}

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

        /** Sprawdzenie, czy lista zawiera obiekt osoba1 */

        Boolean czyListaZawieraObiekt = listaOsob.contains(osoba1);
        System.out.println(czyListaZawieraObiekt);

        /** Sprawdzenie na którym miejscu w liście znajduje się dany obiekt */

        System.out.println(listaOsob.indexOf(osoba1));

        /** Wyszukanie w liście osoby o imieniu Janusz */

        for(Osoba poszukiwanaOsoba : listaOsob){
            if(poszukiwanaOsoba.getImie() == "Janusz"){
                System.out.println("Lista zawiera osobę o imieniu Janusz");
                System.out.println("Janusz znajduje się na miejscu i indeksie: " + listaOsob.indexOf(poszukiwanaOsoba));
            }
        }
    }
}

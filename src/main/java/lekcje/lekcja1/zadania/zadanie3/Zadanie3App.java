package lekcje.lekcja1.zadania.zadanie3;

import lekcje.lekcja1.zadania.zadanie2.Dieta;

import java.util.ArrayList;
import java.util.List;

public class Zadanie3App {

    public static void main(String[] args) {

        /** Tworzymy obiekty zwierząt, które dodamy do listy */
        Zwierze3 piesJanusz = new Zwierze3(Gatunek.Pies, "Janusz", "hauhau", false, Dieta.miesozerne);
        Zwierze3 kotZbigniew = new Zwierze3(Gatunek.Kot, "Zbigniew", "miau", true, Dieta.miesozerne);
        Zwierze3 chomikGryzek = new Zwierze3(Gatunek.Chomik, "Gryzek", "Pipipi", true, Dieta.roslinozerne);

        /** Tworzymy pustą listę, do której będziemy dodawać zwierzeta */
        List<Zwierze3> listaZwierzat = new ArrayList<Zwierze3>();

        /** Dodajemy zwierzeta przy pomocy metody .add() */
        listaZwierzat.add(piesJanusz);
        listaZwierzat.add(kotZbigniew);
        listaZwierzat.add(chomikGryzek);

        /** Sprawdzamy ile elementów zawiera lista */
        System.out.println(listaZwierzat.size());

        /** Na obiekcie o indeksie 1 (kotZbigniew) wykonujemy metode zjedz() i przekazujemy do niej obiekt o indeksie 0 */
        listaZwierzat.get(1).zjedz(listaZwierzat.get(0));

        /** Sprawdzamy, czy w liście istnieje zwierzę o imieniu "Janusz" i jakiego gatunku jest to zwierze */
        for(Zwierze3 poszukiwaneZwierze : listaZwierzat){
            if(poszukiwaneZwierze.getImie() == "Janusz"){
                System.out.println("Zwierzę o imieniu Janusz nalezy do gatunku: " + poszukiwaneZwierze.getGatunek());
            }
        }

    }
}

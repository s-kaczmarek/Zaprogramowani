package lekcje.lekcja1.zadania.zadanie6;

import lekcje.lekcja1.zadania.zadanie2.Dieta;
import lekcje.lekcja1.zadania.zadanie3.Gatunek;
import lekcje.lekcja1.zadania.zadanie5.Wlasciciel;

import java.util.ArrayList;
import java.util.List;

public class Zadanie6App {
    public static void main(String[] args) {

        Wlasciciel ola = new Wlasciciel("Ola", "Kowalska");
        Wlasciciel janusz = new Wlasciciel("Janusz", "Nowak");
        Wlasciciel bartek = new Wlasciciel("Bartek", "Kaczmarek");

        Zwierze4 chomikAndrzej = new Zwierze4(Gatunek.Chomik,"Andrzej", "Pipi", true, Dieta.roslinozerne, ola);
        Zwierze4 kotBasia = new Zwierze4(Gatunek.Kot,"Basia", "Miau", true, Dieta.roslinozerne, janusz);
        Zwierze4 piesReksio = new Zwierze4(Gatunek.Pies, "Reksio", "HauHau", false, Dieta.miesozerne, ola);
        Zwierze4 chomikWanda = new Zwierze4(Gatunek.Chomik, "Wanda", "Pipi", true, Dieta.roslinozerne, bartek);

        List<Zwierze4> listaZwierzat = new ArrayList<Zwierze4>();

        listaZwierzat.add(chomikAndrzej);
        listaZwierzat.add(kotBasia);
        listaZwierzat.add(piesReksio);
        listaZwierzat.add(chomikWanda);

        /** Wyszukaj zwierzaki Oli*/
        String imieWlasciciela = "Ola";
        for(Zwierze4 zwierzak : listaZwierzat){
            if(zwierzak.getWlasciciel().getImie() == imieWlasciciela){
                System.out.println(zwierzak.getGatunek() + " " + zwierzak.getImie());
            }
        }

        /** Wyszukaj wszystkie chomiki*/
        for(Zwierze4 zwierze : listaZwierzat){
            if(zwierze.getGatunek() == Gatunek.Chomik){
                System.out.println(Gatunek.Chomik + " " + zwierze.getImie() + " ma wlasciciela: " + zwierze.getWlasciciel().getImie());
            }
        }
    }
}

package lekcje.lekcja1.zadania.zadanie3;

import lekcje.lekcja1.zadania.zadanie2.Dieta;

import java.util.ArrayList;
import java.util.List;

public class Zadanie3App {

    public static void main(String[] args) {

        Zwierze3 piesJanusz = new Zwierze3(Gatunek.Pies, "Janusz", "hauhau", false, Dieta.miesozerne);
        Zwierze3 kotZbigniew = new Zwierze3(Gatunek.Kot, "Zbigniew", "miau", true, Dieta.miesozerne);

        List<Zwierze3> listaZwierzat = new ArrayList<Zwierze3>();
        listaZwierzat.add(piesJanusz);
        listaZwierzat.add(kotZbigniew);

        System.out.println(listaZwierzat.size());
        listaZwierzat.get(1).zjedz(listaZwierzat.get(0));

    }
}

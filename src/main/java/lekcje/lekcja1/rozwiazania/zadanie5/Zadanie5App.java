package lekcje.lekcja1.rozwiazania.zadanie5;

import java.util.ArrayList;
import java.util.List;

public class Zadanie5App {
    public static void main(String[] args) {

        /** Tworzymy obiekty właściceli samochodów, które są potrzebne do utworzenia obiektów samochodów*/

        Wlasciciel janusz = new Wlasciciel("Janusz", "Kowalski");
        Wlasciciel kasia = new Wlasciciel("Kasia", "Kowalska");
        Wlasciciel andrzej = new Wlasciciel("Andrzej", "Nowak");

        /** Tworzymy obiekty samochodów */

        Samochod samochod1 = new Samochod("PO789456", janusz, Marka.BMW);
        Samochod samochod2 = new Samochod("PZ878AB", kasia, Marka.Fiat);
        Samochod samochod3 = new Samochod("CTR74159", andrzej, Marka.BMW);

        /** Tworzymy pustą listę i dodajemy do niej obiekty samochodów zawierające w sobie obiekty właścicieli */

        List<Samochod> listaSamochodow = new ArrayList<Samochod>();

        listaSamochodow.add(samochod1);
        listaSamochodow.add(samochod2);
        listaSamochodow.add(samochod3);

        /**
         *  OPERACJE NA LISTACH
         */

        /** Wyszukanie po numerze rejestracyjnym
         *  Tworzymy zmienną i przypisujemy do niej numer rejestracyjny jednego z samochodów
         */
        String poszukiwanyNrRejestracyjny = "PZ878AB";

        /** Przy pomocy pętli "for each" pobieramy po kolei każdy obiekt z listy samochodów
         *  i przypisujemy go do zmiennej "poszukiwanySamochod"
         */
        for(Samochod poszukiwanySamochod : listaSamochodow){
            /** pobieramy numer rejestracyjny z obiektu samochodu i porównujemy z wartością zmiennej "poszukiwanyNumerRejestracyjny"*/
            if(poszukiwanySamochod.getNumerRejestracyjny() == poszukiwanyNrRejestracyjny){
                System.out.println("znaleziono samochód o numerze rejestracyjnym: " + poszukiwanySamochod.getNumerRejestracyjny());
            }

        }

        /** Wyszukanie po imieniu i nazwisku własciciela
         *  Tworzymy zmienne przechowujące imię i nazwisko właściciela, którego samochód chcemy odnaleźć
         */
        String imieWlasciciela = "Andrzej";
        String nazwiskoWlasciciela = "Nowak";
        /** Przy pomocy pętli "for each" pobieramy po kolei każdy obiekt z listy samochodów
         *  i przypisujemy go do zmiennej "poszukiwanySamochod"
         */
        for(Samochod poszukiwanySamochod : listaSamochodow){
            /** z pobranego samochodu pobieramy obiekt właściciela i z niego pobieramy imię. POrównujemy z imieniem w zmiennej "imieWlasciciela"
             *  postępujemy tak samo z nazwiwskiem (kod za znakami &&)
             * */
            if(poszukiwanySamochod.getWlasciciel().getImie() == imieWlasciciela && poszukiwanySamochod.getWlasciciel().getNazwisko() == nazwiskoWlasciciela){
                System.out.println("znaleziono samochód wlasciciela: " + imieWlasciciela + nazwiskoWlasciciela);
                System.out.println("Jego marka to: " + poszukiwanySamochod.getMarka());
            }
        }

        /** Przypisz do nowej listy wszystkie samochody marki BMW i wypisz imiona ich właścicieli
         *  Tworzymy pustą listę do której przypiszemy znalezione samochody BMW
         * */
        List<Samochod> listaBMW = new ArrayList<Samochod>();

        /** Pobieramy po kolei każdy samochód i sprawdzamy, czy jego marka jest zgodna z wartością enuma BMW
         *  Jeśli jest zgodna, to dodajemy do listy samochodów bmw
         */
        for(Samochod szukaneBMW : listaSamochodow){
            if(szukaneBMW.getMarka() == Marka.BMW){
                listaBMW.add(szukaneBMW);
            }
        }

        /** Pobieramy po kolei każdy samochód z listy samochodów BMW i wypisujemy imię jego właściciela*/
        for(Samochod znalezioneBMW : listaBMW){
            System.out.println("Wlasciciel BMW: " + znalezioneBMW.getWlasciciel().getImie());
        }
    }
}

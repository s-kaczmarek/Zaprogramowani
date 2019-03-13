package lekcje.lekcja1.zadania.zadanie6;

import lekcje.lekcja1.zadania.zadanie2.Dieta;
import lekcje.lekcja1.zadania.zadanie3.Gatunek;
import lekcje.lekcja1.zadania.zadanie3.Zwierze3;
import lekcje.lekcja1.zadania.zadanie5.Wlasciciel;

public class Zwierze4 {

    private Gatunek gatunek;
    private String imie;
    private String dzwiek;
    private Boolean ucieczka;
    private Dieta dieta;
    private Wlasciciel wlasciciel;


    public Zwierze4(Gatunek _gatunek, String _imie, String _dzwiek, Boolean _ucieczka, Dieta _dieta, Wlasciciel _wlasciciel){
        gatunek = _gatunek;
        imie = _imie;
        dzwiek = _dzwiek;
        ucieczka = _ucieczka;
        dieta = _dieta;
        wlasciciel = _wlasciciel;
    }

    public void zjedz(Zwierze4 zwierze){
        if(dieta == Dieta.miesozerne){
            System.out.println("jestem miesozerny, chetnie zjem: " + zwierze.getGatunek());
        }else{
            System.out.println("jestem wegeterianinem, nie zjem: " + zwierze.getGatunek());
        }

    }

    public void dajGlos(){
        System.out.println(gatunek + " " + imie + " " + "powiedział: " + dzwiek);
    }

    public void czyUcieklPrzedZwierzeciem(Zwierze4 zwierze){
        if(ucieczka == true){
            System.out.println(gatunek + " " + imie + " " + "uciekł " + "przed " + zwierze.getGatunek() + " " + zwierze.getImie());
        }else{
            System.out.println(gatunek + " " + imie + " " + "nie uciekł " + "przed " + zwierze.getGatunek() + " "  + zwierze.getImie());
        }
    }

    public Gatunek getGatunek() {
        return gatunek;
    }

    public String getImie() {
        return imie;
    }

    public Wlasciciel getWlasciciel() {
        return wlasciciel;
    }
}

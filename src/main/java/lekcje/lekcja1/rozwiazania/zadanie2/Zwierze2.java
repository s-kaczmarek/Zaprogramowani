package lekcje.lekcja1.rozwiazania.zadanie2;

import lekcje.lekcja1.rozwiazania.zadanie1.Zwierze;

public class Zwierze2 {

    private String gatunek;
    private String imie;
    private String dzwiek;
    private Boolean ucieczka;
    private Dieta dieta;


    public Zwierze2(String _gatunek, String _imie, String _dzwiek, Boolean _ucieczka, Dieta _dieta){
        gatunek = _gatunek;
        imie = _imie;
        dzwiek = _dzwiek;
        ucieczka = _ucieczka;
        dieta = _dieta;
    }

    public void zjedz(Zwierze2 zwierze){
        if(dieta == Dieta.miesozerne){
            System.out.println("jestem miesozerny, chetnie zjem: " + zwierze.getGatunek());
        }else{
            System.out.println("jestem wegeterianinem, nie zjem: " + zwierze.getGatunek());
        }

    }

    public void dajGlos(){
        System.out.println(gatunek + " " + imie + " " + "powiedział: " + dzwiek);
    }

    public void czyUcieklPrzedZwierzeciem(Zwierze zwierze){
        if(ucieczka == true){
            System.out.println(gatunek + " " + imie + " " + "uciekł " + "przed " + zwierze.getGatunek() + " " + zwierze.getImie());
        }else{
            System.out.println(gatunek + " " + imie + " " + "nie uciekł " + "przed " + zwierze.getGatunek() + " "  + zwierze.getImie());
        }
    }

    public String getGatunek() {
        return gatunek;
    }

    public String getImie() {
        return imie;
    }
}

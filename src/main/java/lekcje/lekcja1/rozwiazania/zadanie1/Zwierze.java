package lekcje.lekcja1.rozwiazania.zadanie1;

public class Zwierze {

    private String gatunek;
    private String imie;
    private String dzwiek;
    private Boolean ucieczka;

    public Zwierze(String _gatunek, String _imie, String _dzwiek, Boolean _ucieczka){
        gatunek = _gatunek;
        imie = _imie;
        dzwiek = _dzwiek;
        ucieczka = _ucieczka;
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

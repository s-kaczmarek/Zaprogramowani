package lekcje.lekcja1.zadania.zadanie4;

import lekcje.lekcja1.przyklady.przyklad1.Osoba;

public class McDonnalds {
    MenuMcDonnalds produkt;
    Osoba klient;

    public McDonnalds(MenuMcDonnalds _produkt, Osoba _klient){
        produkt = _produkt;
        klient = _klient;
    }

    public void kup(double zaplata){
        System.out.println("Witaj w McDonnald's " + klient.getImie());
        System.out.println("zamowiles: " + produkt);
        System.out.println("twoja zaplata: " + zaplata);
        if(zaplata > produkt.getCena()){
            double reszta = zaplata - produkt.getCena();
            System.out.println("Odbierz swoje zamowienie, oraz reszte: " + reszta);
        }else if(zaplata == produkt.getCena()){
            System.out.println("Odbierz swoje zamowienie");
        }else{
            System.out.println("Zaplaciles za malo!");
        }
    }
}

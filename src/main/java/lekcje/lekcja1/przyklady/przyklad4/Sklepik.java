package lekcje.lekcja1.przyklady.przyklad4;

public class Sklepik {

    // Pole przechowujące wartość z enuma
    Produkty produkt;

    // Konstruktor przypisujący wartość z enuma do pola
    public Sklepik(Produkty _produkt){
        produkt = _produkt;
    }

    // Metoda, do której przekazujemy naszą zapłatę, a ona oblicza,
    // czy jest wystarczająca i wydaje produkt oraz resztę
    public void kupProdukt(double zaplata){

        if(zaplata < produkt.getCena()){

            System.out.println("Przykro mi, zaplaciles za malo");

        }else if(zaplata == produkt.getCena()){

            System.out.println("Bardzo prosze, kupiles: " + produkt);

        }else{
            double resztaDoWydania = zaplata - produkt.getCena();
            System.out.println("Bardzo prosze, oto Twoj produkt: " + produkt + " i " + resztaDoWydania + " reszty");
        }
    }
}

package lekcje.lekcja1.przyklady.przyklad4;

public class Przyklad4App {

    public static void main(String[] args) {

        Sklepik sklepikZjablkami = new Sklepik(Produkty.jablko);
        sklepikZjablkami.kupProdukt(1d);
        sklepikZjablkami.kupProdukt(2d);
        sklepikZjablkami.kupProdukt(1.2d);

        Sklepik sklepikZwafelkami = new Sklepik(Produkty.wafelek);
        sklepikZwafelkami.kupProdukt(2d);
        sklepikZwafelkami.kupProdukt(2.5d);
        sklepikZwafelkami.kupProdukt(5d);

    }
}

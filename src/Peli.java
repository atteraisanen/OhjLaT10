/**
 * Pääluokka pelin käynnistämiseksi.
 */
public class Peli {
    public static void main(String args[]) {
        Pelaaja p1 = new Pelaaja("Pelaaja 1");
        Pelaaja p2 = new Pelaaja("Pelaaja 2");
        PelinTila pelinTila = new PelinTila(p1, p2);

        do {
            pelinTila.tulostaPelinTila();
            pelinTila.pelaaKierros();

            if (pelinTila.onkoPeliPaattynyt()) {
                System.out.println("KOLME VOITTOA - PELI PÄÄTTYY");
                break;
            }

            System.out.println();
        } while (true);
    }
}
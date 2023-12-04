import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class PeliTest {

    @Test
    void testPelaajanValinta() {
        Pelaaja pelaaja = new Pelaaja("Testipelaaja");

        for (int i = 0; i < 100; i++) {
            String valinta = pelaaja.pelaajanValinta();
            assertTrue(valinta.equals("kivi") || valinta.equals("paperi") || valinta.equals("sakset"));
        }
    }

    @Test
    void testLisaaVoitto() {
        Pelaaja pelaaja = new Pelaaja("Testipelaaja");

        assertEquals(0, pelaaja.getVoitot());
        pelaaja.lisaaVoitto();
        assertEquals(1, pelaaja.getVoitot());
    }

    @Test
    void testPelaaKierros() {
        Pelaaja pelaaja1 = new Pelaaja("Pelaaja 1");
        Pelaaja pelaaja2 = new Pelaaja("Pelaaja 2");
        PelinTila pelinTila = new PelinTila(pelaaja1, pelaaja2);

        int ennenKierrosta = pelinTila.getPelatutPelit();
        pelinTila.pelaaKierros();
        assertEquals(ennenKierrosta + 1, pelinTila.getPelatutPelit());
    }

}

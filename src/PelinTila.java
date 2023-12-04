/**
 * Luokka pelin tilan seurantaan.
 */
public class PelinTila {
    private int pelatutPelit;
    private int tasapelit;
    private Pelaaja pelaaja1;
    private Pelaaja pelaaja2;

    public PelinTila(Pelaaja pelaaja1, Pelaaja pelaaja2) {
        this.pelatutPelit = 0;
        this.tasapelit = 0;
        this.pelaaja1 = pelaaja1;
        this.pelaaja2 = pelaaja2;
    }

    //Pelaa kierros peliä
    public void pelaaKierros() {
        String p1Valinta = pelaaja1.pelaajanValinta();
        String p2Valinta = pelaaja2.pelaajanValinta();

        System.out.println("Pelaaja 1: " + p1Valinta + "\n\t" + pelaaja1.getNimi() + ": " + pelaaja1.getVoitot() + " voittoa.");
        System.out.println("Pelaaja 2: " + p2Valinta + "\n\t" + pelaaja2.getNimi() + ": " + pelaaja2.getVoitot() + " voittoa.");

        if (p1Valinta.equals(p2Valinta)) {
            tasapelit++;
            System.out.println("\n\t\t\t Tasapeli \n");
        } else if (
            (p1Valinta.equals("kivi") && p2Valinta.equals("sakset")) ||
            (p1Valinta.equals("paperi") && p2Valinta.equals("kivi")) ||
            (p1Valinta.equals("sakset") && p2Valinta.equals("paperi"))
        ) {
            pelaaja1.lisaaVoitto();
            System.out.println(pelaaja1.getNimi() + " voittaa");
        } else {
            pelaaja2.lisaaVoitto();
            System.out.println(pelaaja2.getNimi() + " voittaa");
        }

        pelatutPelit++;
    }
    //Palauta pelattujen pelien lukumäärä
    public int getPelatutPelit() {
    	return pelatutPelit;
    }
    
    //Palauta tasapelien lukumäärä
    public int getTasapelit() {
    	return tasapelit;
    }
    
    //Palauta onko peli päättynyt
    public boolean onkoPeliPaattynyt() {
        return (pelaaja1.getVoitot() >= 3) || (pelaaja2.getVoitot() >= 3);
    }

    //Tulosta näytölle pelatun pelin tila
    public void tulostaPelinTila() {
        System.out.println("Erä: " + pelatutPelit + " =====================\n");
        System.out.println("Tasapelien lukumäärä: " + tasapelit + "\n");
    }
}
/**
 * Luokka pelaajan tietojen seurantaan.
 */
public class Pelaaja {
    private String nimi;
    private int voitot;

    public Pelaaja(String nimi) {
        this.nimi = nimi;
        this.voitot = 0;
    }

    /**
     * Valitse randomilla kivi, paperi tai sakset.
     */
    public String pelaajanValinta() {
        int c = (int) (Math.random() * 3);
        switch (c) {
            case 0:
                return "kivi";
            case 1:
                return "paperi";
            case 2:
                return "sakset";
            default:
                return "";
        }
    }

    //Palauta pelaajan voittojen määrä
    public int getVoitot() {
        return voitot;
    }

    //Lisää pelaajalle voitto
    public void lisaaVoitto() {
        voitot++;
    }

    //Palauta pelaajan nimi
    public String getNimi() {
        return nimi;
    }
}
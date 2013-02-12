package laivanupotus.domain;

import java.util.ArrayList;
/*
 * Laivoja hallinnoiva luokka
 */

public class PeliLauta {

    private ArrayList<Laiva> laivat;
    private KoordinaattiArpoja arpoja;
    private ArrayList<Ruutu> osumat;

    public PeliLauta() {
        this.laivat = new ArrayList<Laiva>();
        this.arpoja = new KoordinaattiArpoja();
        this.osumat = new ArrayList<Ruutu>();
    }
    /*
     * @Param Luo laivat KoordinaattiArpojan arpomilla arvoilla.
     */

    public void luoLaivat() {
        int ruutujenMaara = 1;
        int x = 0;
        int y = 0;
        for (int i = 0; i < 4; i++) {
            Laiva alus = new Laiva();
            arpoja.Suunta();
            int j = 0;
            while (j < ruutujenMaara) {
                if (j == 0) {
                    x = arpoja.arvoLuku();
                    y = arpoja.arvoLuku();
                    boolean tarkistus = tarkistus(x, y);
                    while (tarkistus) {
                        x = arpoja.arvoLuku();
                        y = arpoja.arvoLuku();
                        tarkistus = tarkistus(x, y);
                    }
                } else {
                    x = arpoja.palautaX(x);
                    y = arpoja.palautaY(y);
                    boolean tarkistus = tarkistus(x, y);
                    while (tarkistus) {
                        arpoja.Suunta();
                        x = arpoja.palautaX(x);
                        y = arpoja.palautaY(y);
                        tarkistus = tarkistus(x, y);
                    }
                }
                alus.lisaaRuutu(new Ruutu(x, y));
                j++;
            }
            laivat.add(alus);
            ruutujenMaara++;
        }
    }
    /*
     * @Param Luo laivat tietyillä peräkkäisillä arvoilla
     */

    public void luoLaivatTesteille() {
        for (int i = 0; i < 4; i++) {
            Laiva uusi = new Laiva();
            laivat.add(uusi);
        }
        int x = 0;
        int ruutujenMaara = 1;
        for (Laiva bootti : this.laivat) {
            int y = 0;
            for (int j = 0; j < ruutujenMaara; j++) {
                Ruutu ruutu = new Ruutu(x, y);
                bootti.lisaaRuutu(ruutu);
      
                    y++;
              
            }
            ruutujenMaara++;
            x++;
        }
    }
    /*
     * @Return Palauttaa arvon true- jos käyttäjän syöttämät koordinaatit osuvat
     * listalla olevaan ruutuun. 
     */

    public boolean osuu(int x, int y) {
        for (Laiva laiva1 : laivat) {
            for (Ruutu pala : laiva1.Ruudut()) {
                if (pala.getX() == x && pala.getY() == y) {
                    laiva1.osuma(pala);
                    if (laiva1.uppooko()) {
                        System.out.println("Osui ja upposi!");
                        return true;
                    }
                    return true;
                }
            }
        }
        return false;
    }
    /*
     * @Return metodi tarkistaa, löytyykö samoja koordinaatteja omaavia Ruutuja
     * listasta. Palauttaa true- jos on
     */

    public boolean tarkistus(int x, int y) {
        if (!laivat.isEmpty()) {
            if (x > 9 || x < 0) {
                return true;
            } else if (y > 9 || y < 0) {
                return true;
            }
            for (Laiva laiva : laivat) {
                for (Ruutu ruutu : laiva.Ruudut()) {
                    if (ruutu.getX() == x && ruutu.getY() == y) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public void tulostaLaivat() {
        for (Laiva laiva : laivat) {
            System.out.print("[");
            for (Ruutu ruutu : laiva.Ruudut()) {
                System.out.print("(" + ruutu.getX() + ":" + ruutu.getY() + ")");
            }
            System.out.println("]");
        }
    }

    public ArrayList<Laiva> getLaivat() {
        return laivat;
    }
    /*
     * @return Tarkistaa, onko laiva saanut pituudensa verran osumia.
     * Jos on, niin palauttaa true eli on uponnut
     */

    public boolean onkoUponnut() {
        int uponneita = 0;
        for (Laiva laiva : laivat) {
            if(laiva.uppooko()){
               uponneita++; 
            }
        }
        if (uponneita == 4) {
            return true;
        }
        return false;
    }
}

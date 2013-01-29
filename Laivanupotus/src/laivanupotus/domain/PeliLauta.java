package laivanupotus.domain;

import java.util.ArrayList;

public class PeliLauta {

    private ArrayList<Laiva> laivat;
    private KoordinaattiArpoja arpoja;

    public PeliLauta() {
        this.laivat = new ArrayList<Laiva>();
        this.arpoja = new KoordinaattiArpoja();
    }

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
                if (j > 0) {
                    y++;
                }
            }
            ruutujenMaara++;
            x++;
        }
    }

    public boolean osuu(int x, int y) {
        for (Laiva laiva1 : laivat) {
            for (Ruutu pala : laiva1.Ruudut()) {
                if (pala.getX() == x && pala.getY() == y) {
                    laiva1.osuma(pala);
                    if (laiva1.uppooko()) {
                        System.out.println("Upposi!");
                    }
                    return true;
                }
            }
        }
        return false;
    }

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
}

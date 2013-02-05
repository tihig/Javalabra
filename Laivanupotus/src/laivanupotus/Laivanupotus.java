package laivanupotus;

import laivanupotus.gui.Kayttoliittyma;

public class Laivanupotus {

    public static void main(String[] args) {
        Peli peli = new Peli();
        peli.AmmuksiaTestille();

        Kayttoliittyma kayttis = new Kayttoliittyma(peli, 20);

        kayttis.run();
        peli.getLauta().luoLaivat();
        peli.getLauta().tulostaLaivat();
        peli.kaynnista();
        
    }
}
package laivanupotus;

import laivanupotus.gui.Kayttoliittyma;

public class Laivanupotus {

    public static void main(String[] args) {
        Peli peli = new Peli();
//        peli.AmmuksiaTestille();

        Kayttoliittyma kayttis = new Kayttoliittyma(peli, 20);

        kayttis.run();
//        peli.kaynnista();
        peli.getLauta().luoLaivatTesteille();
        peli.getLauta().tulostaLaivat();
        peli.osuuko(1, 0);
        peli.osuuko(9, 9);
        System.out.println(peli.tyhjia().size());
       


    }
}
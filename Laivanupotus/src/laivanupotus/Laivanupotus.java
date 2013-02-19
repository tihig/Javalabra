package laivanupotus;

import laivanupotus.gui.Kayttoliittyma;

public class Laivanupotus {

    public static void main(String[] args) throws Exception{
        Peli peli = new Peli();
        Kayttoliittyma kayttis = new Kayttoliittyma(peli, 20);

        kayttis.run();
        peli.kaynnista();
        //Testikoodit:
//        peli.AmmuksiaTestille();
//        peli.getLauta().luoLaivatTesteille();
//        peli.getLauta().tulostaLaivat();


    }
}
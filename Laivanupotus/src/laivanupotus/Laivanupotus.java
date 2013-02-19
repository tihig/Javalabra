package laivanupotus;


import laivanupotus.tulokset.Tulokset;
import laivanupotus.gui.Kayttoliittyma;

public class Laivanupotus {

    public static void main(String[] args) throws Exception{
        Peli peli = new Peli();
        peli.AmmuksiaTestille();

        Kayttoliittyma kayttis = new Kayttoliittyma(peli, 20);

        kayttis.run();
        peli.kaynnista();


    }
}

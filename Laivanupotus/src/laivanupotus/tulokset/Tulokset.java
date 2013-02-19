package laivanupotus.tulokset;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

/**
 *
 * Tulosten tallennus
 */
public class Tulokset {

    private String[] tulosLista;
    private Scanner lukija;
    private File tiedosto;
  
    private FileWriter kirjoittaja;

    public Tulokset() throws Exception {
        this.tulosLista = new String[10];
        this.tiedosto = new File("src/lista/lista.txt");
        this.lukija = new Scanner(tiedosto);
        this.kirjoittaja = new FileWriter("src/lista/lista.txt");
        kirjoittaja.write("Tulokset: \n");
        kirjoittaja.close();
    }

    public void lisaaTulos(String nimi, int ammustenMaara) throws Exception {
        this.kirjoittaja = new FileWriter("src/lista/lista.txt");
        kirjoittaja.append(nimi + "  " + ammustenMaara + "\n");
        kirjoittaja.close();
    }

    public void tulostaTulokset() throws Exception{
        tulosLista = getTulosLista();
        for (int i = 0; i < tulosLista.length; i++) {
            System.out.println(tulosLista[i]);
        }
    }

    public String[] getTulosLista() throws Exception {
        int i = 0;
        while(lukija.hasNextLine()){
            tulosLista[i] = lukija.nextLine();
        }
        return tulosLista;
    }
}

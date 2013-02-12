package laivanupotus.domain;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import laivanupotus.Laivanupotus;

/**
 *
 * Tulosten tallennus
 */
public class Tulokset {

    private Scanner lukija;
    private File lista;

    public Tulokset() throws FileNotFoundException { 
        this.lista = new File("C:/Users/Viivi/Documents/ssh/Laivanupotus/src/laivanupotus/domain/A3lista.txt");
        this.lukija = new Scanner(lista);
    }

    public void lisaaTulos(String nimi, int ammustenMaara) throws IOException {
     FileWriter kirjoittaja = new FileWriter(lista);
        kirjoittaja.write("Nimi: " + nimi + ", Tulos: " + ammustenMaara);
        kirjoittaja.close();
    }

    public void tulostaTulokset() {
       while(lukija.hasNextLine()){
           System.out.println(lukija.nextLine());
       }
    }
}

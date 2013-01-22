package laivanupotus;

import java.util.Scanner;
import laivanupotus.domain.peliLauta;

public class Peli {

    private Scanner lukija;
    private peliLauta lauta;

    public Peli() {
        this.lukija = new Scanner(System.in);
        this.lauta = new peliLauta();
        lauta.luoLaivat();
    }

    public void kaynnista() {
        while (true) {
            System.out.println("Anna kirjain(A-J ja X lopettaa):");
            String vastaus = lukija.nextLine();
            if (vastaus.contains("X")) {

                System.out.println("Game Over");
                break;
            } else {
                System.out.println("Anna numero(0-9):");
                int vastaus2 = Integer.parseInt(lukija.nextLine());


                int paluuarvo = muutaArvo(vastaus);
                if (paluuarvo == 99) {
                    System.out.println("väärä arvo!");
                } else {
                    this.osuuko(lauta.osuu(paluuarvo, vastaus2));
                }
            }
        }
    }

    public int muutaArvo(String arvo) {
        String kirjaimet = "ABCDEFGHIJ";
        char kirjain = arvo.charAt(0);

        for (int i = 0; i < kirjaimet.length(); i++) {
            if (kirjaimet.charAt(i) == kirjain) {
                return i;
            }
        }
        return 99;
    }

    public void osuuko(boolean arvo) {
        if (arvo == true) {
            System.out.println("osui!");
        } else {
            System.out.println("Ohi!");
        }
    }
}

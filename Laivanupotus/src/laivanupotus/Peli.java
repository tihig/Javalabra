package laivanupotus;

import java.util.Scanner;
import laivanupotus.domain.PeliLauta;

public class Peli {

    private Scanner lukija;
    private PeliLauta lauta;

    public Peli() {
        this.lukija = new Scanner(System.in);
        this.lauta = new PeliLauta();
    }

    public void kaynnista() {
        lauta.luoLaivat();
        while (true) {
            System.out.println("Anna koordinaatit(A-J + 0-9 ja X- lopettaa):");
            String vastaus = lukija.nextLine();
            if (vastaus.contains("X")) {
                System.out.println("Game Over");
                break;
            }
            int arvoX = muutaArvoX(vastaus);
            int arvoY = muutaArvoY(vastaus);
            if (arvoX == 99 || arvoY == 99) {
                System.out.println("väärä arvo!");
            } else {
                System.out.println(this.osuuko(lauta.osuu(arvoX, arvoY)));

            }
        }
    }

    public int muutaArvoX(String arvo) {
        String kirjaimet = "ABCDEFGHIJ";
        int i = 0;
        while (i < kirjaimet.length()) {
            if (kirjaimet.charAt(i) == arvo.charAt(0)) {
                return i;
            }
            i++;
        }
        return 99;
    }

    public int muutaArvoY(String arvo) {
        String numerot = "0123456789";
        int i = 0;
        while (i < numerot.length()) {
            if (numerot.charAt(i) == arvo.charAt(1)) {
                return i;
            }
            i++;
        }
        return 99;
    }

    public String osuuko(boolean arvo) {
        if (arvo == true) {
            return "Osui!";
        }
        return "Ohi!";
    }
}

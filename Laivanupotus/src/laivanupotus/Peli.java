package laivanupotus;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import laivanupotus.domain.PeliLauta;
import laivanupotus.domain.Ruutu;

/*
 * Hallinnoi käyttäjän syötteitä ja pitää kirjaa ammutuista ammuksista
 */
public class Peli {

    private PeliLauta lauta;
    private ArrayList<Ruutu> osumat;
    private ArrayList<Ruutu> ohi;
    private ArrayList<Ruutu> tyhjat;
    private int AmmusLaskuri;

    public Peli() {

        this.lauta = new PeliLauta();
        this.AmmusLaskuri = 0;
        this.osumat = new ArrayList<Ruutu>();
        this.ohi = new ArrayList<Ruutu>();
        this.tyhjat = new ArrayList<Ruutu>();


    }
    /*
     * @Param Käynnistää pelin luomalla laivat
     * 
     */

    public void kaynnista() {
        lauta.luoLaivat();
    }
    /*
     * @Param käyttöliittymän kanssa yhteensopiva käynnistys
     */

    public void syotaArvot(String arvo) {
        String vastaus = arvo.toUpperCase();
        int arvoX = muutaArvoX(vastaus);
        int arvoY = muutaArvoY(vastaus);
        if (arvoX == 99 || arvoY == 99) {
        } else {
            lauta.osuukoLaivaan(arvoX, arvoY);
            this.osuuko(arvoX, arvoY);
            AmmusLaskuri++;
        }
        if (lauta.ovatkoKaikkiUponneet()) {
            System.out.println("VOITTO!");
        }
        if (AmmusLaskuri >= 50) {
        }
    }
    /*
     * @return palauttaa kirjainta vastaavaan numerokoordinaatin
     */

    public int muutaArvoX(String arvo) {   
        String kirjaimet = "ABCDEFGHIJ";
        int i = 0;
        while (i < kirjaimet.length()) {
            if (kirjaimet.charAt(i) == arvo.charAt(0)) {
                return i;
            }
            i++;
        }
        if (kirjaimet.contains(arvo.charAt(0) + "")) {
            return kirjaimet.indexOf(arvo.charAt(0));
        } else {
            JOptionPane.showMessageDialog(null, "Syötä koordinaatit muodossa 'F7'");
            return 99;
        }
    }
    /*
     * @return palauttaa kirjainmuodossa annetun numeron numeromuotoisena
     */

    public int muutaArvoY(String arvo) {
        arvo = arvo.substring(1);
        int x = -1;
        try {
            x = Integer.parseInt(arvo);
        } catch (NumberFormatException nx) {
            JOptionPane.showMessageDialog(null, "Syötä koordinaatit muodossa 'F7'");
        }
        x--;
        String numerot = "0123456789";
        if (numerot.contains(x + "")) {
            return x;
        } else {
            JOptionPane.showMessageDialog(null, "Syötä koordinaatit muodossa 'F7'");
            return 99;
        }
    }
    /*
     * @Param testitapauksille lopetuksen todentaminen
     */

    public void AmmuksiaTestille() {
        AmmusLaskuri += 48;
    }

    public int getAmmukset() {
        return AmmusLaskuri;
    }

    public PeliLauta getLauta() {
        return lauta;
    }
    /*
     * @Param Tarkistaa osuuko ja päivittää tilastoja osumista
     */

    public void osuuko(int x, int y) {
        if (lauta.osuukoLaivaan(x, y)) {
            osumat.add(new Ruutu(x, y));
        } else {
            ohi.add(new Ruutu(x, y));
        }
    }

    public ArrayList<Ruutu> osumat() {
        return osumat;
    }

    public ArrayList<Ruutu> ohi() {
        return ohi;
    }
    /*
     * @return palauttaa vielä valitsemattomat ruudut
     */

    public ArrayList<Ruutu> getTyhjat() {
        this.tyhjat = new ArrayList<Ruutu>();
        int x = 0;
        for (int i = 0; i < 10; i++) {
            int y = 0;
            for (int j = 0; j < 10; j++) {
                Ruutu uusi = new Ruutu(x, y);
                boolean loytyyko = false;
                for (Ruutu ruutu : osumat) {
                    if (ruutu.getX() == uusi.getX() && ruutu.getY() == uusi.getY()) {
                        loytyyko = true;
                        break;
                    }
                }
                if (loytyyko == false) {
                    for (Ruutu ruutu : ohi) {
                        if (ruutu.getX() == uusi.getX() && ruutu.getY() == uusi.getY()) {
                            loytyyko = true;
                            break;
                        }
                    }
                }
                if (loytyyko == false) {
                    tyhjat.add(uusi);
                }
                y++;
            }
            x++;
        }
        return tyhjat;
    }
}

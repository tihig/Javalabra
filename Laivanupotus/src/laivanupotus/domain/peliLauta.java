package laivanupotus.domain;

import java.util.ArrayList;

public class peliLauta {

    private ArrayList<Laiva> laivat;

    public peliLauta() {
        this.laivat = new ArrayList<Laiva>();
    }

    public void luoLaivat() {
        Laiva eka = new Laiva();
        eka.lisaaRuutu(new Ruutu(4, 5));
        laivat.add(eka);
    }

    public boolean osuu(int x, int y) {
        Laiva laiva = laivat.get(0);
        Ruutu ruutu = laiva.getRuutu(0);
        if (ruutu.getX() == x && ruutu.getY() == y) {

            return true;
        }
        return false;
    }
}

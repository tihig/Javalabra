package laivanupotus.domain;

import java.util.ArrayList;

public class Laiva {

    private ArrayList<Ruutu> palat;
    private int osumat;

    public Laiva() {
        this.palat = new ArrayList<Ruutu>();
    }

    public void lisaaRuutu(Ruutu ruutu) {
        palat.add(ruutu);
    }

    public Ruutu getRuutu(int i) {
        return palat.get(i);
    }

    public ArrayList<Ruutu> Ruudut() {
        return palat;
    }

    public void osuma(Ruutu ruutu) {
        int i = 0;
        while (i < palat.size()) {
            Ruutu verrattava = palat.get(i);
            if (ruutu.getX() == verrattava.getX() && ruutu.getY() == verrattava.getY()) {
                osumat++;
            }
            i++;
        }
    }

    public boolean uppooko() {
        if (osumat == palat.size()) {
            return true;
        }
        return false;
    }

    public int getOsumat() {
        return osumat;
    }
}

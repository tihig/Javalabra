package laivanupotus.domain;

import java.util.ArrayList;

public class Laiva {

    private ArrayList<Ruutu> palat;

    public Laiva() {
        this.palat = new ArrayList<Ruutu>();
    }
    public void lisaaRuutu(Ruutu ruutu){
        palat.add(ruutu);
    }
    public Ruutu getRuutu(int i){
        return palat.get(i);
    }
    public ArrayList<Ruutu> Ruudut(){
        return palat;
    }
}

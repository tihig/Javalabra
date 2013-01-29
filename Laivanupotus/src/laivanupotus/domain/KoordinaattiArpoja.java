package laivanupotus.domain;

import java.util.Random;

public class KoordinaattiArpoja {

    private Random arvonta;
    private int suunta;

    public KoordinaattiArpoja() {
        this.arvonta = new Random();
        this.suunta = 0;
    }

    public int arvoLuku() {
        return arvonta.nextInt(9);
    }

    public void Suunta() {
        suunta = arvonta.nextInt(3);
    }

    public void annaSuunta(int luku) {
        if (luku > 0 && luku < 4) {
            suunta = luku;
        }
    }

    public int palautaX(int x) {
        if (suunta == 0) {
            x--;
        } else if (suunta == 1) {
            x++;
        }
        return x;
    }

    public int palautaY(int y) {
        if (suunta == 2) {
            y--;
        } else if (suunta == 3) {
            y++;
        }
        return y;
    }

    public int getSuunta() {
        return suunta;
    }
}

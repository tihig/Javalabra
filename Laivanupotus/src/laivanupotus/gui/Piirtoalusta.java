package laivanupotus.gui;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import laivanupotus.Peli;
import laivanupotus.domain.Ruutu;
/*
 * Pelialustan piirtäminen tapahtuu täällä
 */

class Piirtoalusta extends JPanel implements Paivitettava {

    private Peli peli;
    private int sivunPituus;

    public Piirtoalusta(Peli peli, int palanSivunPituus) {
        super.setBackground(Color.LIGHT_GRAY);
        this.peli = peli;
        this.sivunPituus = palanSivunPituus;
    }

    @Override
    protected void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        graphics.setColor(Color.BLUE);
        for (Ruutu ruutu : peli.getTyhjat()) {
            graphics.fill3DRect(ruutu.getX() * sivunPituus, ruutu.getY() * sivunPituus, sivunPituus, sivunPituus, true);
        }
        graphics.setColor(Color.RED);
        for (Ruutu ruutu : peli.osumat()) {
            graphics.fill3DRect(ruutu.getX() * sivunPituus, ruutu.getY() * sivunPituus, sivunPituus, sivunPituus, true);
        }
        graphics.setColor(Color.GRAY);
        for (Ruutu ruutu : peli.ohi()) {
            graphics.fill3DRect(ruutu.getX() * sivunPituus, ruutu.getY() * sivunPituus, sivunPituus, sivunPituus, true);
        }

    }

    @Override
    public void Paivita() {
        super.repaint();
    }
}

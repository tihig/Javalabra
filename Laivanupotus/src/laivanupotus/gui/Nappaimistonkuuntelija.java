package laivanupotus.gui;

import java.awt.Component;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JTextField;
import laivanupotus.Peli;
import laivanupotus.tulokset.TuloksetIkkuna;
/*
 * Mahdollistaa enterin käytön ampumisessa
 */

class Nappaimistonkuuntelija implements KeyListener {

    private Peli peli;
    private Component component;
    private JTextField kentta;

    public Nappaimistonkuuntelija(Peli peli, Component component, JTextField kentta) {
        this.peli = peli;
        this.component = component;
        this.kentta = kentta;
    }

    @Override
    public void keyTyped(KeyEvent ke) {
    }

    @Override
    public void keyPressed(KeyEvent ke) {
        if (peli.getAmmukset() == 50) {
            kentta.setText("GAME OVER");
            kentta.setEnabled(false);

            TuloksetIkkuna tulokset = null;
            try {
                tulokset = new TuloksetIkkuna(peli);
            } catch (Exception ex) {
                System.out.println("ERROR");
            }

            tulokset.run();
        }
        if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
            String vastaus = kentta.getText();
            peli.syotaArvot(vastaus);
            kentta.setText("");
            component.repaint();
        }
        if (peli.getLauta().ovatkoKaikkiUponneet()) {
            TuloksetIkkuna tulokset = null;
            try {
                tulokset = new TuloksetIkkuna(peli);
            } catch (Exception ex) {
                System.out.println("ERROR");
            }
            tulokset.run();
        }
    }

    @Override
    public void keyReleased(KeyEvent ke) {
    }
}

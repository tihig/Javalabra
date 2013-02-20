/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package laivanupotus.tulokset;

import java.awt.Container;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JList;
import javax.swing.JTextField;
import laivanupotus.Peli;

/*
 * Mahdollistaa enterin käytön tuloslistassa
 */
class TNappaimistonkuuntelija implements KeyListener {

    private Peli peli;
    private JList lista;
    private Container container;
    private JTextField kentta;
    private Tulokset tulokset;

    public TNappaimistonkuuntelija(JTextField syoteKentta, Peli peli, JList lista, Container container) throws Exception {
        this.peli = peli;
        this.lista = lista;
        this.kentta = syoteKentta;
        this.container = container;
        this.tulokset = new Tulokset();
    }

    @Override
    public void keyTyped(KeyEvent ke) {
    }

    @Override
    public void keyPressed(KeyEvent ke) {
        if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
            String annettuNimi = kentta.getText();
            try {
                tulokset.lisaaTulos(annettuNimi, peli.getAmmukset());
            } catch (Exception ex) {
                kentta.setText("Ei onnistunut");
            }
            try {
                container.remove(0);
                lista = new JList(tulokset.getTulosLista());
                container.add(lista);

            } catch (Exception ex) {
                kentta.setText("listassa virhe");
            }
        }

    }

    @Override
    public void keyReleased(KeyEvent ke) {
    }
}


package laivanupotus.tulokset;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JTextField;
import laivanupotus.Peli;

/**
 *
 * Mahdollistaa napin käytön tuloslistassa
 */
public class TToimintoKuuntelija implements ActionListener {

    private JTextField kentta;
    private JButton nappi;
    private Tulokset tulokset;
    private Peli peli;
    private JList lista;
    private Container container;

    public TToimintoKuuntelija(JTextField syoteKentta, JButton nappi, Peli peli, JList lista, Container container) throws Exception {
        this.kentta = syoteKentta;
        this.nappi = nappi;
        this.tulokset = new Tulokset();
        this.peli = peli;
        kentta.setText("Anna nimi");
        this.lista = lista;
        this.container = container;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == nappi) {
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
}

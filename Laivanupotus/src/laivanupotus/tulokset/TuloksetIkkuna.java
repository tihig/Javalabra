package laivanupotus.tulokset;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import laivanupotus.Peli;

/**
 * Pelin jälkeinen tulosten näyttäminen
 *
 * @author Viivi
 */
public class TuloksetIkkuna implements Runnable {

    private JFrame frame;
    private Peli peli;
    private Tulokset tulokset;

    public TuloksetIkkuna(Peli peli) throws Exception{
        this.peli = peli;
        this.tulokset = new Tulokset();

    }

    @Override
    public void run() {
        frame = new JFrame("Tulokset");

        frame.setPreferredSize(new Dimension(300, 400));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        try {
            luoKomponentit(frame.getContentPane());
        } catch (Exception ex) {
            System.out.println("ERROR");;
        }

        frame.pack();
        frame.setVisible(true);
    }

    public void luoKomponentit(Container container) throws Exception{
        container.setLayout(new BorderLayout());
        JTextField syoteKentta = new JTextField();

        String[] tulosLista = tulokset.getTulosLista();
        JList lista = new JList(tulosLista);
        container.add(lista);

        JButton enter = new JButton("Enter");
        TulosToimintoKuuntelija toimija = new TulosToimintoKuuntelija(syoteKentta, enter, peli, lista, container);
        enter.addActionListener(toimija);
        syoteKentta.addActionListener(toimija);

        JPanel valikko = luoValikko();
        valikko.add(syoteKentta);
        valikko.add(enter);
        container.add(valikko, BorderLayout.SOUTH);
    }

    private JPanel luoValikko() {
        JPanel panel = new JPanel(new GridLayout(1, 2));
        return panel;
    }
}

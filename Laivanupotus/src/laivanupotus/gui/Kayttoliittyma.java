package laivanupotus.gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import laivanupotus.Peli;
/*
 * Hallinnoi graaffista ulkoasua
 */

public class Kayttoliittyma implements Runnable {

    private JFrame frame;
    private Peli peli;
    private int sivunPituus;
    private Piirtoalusta piirtoalusta;

    public Kayttoliittyma(Peli peli, int sivunPituus) {
        this.peli = peli;
        this.sivunPituus = sivunPituus;
        this.piirtoalusta = null;
    }

    @Override
    public void run() {
        frame = new JFrame("Laivanupotus");
        int leveys = 20 * sivunPituus + 10;
        int korkeus = 20 * sivunPituus + 10;

        frame.setPreferredSize(new Dimension(leveys, korkeus));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        luoKomponentit(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    public void luoKomponentit(Container container) {
        piirtoalusta = new Piirtoalusta(peli, sivunPituus);
        container.setLayout(new BorderLayout());
        container.add(piirtoalusta, BorderLayout.CENTER);

        JTextField kentta = new JTextField();

        JButton ammu = new JButton("Ammu");
        ToimintoKuuntelija toimija = new ToimintoKuuntelija(kentta, ammu, peli, piirtoalusta);
        ammu.addActionListener(toimija);
        kentta.addActionListener(toimija);

        JPanel valikko = luoValikko();
        valikko.add(kentta);
        valikko.add(ammu);
        container.add(valikko, BorderLayout.SOUTH);

    }

    private JPanel luoValikko() {
        JPanel panel = new JPanel(new GridLayout(1, 2));
        return panel;
    }

    public JFrame getFrame() {
        return frame;
    }

    public Paivitettava getPaivitettava() {
        return piirtoalusta;
    }
}
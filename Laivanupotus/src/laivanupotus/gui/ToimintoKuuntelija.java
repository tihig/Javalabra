package laivanupotus.gui;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextField;
import laivanupotus.Peli;
/*
 * Syötekentän ja napin toimintoja hallinnoiva
 */
public class ToimintoKuuntelija implements ActionListener {

    private JTextField kentta;
    private JButton nappi;
    private Peli peli;
    private Component component;
    

    public ToimintoKuuntelija(JTextField kentta, JButton nappi, Peli peli, Component component) {
     this.kentta = kentta;
     this.nappi = nappi;
     this.peli = peli;
     this.component = component;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(peli.getAmmukset() == 50){
            kentta.setText("GAME OVER");
            kentta.setEnabled(false);
        }
        if(ae.getSource() == nappi){
        String vastaus = kentta.getText();
        
        peli.syotaArvot(vastaus);
        kentta.setText("");
        component.repaint();
        }
    }
}

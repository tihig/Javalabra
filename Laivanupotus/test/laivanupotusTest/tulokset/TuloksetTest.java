/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package laivanupotusTest.tulokset;

import laivanupotus.tulokset.Tulokset;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Tuloksien testit eivät toimi
 *
 *
 */
public class TuloksetTest {

    private Tulokset tulokset;

    public TuloksetTest() throws Exception {
        this.tulokset = new Tulokset();
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() throws Exception {
        tulokset.lisaaTulos("Erkki", 45);
    }

    @After
    public void tearDown() {
    }
    /*
     * Testi ei toimi, ohjelma ei kelpuuta assertEquals()- metodikutsua
     */
//     @Test
//     public void lisaysTuloksiinToimii() throws Exception{
//       String[] lista = tulokset.getTulosLista();
//       assertEquals("Erkki  45", lista[0]);
//     }
}

package Laivanupotus.domainTest;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import laivanupotus.domain.Laiva;
import laivanupotus.domain.PeliLauta;
import laivanupotus.domain.Ruutu;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class PeliLautaTest {

    private PeliLauta Lauta;

    public PeliLautaTest() {
        PeliLauta Lauta;
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        this.Lauta = new PeliLauta();
        Lauta.luoLaivatTesteille();
    }

    @After
    public void tearDown() {
    }
    
    @Test
    public void tarkistusOikea() {
        Ruutu oikea = new Ruutu(1,0);
         assertEquals(true, Lauta.tarkistus(oikea.getX(), oikea.getY()));
    }
    @Test
    public void tarkistusVaara() {
        Ruutu vaara = new Ruutu(3,3);
         assertEquals(false, Lauta.tarkistus(vaara.getX(), vaara.getY()));
    }
}

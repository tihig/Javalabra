package laivanupotusTest.domain;

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
        Ruutu oikea = new Ruutu(1, 0);
        assertEquals(true, Lauta.koordinaattienTarkistus(oikea.getX(), oikea.getY()));
    }

    @Test
    public void tarkistusVaara() {
        Ruutu vaara = new Ruutu(3, 4);
        assertEquals(false, Lauta.koordinaattienTarkistus(vaara.getX(), vaara.getY()));
    }

    @Test
    public void onkoUponnutEi() {
        assertEquals(false, Lauta.ovatkoKaikkiUponneet());
    }

    @Test
    public void onkoUponnutKylla() {
        Lauta.osuukoLaivaan(0, 0);
        Lauta.osuukoLaivaan(1, 0);
        Lauta.osuukoLaivaan(1, 1);
        Lauta.osuukoLaivaan(2, 0);
        Lauta.osuukoLaivaan(2, 1);
        Lauta.osuukoLaivaan(2, 2);
        Lauta.osuukoLaivaan(3, 0);
        Lauta.osuukoLaivaan(3, 1);
        Lauta.osuukoLaivaan(3, 2);
        Lauta.osuukoLaivaan(3, 3);
        assertEquals(true, Lauta.ovatkoKaikkiUponneet());
    }
}

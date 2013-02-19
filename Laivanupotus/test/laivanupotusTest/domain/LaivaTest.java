package laivanupotusTest.domain;

import java.util.ArrayList;
import laivanupotus.domain.Laiva;
import laivanupotus.domain.Ruutu;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class LaivaTest {

    private Laiva laiva;
    private Ruutu ruutu;
    private ArrayList<Ruutu> ruudut;

    public LaivaTest() {
        Laiva laiva;
        Ruutu ruutu;
        ArrayList<Ruutu> ruudut;
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        this.laiva = new Laiva();
        this.ruutu = new Ruutu(2, 2);
        this.ruudut = new ArrayList<Ruutu>();
        ruudut.add(ruutu);
    }

    @After
    public void tearDown() {
    }

    @Test
    public void laivallaOikeaXarvo() {
        laiva.lisaaRuutu(ruutu);
        assertEquals(2, laiva.getRuutu(0).getX());
    }

    @Test
    public void laivallaOikeaYarvo() {
        laiva.lisaaRuutu(ruutu);
        assertEquals(2, laiva.getRuutu(0).getY());
    }

    @Test
    public void laivaOsuma() {
        laiva.lisaaRuutu(ruutu);
        laiva.osuma(ruutu);
        assertEquals(1, laiva.getOsumat());
    }

    public void laivaOhi() {
        Ruutu vaara = new Ruutu(1, 2);
        laiva.osuma(vaara);
        assertEquals(0, laiva.getOsumat());
    }
    public void laivaUppookoEi() {
        Ruutu vaara = new Ruutu(1, 2);
        laiva.osuma(vaara);
        assertEquals(false, laiva.getOsumat());
    }
    public void laivaUppookoKylla() {
        laiva.osuma(ruutu);
        assertEquals(true, laiva.getOsumat());
    }
}

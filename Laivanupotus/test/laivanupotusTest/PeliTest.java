package laivanupotusTest;


import laivanupotus.Peli;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class PeliTest {

    private Peli game;

    public PeliTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        this.game = new Peli();
        game.AmmuksiaTestille();
        game.getLauta().luoLaivatTesteille();
    }

    @After
    public void tearDown() {
    }

    @Test
    public void AmmustenMaaraOikea() {
        assertEquals(48, game.getAmmukset());
    }
    @Test
    public void syotaArvotAmmuksetOikeat() {
        game.syotaArvot("B1");
        assertEquals(49, game.getAmmukset());
    }

    @Test
    public void osumatOikeaX() {
        game.osuuko(1, 0);
        assertEquals(1, game.osumat().get(0).getX());
    }

    @Test
    public void osumatOikeaY() {
        game.osuuko(1, 0);
        assertEquals(0, game.osumat().get(0).getY());
    }

    @Test
    public void osumatOikeaMaara() {
        game.osuuko(1, 0);
        assertEquals(1, game.osumat().size());
    }

    @Test
    public void osumatOikeaOhiMaara() {
        game.osuuko(1, 0);
        assertEquals(0, game.ohi().size());
    }

    @Test
    public void ohiOikeaX() {
        game.osuuko(5, 0);
        assertEquals(5, game.ohi().get(0).getX());
    }

    @Test
    public void ohiOikeaY() {
        game.osuuko(5, 0);
        assertEquals(0, game.ohi().get(0).getY());
    }

    @Test
    public void ohiOikeaMaara() {
        game.osuuko(5, 0);
        assertEquals(1, game.ohi().size());
    }

    @Test
    public void ohiOikeaOsumaMaara() {
        game.osuuko(5, 0);
        assertEquals(0, game.osumat().size());
    }

    @Test
    public void tyhjatOikeaMaara() {
        assertEquals(100, game.getTyhjat().size());
    }

    @Test
    public void tyhjatOikeaMaaraOsuma() {
        game.osuuko(1, 0);
        assertEquals(99, game.getTyhjat().size());
    }

    @Test
    public void tyhjatOikeaMaaraOhi() {
        game.osuuko(5, 0);
        assertEquals(99, game.getTyhjat().size());
    }
}

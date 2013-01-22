
import laivanupotus.Peli;
import laivanupotus.domain.Laiva;
import laivanupotus.domain.Ruutu;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class LaivanupotusTest {

    private Ruutu ruutu;
    private Peli game;
    private Laiva laiva;

    public LaivanupotusTest() {
        Ruutu ruutu;
        Peli game;
        Laiva laiva;
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        ruutu = new Ruutu(2, 2);
        game = new Peli();
        laiva = new Laiva();
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
    public void peliMuuntaminenA() {
        assertEquals(0, game.muutaArvo("A"));
    }

    @Test
    public void peliMuuntaminenB() {
        assertEquals(1, game.muutaArvo("B"));
    }

    @Test
    public void peliMuuntaminenC() {
        assertEquals(2, game.muutaArvo("C"));
    }

    @Test
    public void peliMuuntaminenD() {
        assertEquals(3, game.muutaArvo("D"));
    }

    @Test
    public void peliMuuntaminenE() {
        assertEquals(4, game.muutaArvo("E"));
    }

    @Test
    public void peliMuuntaminenF() {
        assertEquals(5, game.muutaArvo("F"));
    }

    @Test
    public void peliMuuntaminenG() {
        assertEquals(6, game.muutaArvo("G"));
    }

    @Test
    public void peliMuuntaminenH() {
        assertEquals(7, game.muutaArvo("H"));
    }

    @Test
    public void peliMuuntaminenI() {
        assertEquals(8, game.muutaArvo("I"));
    }

    @Test
    public void peliMuuntaminenJ() {
        assertEquals(9, game.muutaArvo("J"));
    }

    @Test
    public void peliMuuntaminenVaara() {
        assertEquals(99, game.muutaArvo("5"));
    }

    @Test
    public void laivaLisaaRuutu() {
        laiva.lisaaRuutu(ruutu);
        assertEquals(ruutu, laiva.getRuutu(0));
    }

    @Test
    public void laivaLisaaRuutuListalla() {
        laiva.lisaaRuutu(ruutu);
//        assertEquals(, laiva.Ruudut());
    }
}

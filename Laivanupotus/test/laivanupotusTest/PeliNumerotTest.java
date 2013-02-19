package laivanupotusTest;


import laivanupotus.Peli;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class PeliNumerotTest {

    private Peli game;

    public PeliNumerotTest() {
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
    }

    @After
    public void tearDown() {
    }

    @Test
    public void peliMuuntaminen0() {
        assertEquals("0", Integer.toString(game.muutaArvoY("A0")));
    }

    @Test
    public void peliMuuntaminen1() {
        assertEquals(1, game.muutaArvoY("A1"));
    }

    @Test
    public void peliMuuntaminen2() {
        assertEquals(2, game.muutaArvoY("A2"));
    }

    @Test
    public void peliMuuntaminen3() {
        assertEquals(3, game.muutaArvoY("A3"));
    }

    @Test
    public void peliMuuntaminen4() {
        assertEquals(4, game.muutaArvoY("A4"));
    }

    @Test
    public void peliMuuntaminen5() {
        assertEquals(5, game.muutaArvoY("A5"));
    }

    @Test
    public void peliMuuntaminen6() {
        assertEquals(6, game.muutaArvoY("A6"));
    }

    @Test
    public void peliMuuntaminen7() {
        assertEquals(7, game.muutaArvoY("A7"));
    }

    @Test
    public void peliMuuntaminen8() {
        assertEquals(8, game.muutaArvoY("A8"));
    }

    @Test
    public void peliMuuntaminen9() {
        assertEquals(9, game.muutaArvoY("A9"));
    }

    @Test
    public void peliMuuntaminenYVaara() {
        assertEquals(99, game.muutaArvoY("AÅ"));
    }
}

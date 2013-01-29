
import laivanupotus.Peli;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class PeliKirjaimetTest {
    private Peli game;
    public PeliKirjaimetTest() {
    }

    @Before
    public void setUp() {
        this.game = new Peli();
    }

    @Test
    public void peliMuuntaminenA() {
        assertEquals(0,game.muutaArvoX("A"));
    }

    @Test
    public void peliMuuntaminenB() {
        assertEquals(1, game.muutaArvoX("B"));
    }

    @Test
    public void peliMuuntaminenC() {
        assertEquals(2, game.muutaArvoX("C"));
    }

    @Test
    public void peliMuuntaminenD() {
        assertEquals(3, game.muutaArvoX("D"));
    }

    @Test
    public void peliMuuntaminenE() {
        assertEquals(4, game.muutaArvoX("E"));
    }
    @Test
    public void peliMuuntaminenF() {
        assertEquals(5, game.muutaArvoX("F"));
    }

    @Test
    public void peliMuuntaminenG() {
        assertEquals(6, game.muutaArvoX("G"));
    }
    @Test
    public void peliMuuntaminenH() {
        assertEquals(7, game.muutaArvoX("H"));
    }

    @Test
    public void peliMuuntaminenI() {
        assertEquals(8, game.muutaArvoX("I"));
    }

    @Test
    public void peliMuuntaminenJ() {
        assertEquals(9, game.muutaArvoX("J"));
    }

    @Test
    public void peliMuuntaminenVaara() {
        assertEquals(99, game.muutaArvoX("5"));
    }
}

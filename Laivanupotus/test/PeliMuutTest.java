
import laivanupotus.Peli;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class PeliMuutTest {
    private Peli game;
    public PeliMuutTest() {
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
   public void osuukoTrue(){
       assertEquals("Osui!", game.osuuko(true));
   }
     @Test
   public void osuukoFalse(){
       assertEquals("Ohi!", game.osuuko(false));
   }
}

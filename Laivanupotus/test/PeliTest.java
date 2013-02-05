
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
    }
    
    @After
    public void tearDown() {
    }

     @Test
     public void AmmustenMaaraOikea() {
     assertEquals(48, game.getAmmukset());
     }    
}

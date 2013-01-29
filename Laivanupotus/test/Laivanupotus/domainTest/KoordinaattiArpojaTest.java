package Laivanupotus.domainTest;


import laivanupotus.domain.KoordinaattiArpoja;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class KoordinaattiArpojaTest {

    private KoordinaattiArpoja arpoja;

    public KoordinaattiArpojaTest() {
        KoordinaattiArpoja arpoja;
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        this.arpoja = new KoordinaattiArpoja();
    }

    @After
    public void tearDown() {
    }

    @Test
    public void alussaSuuntaNolla() {
        assertEquals(0, arpoja.getSuunta());
    }

    @Test
    public void annettavaSuuntaOikea() {
        arpoja.annaSuunta(2);
        assertEquals(2, arpoja.getSuunta());
    }
    @Test
    public void annettavaSuuntaVaara() {
        arpoja.annaSuunta(5);
        assertEquals(0, arpoja.getSuunta());
    }
    
      @Test
    public void annettavaXVahennys() {
        arpoja.annaSuunta(0);
        assertEquals(1, arpoja.palautaX(2));
    }
       @Test
    public void annettavaXLisays() {
        arpoja.annaSuunta(1);
        assertEquals(3, arpoja.palautaX(2));
    } 
        @Test
    public void annettavaYVahennys() {
        arpoja.annaSuunta(2);
        assertEquals(1, arpoja.palautaY(2));
    }
          @Test
    public void annettavaYLisays() {
        arpoja.annaSuunta(3);
        assertEquals(3, arpoja.palautaY(2));
    }    
}

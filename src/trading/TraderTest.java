package trading;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TraderTest {
    private Trader trader;
    private Market market;

    @Before
    public void setUp() {
        // Initialisation des objets pour les tests
        market = new Market("NASDAQ", 1.05);
        trader = new Trader(new String[] { "Apple", "Google" }, 10000.0);
        trader.setMarket(market); // Associe le trader au marché
    }

    @Test
    public void testAdjustedPnL() {
        // Test pour vérifier le PnL ajusté
        double expectedAdjustedPnL = 10000.0 * 1.05; // Calcul attendu
        assertEquals(expectedAdjustedPnL, trader.getAdjustedPnL(), 0.01);
    }

}

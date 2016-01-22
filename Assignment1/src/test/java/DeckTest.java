import model.Card;
import model.Deck;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Chongxian Chen on 1/21/16.
 */
public class DeckTest {
    Deck D = new Deck();
    @Test
    public void checkFirstCard() {
        //Card t = new Card();
        Card t = D.returnTopCard();
        int r = t.returnRank();
        assertEquals(1, r);


    }
}

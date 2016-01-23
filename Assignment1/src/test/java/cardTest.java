import org.junit.Test;
import model.Card;

import static org.junit.Assert.assertEquals;

/**
 * Created by joshmatteson on 1/22/16.
 */
public class cardTest {

    @Test
    public void testCard() {
        Card c = new Card(0, 0);
        assertEquals("spades", c.getSuit());
    }
    @Test
    public void testRank() {
        Card c = new Card(0, 0);
        assertEquals(0, c.getRank());
    }

}

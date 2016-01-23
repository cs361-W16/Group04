import org.junit.Test;
import model.Card;
import model.Deck;

import static org.junit.Assert.assertEquals;

/**
 * Created by joshmatteson on 1/22/16.
 */

public class deckTest {

    @Test
    public void makeDeck() {Deck d = new Deck();}

    @Test
    public void testTop() {
        Deck d = new Deck();
        d.makeDeck();
        Card c;
        c = d.member(0);
        assertEquals(0,c.getRank());
    }

    @Test
    public void testlast() {
        Deck d = new Deck();
        d.makeDeck();
        Card c;
        c = d.member(51);
        assertEquals("diamonds", c.getSuit());
    }

    @Test
    public void testDealCard() {
        Deck d = new Deck();
        d.makeDeck();
        Card c;
        c = d.dealTop();
        assertEquals("spades", c.getSuit());
        c = d.dealTop();
        assertEquals("hearts", c.getSuit());
    }


}

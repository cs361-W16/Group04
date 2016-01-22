package controllers;

import model.Card;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by georgechen on 1/21/16.
 */
public class CardTest {
    private int s;
    private int r;

    @Test
    public void checkCardSuit() {
        Card c = new Card(3,3);
        s = c.returnSuit();
        assertEquals(3,s);
    }
    @Test
    public void checkSetRank() {
        Card c = new Card();
        c.setRank(5);
        r = c.returnRank();
        assertEquals(5, r);
    }
}

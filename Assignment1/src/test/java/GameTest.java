import model.Game;
import model.Card;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by Chongxian Chen on 1/22/16.
 */
public class GameTest {
    @Test //made by Nathan Tollbom
    public void testGame(){
        Game g = new Game();
    }
    @Test //Made by Nathan Tollbom
    public void testDeal(){
        Game g = new Game();
        g.deal();
        Card c = g.getColTop(0);
        assert(c != null);
    }
    @Test //made by Chongxian Chen
    public void testRemove() {
        Game g = new Game();
        Card c = new Card(7, 0);
        Card c2 = new Card(6, 0);
        g.addCard(0, c);
        g.addCard(1, c2);
        int i = g.removeCard(1);
        assertEquals(1, i);
    }
    @Test //made by Chongxian Chen
    public void testRemoveSeveralCards() {
        Game g = new Game();
        Card c = new Card(7, 0);
        Card c2 = new Card(6, 0);
        Card c3 = new Card(6, 1);
        Card c4 = new Card(8, 3);
        g.addCard(0, c);
        g.addCard(3, c2);
        g.addCard(1, c3);
        g.addCard(2, c4);
        int i = g.removeCard(3);
        assertEquals(1, i);
    }

    @Test //made by Chongxian Chen
    public void testRemoveSeveralCardsWithColumnsMoreThanOneCard() {
        Game g = new Game();
        Card c = new Card(7, 0);
        Card c2 = new Card(6, 0);
        Card c3 = new Card(6, 1);
        Card c4 = new Card(8, 3);
        Card c5 = new Card(10, 1);
        g.addCard(0, c);
        g.addCard(3, c2);
        g.addCard(1, c3);
        g.addCard(2, c4);
        g.addCard(3, c5);
        int i = g.removeCard(3);
        assertEquals(1, i);
    }

    @Test //made by Nathan Tollbom
    public void testMove(){
        Game g = new Game();
        Card c = new Card(7, 0);
        Card c2 = new Card(8, 2);
        Card c3 = new Card(12, 0);
        Card c4 = new Card(1, 3);
        g.addCard(0, c);
        g.addCard(1, c2);
        g.addCard(2, c4);
        g.addCard(0, c3);
        int i = g.moveCard(0, 3);
        assertEquals(1, i);
    }
}


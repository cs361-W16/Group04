import model.Game;
import model.Card;
import org.junit.Test;

/**
 * Created by Chongxian Chen on 1/22/16.
 */
public class GameTest {
    @Test
    public void testGame(){
        Game g = new Game();
    }
    @Test
    public void testDeal(){
        Game g = new Game();
        g.deal();
        Card c = g.getColTop(0);
        assert(c != null);
    }
}


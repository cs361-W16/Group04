package model;

/**
 * Created by Chongxian Chen on 1/22/16.
 */
public class Game {
    private Deck d;
    private Column c1;
    private Column c2;
    private Column c3;
    private Column c4;

    public void Game() {
        d = new Deck();
        c1 = new Column(13);
    }
}
package model;

/**
 * Created by Chongxian Chen on 1/22/16.
 */
public class Game {
    private Deck d;
    private Column[] columns;

    public Game() {
        d = new Deck();
        d.shuffleDeck();
        columns = new Column[4];
        columns[0] = new Column(13);
        columns[1] = new Column(13);
        columns[2] = new Column(13);
        columns[3] = new Column(13);
    }

    public void deal(){
        for (int i = 0; i < 4; i++){
            Card c = d.dealTop();
            columns[i].push(c);
        }
    }
    public Card getColTop(int idx){
        return columns[idx].getTop();
    }
}
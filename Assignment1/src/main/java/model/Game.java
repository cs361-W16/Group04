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
    public int removeCard(int i) {
        if (columns[i].returnSize()>0) {
            Card c = columns[i].getTop();
            int r = c.getRank();
            String s = c.getSuit();

            for (int j=0; j<3; j++) {
                if(columns[j].returnSize()>0) {
                    Card c2;
                    c2 = columns[j].getTop();
                    int r2 = c2.getRank();
                    String s2 = c2.getSuit();
                    if (s2.equals(s)) {
                        if (r2 > r) {
                            columns[i].remove();
                            return 1;
                        }
                    }
                }

            }
            return 0;
        }
        return 0;
    }
    //for testing purpose
    public void addCard(int i, Card c) {
        columns[i].push(c);
    }
}
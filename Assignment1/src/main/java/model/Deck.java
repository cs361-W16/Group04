package model;

/**
 * Created by joshmatteson on 1/22/16.
 */
public class Deck {
    Card[] cards;
    int top;

    public Deck() {
        cards = new Card[52];
        top = 0;

        for(int i=0; i<13; i++) {
            for(int j=0; j<4; j++) {
                cards[i*4+j] = new Card(i,j);
            }
        }
    }


    public Card member(int idx) {return cards[idx];}

    public Card dealTop() {
        if(top <52) {
            Card c = cards[top];
            top += 1;
            return c;
        }
        return null;
    }
}

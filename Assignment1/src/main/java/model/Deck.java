package model;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by joshmatteson on 1/22/16.
 */
public class Deck {
    private Card[] cards;
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
            System.out.println(c.getSuit());
            return c;
        }
        return null;
    }

    static void shuffleArray(Card[] ar)
    {
        Random rnd = ThreadLocalRandom.current();
        for (int i = ar.length - 1; i > 0; i--)
        {
            int index = rnd.nextInt(i + 1);
            // Simple swap
            Card a = ar[index];
            ar[index] = ar[i];
            ar[i] = a;
        }
    }
    public void shuffleDeck() {
        shuffleArray(cards);
    }
}

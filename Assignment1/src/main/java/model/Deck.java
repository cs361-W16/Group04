package model;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by Chongxian Chen on 1/21/16.
 */
public class Deck {
    private Card[] cardArray;
    private int size;
    private int topPosition;
    private Card c = new Card();
    public Deck() {
        cardArray = new Card[52];
        for (int i=1; i<14; i++) {
            for (int j = 1; j<5; j++) {
               cardArray[i*4-6+1+j] = new Card(i, j);
            }
        }
        shuffleArray(cardArray);
        size = 52;
        topPosition = 0;
    }
    public static void main(String[] args){

    }

    public Card returnTopCard(){
        topPosition++;
        size--;
        return cardArray[topPosition-1];

    }
    static void shuffleArray(Card[] ar)
    {
        // If running on Java 6 or older, use `new Random()` on RHS here
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
    //shuffle reference:http://stackoverflow.com/questions/1519736/random-shuffling-of-an-array

}

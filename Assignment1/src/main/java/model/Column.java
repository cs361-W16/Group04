package model;

/**
 * Created by Chongxian Chen on 1/22/16.
 */

public class Column {
    private int position;
    private int size;
    private Card[] c;

    public Column() {

    }
    public Column(int i) {
        c = new Card[i];
        position = 0;
        size = 0;
    }
    public void push(Card card) {
        c[position] = card;
        position++;
        size++;
    }
    public void remove(){
        if (size>0) {
            position--;
            size--;
        }
        else
            System.out.println("This column does not have enough cards to remove!");
    }
    public Card getTop(){
        return c[position-1];
    }
}

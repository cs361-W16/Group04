package model;

/**
 * Created by joshmatteson on 1/22/16.
 */
public class Card {

    int rank;
    String suit;

    public Card(int r, int s) {

        rank = r;
        if (s == 0) {
            suit = "spades";
        } else if (s == 1) {
            suit = "hearts";
        } else if (s == 2) {
            suit = "clubs";
        } else {
            suit = "diamonds";
        }
    }
    public int getRank() {return rank;}
    public String getSuit() {return suit;}
    public void setRank(int r) {
        rank = r;
    }
    public void setSuit(String s) {
        suit = s;
    }
}

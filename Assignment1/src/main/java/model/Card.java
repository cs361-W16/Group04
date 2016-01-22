package model;

/**
 * Created by Chongxian Chen on 1/21/16.
 */
public class Card {
    private int rank;
    private int suit;
    public Card(int r, int s) {
        rank = r;
        suit = s;
    }
    public Card() {
        suit = 0;
        rank = 0;
    }
    public static void main(String[] args){

    }
    public void setRank(int r){
        rank =r;
    }
    public void setSuit(int s){
        suit = s;
    }
    public int returnRank() {
        return rank;
    }
    public int returnSuit() {
        return suit;
    }
}
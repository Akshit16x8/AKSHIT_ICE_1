package ca.sheridancollege.akshit.ice1;

/**
 * Modifier: Akshit  
 * Student ID: 991764651
 * Date: June 3, 2025
 * 
 * A class that models playing card Objects.
 */
public class Card {

    private String suit;
    private int value;

    public static final String[] SUITS = {"Hearts", "Diamonds", "Spades", "Clubs"};

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value + " of " + suit;
    }
}

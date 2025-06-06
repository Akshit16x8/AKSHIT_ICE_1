package ca.sheridancollege.akshit.ice1;

import ca.sheridancollege.akshit.ice1.Card;
import java.util.Random;

/**
 * Modifier: Akshit  
 * Student ID: 991764651
 * Date: June 3, 2025
 * 
 * This class generates a hand of 7 random cards as part of ICE 1 Step 4.
 */
public class CardTrick {
    public static void main(String[] args) {
        Card[] magicHand = new Card[7];
        Random rand = new Random();

        // Step 4: Fill magicHand with random cards
        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            c.setValue(rand.nextInt(13) + 1); // values from 1 to 13
            c.setSuit(Card.SUITS[rand.nextInt(4)]); // random suit
            magicHand[i] = c;
        }

        // Print the generated magic hand (optional, for verification)
        System.out.println("Magic Hand (Step 4):");
        for (Card c : magicHand) {
            System.out.println(c.getValue() + " of " + c.getSuit());
        }
    }
}

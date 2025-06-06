package ca.sheridancollege.akshit.ice1;

import java.util.Random;

/**
 * Modifier: Akshit  
 * Student ID: 991764651
 * Date: June 3, 2025
 */
public class CardTrick {

    public static void main(String[] args) {
        Card[] magicHand = new Card[7];
        Random rand = new Random();

        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            c.setValue(rand.nextInt(13) + 1);
            c.setSuit(Card.SUITS[rand.nextInt(4)]);
            magicHand[i] = c;
        }

        Card luckyCard = new Card();
        luckyCard.setValue(7);
        luckyCard.setSuit("Hearts");

        boolean found = false;
        for (Card c : magicHand) {
            if (c.getValue() == luckyCard.getValue() &&
                c.getSuit().equalsIgnoreCase(luckyCard.getSuit())) {
                found = true;
                break;
            }
        }

        System.out.println("Lucky Card: " + luckyCard);
        if (found) {
            System.out.println("🎉 You win!");
        } else {
            System.out.println("❌ Try again.");
        }

        System.out.println("\nMagic Hand:");
        for (Card c : magicHand) {
            System.out.println(c);
        }
    }
}

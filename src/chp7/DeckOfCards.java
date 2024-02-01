package chp7;

import java.security.SecureRandom;
import java.util.Arrays;

public class DeckOfCards {
   private static SecureRandom randomNumber = new SecureRandom();
   private static int NUMBER_OF_CARD = 52;
   private Card[] deck = new Card[NUMBER_OF_CARD];
   private int currentCard = 0;

   public DeckOfCards (){
       String[] faces = {"Ace", "Deuce", "Three", "Four", "Five", "Six",
               "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
       String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};

       for (int count = 0; count < deck.length; count++) {
           System.out.println(Arrays.toString(deck));
           deck[count] =
                   new Card(faces[count % 13],suits[count / 13]);
       }
   }

   public void shuffle(){
       currentCard = 0;

       for (int num = 0; num < deck.length; num++) {
            int second = randomNumber.nextInt(NUMBER_OF_CARD);

            Card temp = deck[num];
            deck[num] = deck[second];
            deck[second] = temp;
       }
   }

   public Card dealCard(){
       if (currentCard < deck.length) {
           return deck[currentCard++];
       }
       else {
           return null;
       }
   }
}

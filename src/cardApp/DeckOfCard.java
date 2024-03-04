package cardApp;


import java.security.SecureRandom;

public class DeckOfCard {
    private static final SecureRandom randomNumbers = new SecureRandom();
    private static final int NUMBER_OF_CARD = 52;
    private Cards[] deck = new Cards[NUMBER_OF_CARD];
    private int currentCard = 0;

    public DeckOfCard(){
        String[] faces = {"Ace", "Deuce", "Three", "Four", "Five", "Six",
                "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        int counter = 0;
        for (String face : faces) {
            for (String suit : suits) {
                Cards card = new Cards(face, suit);
                deck[counter] = card;
                counter++;
            }
        }
    }

    public void shuffle(){
        currentCard = 0;
        int numberOfTimesToShuffleCard = randomNumbers.nextInt(5, 10);
         for(int numberOfShuffle = 0; numberOfShuffle < numberOfTimesToShuffleCard;numberOfShuffle++) {
            int numberOfCardsToShuffle = randomNumbers.nextInt(1, 6);
            Cards[] temporaryCards = new Cards[numberOfCardsToShuffle];
             for (int pickingCards = 0; pickingCards < temporaryCards.length; pickingCards++) {
                 temporaryCards[pickingCards] = deck[pickingCards];
             }
         }

    }

    public Cards dealCard() {
        if (currentCard < deck.length) {
           return deck[currentCard++];
        }
        else {
           return null;
        }
    }

}

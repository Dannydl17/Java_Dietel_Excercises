package cardApp;


import java.security.SecureRandom;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public class DeckOfCard {
    private static final SecureRandom randomNumbers = new SecureRandom();
    private static final int NUMBER_OF_CARD = 52;

    private final Card[] deck = new Card[NUMBER_OF_CARD];
    private int currentCard = 0;

    public DeckOfCard(){
        String[] faces = {"Ace", "Deuce", "Three", "Four", "Five", "Six",
                "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        int counter = 0;
        for (String face : faces) {
            for (String suit : suits) {
                Card card = new Card(face, suit);
                deck[counter] = card;
                counter++;
            }
        }
    }

    public void shuffle(){
        int numberOfTimesToShuffleCard = randomNumbers.nextInt(5, 10);
        for(int numberOfShuffle = 0; numberOfShuffle < numberOfTimesToShuffleCard;numberOfShuffle++) {
            int numberOfCardsToShuffle = randomNumbers.nextInt(1, 6);
            Card[] temporaryCards = new Card[numberOfCardsToShuffle];
            System.arraycopy(deck, 0, temporaryCards, 0, temporaryCards.length);
            for (int index = numberOfCardsToShuffle; index < deck.length; index++) {
                deck[index - numberOfCardsToShuffle] = deck[index];
            }
            System.arraycopy(temporaryCards, 0, deck, (deck.length - numberOfCardsToShuffle), temporaryCards.length);
        }
    }

    public void dealCardToPlayers(Player[] players, int numberOfCardsToDealToEachPlayer) {
        AtomicInteger integerReference = new AtomicInteger(52);
        Arrays.stream(players).forEach(player -> {
            Card[] cardsAtHand = new Card[numberOfCardsToDealToEachPlayer];
            Arrays.stream(deck).forEach(card -> {
                for (int index = 0; index < cardsAtHand.length; index++) {
                    cardsAtHand[index] = deck[integerReference.decrementAndGet()];
                }
            });
            player.setCardsAtHand(cardsAtHand);
        });
    }

    public Card[] getCard() {
        return deck;
    }

    public boolean isPair(Card[] cards) {
        for (int count = 0; count < cards.length; count++) {
            System.out.println(cards[count]);
            for (int innerCount = count + 1; innerCount < cards.length; innerCount++) {
                if (cards[innerCount].getFace().equals(cards[count].getFace())) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isTwoPair(Card[] cards) {
        int counter1 = 0;
        for (int count = 0; count < cards.length; count++) {
            for (int innerCount = count+1; innerCount < cards.length; innerCount++) {
                if (cards[count].getFace().equals(cards[innerCount].getFace())) {
                       counter1++;
                }
            }
        }
        if (counter1 == 2) {
            return true;
        }
        return false;
    }

    public boolean isThreePair(Card[] cards) {
        int counter = 0;
        for (int count = 0; count < cards.length; count++) {
            for (int innerCount = count+1; innerCount < cards.length; innerCount++) {
                if (cards[count].getFace().equals(cards[innerCount].getFace())) {
                    counter++;
                }
            }
        }
        if (counter == 3) {
            return true;
        }
        return false;
    }

    public boolean isFourPair(Card[] cards) {
        int counter = 0;
        for (int count = 0; count < cards.length; count++) {
            for (int innerCount = count+1; innerCount < cards.length; innerCount++) {
                if (cards[count].getFace().equals(cards[innerCount].getFace())) {
                    counter++;
                }
            }
            if (counter == 3) {
                return true;
            }
        }
        return false;
    }
}

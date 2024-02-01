package cardApp;

import chp7.Card;

import java.util.Arrays;

public class DeckOfCard {
    private static int numberOfCard;
   private Cards[] deck = new Cards[numberOfCard];

    public DeckOfCard(){

    }

    public void numberOfCards(int cardNumber) {
        numberOfCard = cardNumber;
    }

    public int getNumber() {
        return numberOfCard;
    }
}

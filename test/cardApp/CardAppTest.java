package cardApp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CardAppTest {

    @Test
    public void testThatAHandCanCollectFiveCardTest(){
        DeckOfCard deck = new DeckOfCard();
        deck.shuffle();

    }
    @Test
    public void testThatAHandCanHaveAPairOfCardTest(){
        DeckOfCard deck = new DeckOfCard();
        deck.shuffle();
        deck.dealCard();
    }

}
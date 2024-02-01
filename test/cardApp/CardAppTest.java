package cardApp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CardAppTest {
    private DeckOfCard cardGame;

    @BeforeEach
    public void setUp(){
        cardGame = new DeckOfCard();
    }

    @Test
    public void test_That_Poker_Game_Can_Be_Created_Test(){

    }
    @Test
    public void test_That_CardApp_Can_Has_A_Number_Of_Card_Test(){
        cardGame.numberOfCards(52);
        assertEquals(52, cardGame.getNumber());
    }

    @Test
    public void test_That_CardApp_Has_An_Array_That_Collect_The_CardNumber_Test(){

    }

}

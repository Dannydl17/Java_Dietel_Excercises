package cardApp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CardAppTest {
       @Test
       public void testThatDeckOfCardCanHaveANumberOfCardTest(){
              DeckOfCard deckOfCard = new DeckOfCard();
              Card [] cards = deckOfCard.getCard();
              assertEquals(52, cards.length);
       }

       @Test
       public void testThatDeckOfCardCanHaveAPairOfCardTest(){
              Card[] cards = new Card[5];
              cards[0] = new Card("Six", "Diamond");
              cards[1] = new Card("Seven", "Club");
              cards[2] = new Card("Eight", "Heart");
              cards[3] = new Card("Nine", "Spade");
              cards[4] = new Card("Six", "Diamond");
//              cards[4] = new Card("Ace", "Spade");
              DeckOfCard deckOfCard = new DeckOfCard();
//              assertFalse(deckOfCard.isPair(cards));
              assertTrue(deckOfCard.isPair(cards));
       }
       @Test
       public void testThatDeckOfCardCanHaveTwoPairOfCardTest(){
              Card[] cards = new Card[5];
              cards[0] = new Card("Six", "Diamond");
              cards[1] = new Card("Seven", "Club");
              cards[2] = new Card("Seven", "Heart");
              cards[3] = new Card("Nine", "Spade");
              cards[4] = new Card("Six", "Diamond");
//              cards[4] = new Card("Ace", "Spade");
              DeckOfCard deckOfCard = new DeckOfCard();
//              assertFalse(deckOfCard.isPair(cards));
              assertTrue(deckOfCard.isTwoPair(cards));
       }
       @Test
       public void testThatDeckOfCardCanHaveThreePairOfAKindCardTest(){
              Card[] cards = new Card[5];
              cards[0] = new Card("Six", "Diamond");
              cards[1] = new Card("Seven", "Club");
              cards[2] = new Card("Seven", "Heart");
              cards[3] = new Card("Seven", "spade");
              cards[4] = new Card("Nine", "Spade");
//            cards[4] = new Card("Ace", "Spade");
              DeckOfCard deckOfCard = new DeckOfCard();
//              assertFalse(deckOfCard.isPair(cards));
              assertTrue(deckOfCard.isThreePair(cards));
       }
       @Test
       public void testThatDeckOfCardCanHaveFourPairOfAKindCardTest(){
              Card[] cards = new Card[5];
              cards[0] = new Card("Seven", "Diamond");
              cards[1] = new Card("Seven", "Club");
              cards[2] = new Card("Seven", "Heart");
              cards[3] = new Card("Seven", "spade");
              cards[4] = new Card("Nine", "Spade");
//            cards[4] = new Card("Ace", "Spade");
              DeckOfCard deckOfCard = new DeckOfCard();
//              assertFalse(deckOfCard.isPair(cards));
              assertTrue(deckOfCard.isFourPair(cards));

       }

       @Test
       public void testThatDeckOfCardCanHaveAFlushOfAKindCardTest(){
              Card[] cards = new Card[5];
              cards[0] = new Card("Seven", "Diamond");
              cards[1] = new Card("Six", "Diamond");
              cards[2] = new Card("Jack", "Diamond");
              cards[3] = new Card("Four", "Diamond");
              cards[4] = new Card("Nine", "Diamond");
//            cards[4] = new Card("Ace", "Spade");
              DeckOfCard deckOfCard = new DeckOfCard();
//              assertFalse(deckOfCard.isPair(cards));
              assertTrue(deckOfCard.isFlush(cards));
       }

       @Test
       public void testThatDeckOfCardCanHaveAStraightCardTest(){
              Card[] cards = new Card[5];
              cards[0] = new Card("Seven", "Diamond");
              cards[1] = new Card("Six", "Club");
              cards[2] = new Card("Jack", "Spade");
              cards[3] = new Card("Four", "Heart");
              cards[4] = new Card("Nine", "Diamond");
//            cards[4] = new Card("Ace", "Spade");
              DeckOfCard deckOfCard = new DeckOfCard();
//              assertFalse(deckOfCard.isPair(cards));
              assertTrue(deckOfCard.isStraight(cards));
       }

       @Test
       public void testThatDeckOfCardCanHaveAFullHouseCardTest(){
              Card[] cards = new Card[5];
              cards[0] = new Card("Six", "Diamond");
              cards[1] = new Card("Six", "Spade");
              cards[2] = new Card("Six", "Heart");
              cards[3] = new Card("Four", "Heart");
              cards[4] = new Card("Four", "Club");
//            cards[4] = new Card("Ace", "Spade");
              DeckOfCard deckOfCard = new DeckOfCard();
//              assertFalse(deckOfCard.isPair(cards));
              assertTrue(deckOfCard.isFullHouse(cards));
       }



}
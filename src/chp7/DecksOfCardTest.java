package chp7;

public class DecksOfCardTest {
    public static void main(String[] args) {
        DeckOfCards myDeckOfCards = new DeckOfCards();
        myDeckOfCards.shuffle();

        for (int num = 1; num < 52; num++) {
            System.out.printf("%-19s", myDeckOfCards.dealCard());

            if (num % 4 == 0) {
                System.out.println();
            }
        }
    }
}

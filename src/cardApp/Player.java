package cardApp;

public class Player {
    private String name;
    private Card[] cardsAtHand;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Card[] getCardsAtHand() {
        return cardsAtHand;
    }

    public void setCardsAtHand(Card[] cardsAtHand) {
        this.cardsAtHand = cardsAtHand;
    }
}

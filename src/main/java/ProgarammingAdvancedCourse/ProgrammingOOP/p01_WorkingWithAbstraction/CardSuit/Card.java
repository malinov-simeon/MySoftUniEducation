package p01_WorkingWithAbstraction.CardSuit;

public class Card {
    private CardRank cardRank;
    private CardSuit cardSuit;

    public Card(CardRank cardRank, CardSuit cardSuit) {
        this.cardRank = cardRank;
        this.cardSuit = cardSuit;
    }
//
//    public int getCardPower() {
//        return this.cardRank. * this.cardSuit;
//    }

    public CardRank getCardRank() {
        return cardRank;
    }

    public CardSuit getCardSuit() {
        return cardSuit;
    }

    public int getCardPower() {
        return this.cardRank.getPower() + this.cardSuit.getPower();
    }
}

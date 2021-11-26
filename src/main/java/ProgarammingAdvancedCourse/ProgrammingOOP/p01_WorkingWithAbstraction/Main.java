import p01_WorkingWithAbstraction.CardSuit.Card;
import p01_WorkingWithAbstraction.CardSuit.CardRank;
import p01_WorkingWithAbstraction.CardSuit.CardSuit;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String cardRank = scanner.nextLine();
        String cardSuit = scanner.nextLine();

        Card card = new Card(CardRank.valueOf(cardRank), CardSuit.valueOf(cardSuit));

        int power = card.getCardPower();
        String name = card.getCardRank().name();
        String name1 = card.getCardSuit().name();
        System.out.printf("WorkingWithAbstraction.CardSuit.Card name: %s of %s; WorkingWithAbstraction.CardSuit.Card power: %d", name, name1, power);
    }
}

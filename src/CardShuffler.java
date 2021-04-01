import java.util.*;

public class CardShuffler {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        cardDeck deckCards = new cardDeck();

        //System.out.print(cardDeck.deckOfCards);

        cardDeck.shuffleArray((ArrayList<String>) cardDeck.deckOfCards);
        for (Object i : cardDeck.deckOfCards) {
            //System.out.println(i);
        }

        cardDeck.toString((ArrayList<String>) cardDeck.deckOfCards);

    }
}
import java.util.*;

public class cardDeck {

    static List deckOfCards;

    public cardDeck() {

        List<String> deckOfCards = new ArrayList<>();
        deckOfCards.add("JC");
        deckOfCards.add("QC");
        deckOfCards.add("KC");
        deckOfCards.add("AC");
        deckOfCards.add("JD");
        deckOfCards.add("QD");
        deckOfCards.add("KD");
        deckOfCards.add("AD");
        deckOfCards.add("JH");
        deckOfCards.add("QH");
        deckOfCards.add("KH");
        deckOfCards.add("AH");
        deckOfCards.add("JS");
        deckOfCards.add("QS");
        deckOfCards.add("KS");
        deckOfCards.add("AS");

        //String cardDeck = deckOfCards.toString();

        //System.out.println("Before shuffling " + "\n" + deckOfCards);

        cardDeck.deckOfCards = (ArrayList) deckOfCards;

    }


    public ArrayList<String> getDeckOfCards() {
        return (ArrayList<String>) deckOfCards;
    }

    //Now shuffle the card

    public static void shuffleArray(ArrayList<String> a) {
        int numCards = a.size();
        //int numCards = 16;
        Random random = new Random();
        random.nextInt();
        for (int i = 0; i < numCards; i++) {
            int index = random.nextInt(i + 1);
            Collections.swap(a, i, index);
        }
    }

    public static void swap(List<Integer> deckOfCards, int i, int change) {
        int helper = deckOfCards.get(i);
        deckOfCards.set(i, deckOfCards.get(change));
        deckOfCards.set(change, helper);
    }

    public static void toString(ArrayList<String> deckOfCards) {
        Object[] array = deckOfCards.toArray();
        int row, col, i, j;
        row = 4;
        col = 4;
        int arr[][] = new int[4][4];
        for(i=0; i<row; i++)
        {
            for(j=0; j<col; j++)
            {
       //YOU ARE HERE!!!!!!!!!!         System.out.print(arr[i][j] + Arrays.toString() + "  ");
            }
            System.out.println();
        }
            //System.out.println(Arrays.toString(array) + " ");
    }

}
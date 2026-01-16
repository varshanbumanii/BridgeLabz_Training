package coreprogramming.javastring.level3;
import java.util.Scanner;
public class DeckofCards {
    static String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
    static String[] ranks = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};

    public static String[] initDeck() {
        String[] deck = new String[suits.length * ranks.length];
        int idx = 0;

        for (String s : suits)
            for (String r : ranks)
                deck[idx++] = r + " of " + s;

        return deck;
    }

    public static void shuffle(String[] deck) {
        for (int i = 0; i < deck.length; i++) {
            int r = i + (int)(Math.random() * (deck.length - i));
            String temp = deck[i];
            deck[i] = deck[r];
            deck[r] = temp;
        }
    }

    public static String[][] distribute(String[] deck, int players, int cards) {
        if (players * cards > deck.length)
            return null;

        String[][] result = new String[players][cards];
        int idx = 0;

        for (int i = 0; i < players; i++)
            for (int j = 0; j < cards; j++)
                result[i][j] = deck[idx++];

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int players = sc.nextInt();
        int cards = sc.nextInt();

        String[] deck = initDeck();
        shuffle(deck);

        String[][] res = distribute(deck, players, cards);
        for (int i = 0; i < players; i++) {
            System.out.println("Player " + (i+1));
            for (String c : res[i])
                System.out.println(c);
        }
    }
}

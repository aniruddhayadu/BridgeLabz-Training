import java.util.Scanner;

public class DeckOfCards {

	// Initialize deck of cards
	public static String[] initializeDeck() {
		String[] suits = { "Hearts", "Diamonds", "Clubs", "Spades" };
		String[] ranks = { "2", "3", "4", "5", "6", "7", "8", "9", "10",
				"Jack", "Queen", "King", "Ace" };

		int numOfCards = suits.length * ranks.length;
		String[] deck = new String[numOfCards];
		int index = 0;

		for (int i = 0; i < suits.length; i++) {
			for (int j = 0; j < ranks.length; j++) {
				deck[index] = ranks[j] + " of " + suits[i];
				index++;
			}
		}
		return deck;
	}

	// Shuffle deck
	public static String[] shuffleDeck(String[] deck) {
		int n = deck.length;
		for (int i = 0; i < n; i++) {
			int randomCardNumber = i + (int) (Math.random() * (n - i));
			// Swap cards
			String temp = deck[i];
			deck[i] = deck[randomCardNumber];
			deck[randomCardNumber] = temp;
		}
		return deck;
	}

	// Distribute deck to players
	public static String[][] distributeCards(String[] deck, int n, int x) {
		if (n > deck.length) {
			System.out.println("Cannot distribute more cards than deck size.");
			return null;
		}
		if (n % x != 0) {
			System.out.println("Cannot evenly distribute cards to players.");
			return null;
		}

		int cardsPerPlayer = n / x;
		String[][] players = new String[x][cardsPerPlayer];

		for (int i = 0; i < x; i++) {
			for (int j = 0; j < cardsPerPlayer; j++) {
				players[i][j] = deck[i * cardsPerPlayer + j];
			}
		}

		return players;
	}

	// Print players and their cards
	public static void printPlayersCards(String[][] players) {
		if (players == null) {
			return;
		}

		for (int i = 0; i < players.length; i++) {
			System.out.println("Player " + (i + 1) + " cards:");
			for (int j = 0; j < players[i].length; j++) {
				System.out.println("\t" + players[i][j]);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String[] deck = initializeDeck();
		deck = shuffleDeck(deck);

		System.out.print("Enter number of cards to distribute: ");
		int n = sc.nextInt();

		System.out.print("Enter number of players: ");
		int x = sc.nextInt();

		String[][] players = distributeCards(deck, n, x);
		printPlayersCards(players);

		sc.close();
	}
}

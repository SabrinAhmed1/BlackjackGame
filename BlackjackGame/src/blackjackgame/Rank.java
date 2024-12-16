
package blackjackgame;

/**
 * An enumeration representing the ranks that a card can have
 * @author Sabrin Ahmed
 */
public enum Rank {
	TWO("2"),
	THREE("3"),
	FOUR("4"), 
	FIVE("5"),
	SIX("6"),
	SEVEN("7"),
	EIGHT("8"),
	NINE("9"),
	TEN("10"),
	JACK("J"),
	QUEEN("Q"),
	KING("K"),
	ACE("A");
	/** Stores the symbol for the rank */
	private String symbol;

	/**
	 * Construct a rank with a given symbol
	 * @param symbol the symbol of that rank
	 */
	private Rank(String symbol) {
		this.symbol = symbol;
	}
	/**
	 * Returns the symbol for this rank as a String
	 * @return the symbol for this rank
	 */
        @Override
	public String toString() {
		return this.symbol;
	}
}
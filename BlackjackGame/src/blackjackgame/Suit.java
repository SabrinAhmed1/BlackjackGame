package blackjackgame;

/**
 * An enumeration representing the different suits in a card deck.
 * @author sabri
 */
public enum Suit {
    /** Represents Clubs Suit*/
    CLUBS('C'),
    /** Represents Diamonds Suit*/
    DIAMONDS('D'),
    /** Represents Hearts Suit */
    HEARTS('H'),
    /** Represents Spades Suit */
    SPADES('S');
    /** A symbolic character to represent the Suit */
    private char symbol;
    
    /** 
     * Creates a Suit with a given Symbol 
     * @param symbol the symbol for that Suit
     */
    private Suit(char symbol) {
        this.symbol = symbol;
    }
    
    /** 
     * Returns a String representing of this Suit. 
     * @return a String with this Suit's symbol
     */
    @Override
    public String toString() {
        return Character.toString(this.symbol);
    }
}

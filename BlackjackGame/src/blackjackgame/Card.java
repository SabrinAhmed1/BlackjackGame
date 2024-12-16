/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blackjackgame;

/**
 * A class to represent a standard playing card
 * @author Sabrin Ahmed
 */
public class Card {
    /* Data Feilds */
    private Suit suit;
    private Rank rank;
    
    /* Constructors */
    /**
     * Creates a new Card with a given suit and rank
     * @param rank the rank of the card
     * @param suit the suit of the card
     * @throws NullPointerException if suit and/or rank are null
     */
    public Card(Rank rank, Suit suit) {
        // Checks that rank and suit are both not null
        if(suit == null || rank == null) {
            throw new NullPointerException("Suit and/or Rank cannot be null");
        }
        this.suit = suit;
        this.rank = rank;
    }
    /* Getters */
    /**
     * Return the suit of this card.
     * @return the suit of this card.
     */
    public Suit getSuit() {
        return suit;
    }
    /**
     * Returns the rank of this card.
     * @return the rank of this card.
     */
    public Rank getRank() {
        return rank;
    }
    
    /* Other Methods */
    /**
     * Returns a string representation of this card with the symbols for rank 
     * and suit.
     * @return a string representation of this card
     */
    @Override
    public String toString() {
        return rank.toString() + suit.toString();
    }
    
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blackjackgame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * A class to represent a deck of 52 playing cards
 *
 * @author Sabrin Ahmed
 */
public class Deck {

    /**
     * Stores all the cards in the deck
     */
    private List<Card> cards;

    /**
     * Constructs a Deck with the 52 cards a standard playing deck would have.
     */
    public Deck() {
        cards = new ArrayList<Card>();
        // Creates and adds all the cards to the deck
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                cards.add(new Card(rank, suit));
            }
        }
    }

    /**
     * Returns the size of the deck
     *
     * @return the number of cards in the deck
     */
    public int size() {
        return cards.size();
    }

    /**
     * Returns a string representation of all the cards in the deck
     *
     * @return a string representation of the deck
     */
    @Override
    public String toString() {
        return cards.toString();
    }

    /**
     * Removes and returns the first card in the deck
     *
     * @return the first card in the deck
     */
    public Card draw() {
        if (cards.isEmpty()) {
            return null;
        }
        return cards.remove(0);
    }

    /**
     * Removes the specified number of cards from the front of the deck. If the
     * specified number is greater than the size of the deck, all cards are
     * removed.
     *
     * @param count the number of cards to be removed.
     * @return a list containing all the cards that were removed.
     */
    public List<Card> draw(int count) {
        // Return an empty list if count is 0
        if (count <= 0) {
            return new ArrayList<Card>();
        }
        List<Card> removed = new ArrayList<Card>();
        /* Removes all the cards in the deck and return them if 
           count greater than the size of the deck */
        if (count > this.size()) {
            while (this.size() > 0) {
                removed.add(this.draw());
            }
        } else {
            for (int i = 0; i < count; i++) {
                removed.add(this.draw());
            }
        }
        return removed;
    }

    /**
     * Shuffles the deck so the cards are in random order.
     */
    public void shuffle() {
        Collections.shuffle(cards);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blackjackgame;

import java.util.ArrayList;
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
}

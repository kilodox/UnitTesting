package com.epam.belote;

import com.epam.belote.cards.CardSuit;

public enum Bid {
    PASS(null, 0),
    CLUBS_TRUMP(CardSuit.CLUBS, 1),
    DIAMONDS_TRUMP(CardSuit.DIAMONDS, 2),
    HEARTS_TRUMP(CardSuit.HEARTS, 3),
    SPADES_TRUMP(CardSuit.SPADES, 4),
    NO_TRUMPS(null, 5),
    ALL_TRUMPS(null, 6);

    private CardSuit suit;
    private int priority;

    Bid(CardSuit suit, int priority) {
        this.suit = suit;
        this.priority = priority;
    }

    public int getPriority() {
        return priority;
    }

    public CardSuit getSuit() {
        return suit;
    }
}

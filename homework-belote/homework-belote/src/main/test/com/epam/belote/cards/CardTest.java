package com.epam.belote.cards;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CardTest {
    @Test
    void checkIfCardsAreCreated() {
        Card card = new Card(CardType.ACE, CardSuit.CLUBS);

        assertEquals(CardType.ACE, card.getType());
        assertEquals(CardSuit.CLUBS, card.getSuit());
    }

    @Test
    void testEqualsWithSameObjects(){
        Card card1 = new Card(CardType.ACE, CardSuit.CLUBS);
        Card card2 = new Card(CardType.ACE, CardSuit.CLUBS);

        assertTrue(card1.equals(card2));
    }

    @Test
    void testEqualsWithDifferentObjects(){
        Card card1 = new Card(CardType.ACE, CardSuit.DIAMONDS);
        Card card2 = new Card(CardType.KING, CardSuit.DIAMONDS);

        assertFalse(card1.equals(card2));
    }

    @Test
    void testHeshCodeWithSameObjects(){
        Card card1 = new Card(CardType.KING, CardSuit.HEARTS);
        Card card2 = new Card(CardType.KING, CardSuit.HEARTS);

        assertEquals(card1.hashCode(), card2.hashCode());
    }
}

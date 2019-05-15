package com.epam.belote;

import com.epam.belote.cards.DeckOfCards;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlayerTest {
    @Test
    void testPlayerName(){
        Player player = new Player("Pesho");

        assertEquals("Pesho", player.getName());
    }

    @Test
    void testBid(){
        Player player = new Player("Pesho");
        player.bid(Bid.ALL_TRUMPS);

        assertEquals(Bid.ALL_TRUMPS, player.getBid());
    }

    @Test
    void testAddCards(){
        DeckOfCards deckOfCards = new DeckOfCards();
        Player player = new Player("Pesho");

        assertEquals(0, player.sizeOfHand());

        player.addCards(deckOfCards.getNext5Cards());

        assertEquals(5, player.sizeOfHand());
    }
}

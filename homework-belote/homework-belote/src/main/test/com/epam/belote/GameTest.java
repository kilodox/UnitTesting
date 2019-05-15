package com.epam.belote;

import com.epam.belote.cards.DeckOfCards;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class GameTest {
    private Player player1;
    private Player player2;
    private Player player3;
    private Player player4;
    private DeckOfCards deckOfCards;
    private Game game;

    @BeforeEach
    void setup() {
        deckOfCards = new DeckOfCards();

        player1 = new Player("Player 1.1");
        player2 = new Player("Player 1.2");
        player3 = new Player("Player 2.1");
        player4 = new Player("Player 2.2");

        game = new Game(player1, player2, player3, player4, deckOfCards);
    }

    @Test
    void testGiveCards() {
        game.giveCards();

        assertEquals(5, player1.sizeOfHand());
        assertEquals(5, player2.sizeOfHand());
        assertEquals(5, player3.sizeOfHand());
        assertEquals(5, player4.sizeOfHand());
        assertEquals(12, deckOfCards.size());
    }

    @Test
    void testRegisterBids() {
        game.registerBids();

        assertNotNull(player1.getBid());
        assertNotNull(player2.getBid());
        assertNotNull(player3.getBid());
        assertNotNull(player4.getBid());
    }

    @Test
    void testHighestBid(){
        player1.bid(Bid.SPADES_TRUMP);
        player2.bid(Bid.HEARTS_TRUMP);
        player3.bid(Bid.PASS);
        player4.bid(Bid.ALL_TRUMPS);

        assertEquals(Bid.ALL_TRUMPS, game.highestBid());
    }

    @Test
    void testGiveLsatCards() {
        game.giveLastCards();

        assertEquals(3, player1.sizeOfHand());
        assertEquals(3, player2.sizeOfHand());
        assertEquals(3, player3.sizeOfHand());
        assertEquals(3, player4.sizeOfHand());
        assertEquals(20, deckOfCards.size());
    }
}

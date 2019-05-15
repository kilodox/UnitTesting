package com.epam.belote;

import com.epam.belote.cards.DeckOfCards;

import java.util.Scanner;

public class Play {
    public static void main(String[] args) {

        Player player1 = new Player("Player 1.1");
        Player player2 = new Player("Player 1.2");
        Player player3 = new Player("Player 2.1");
        Player player4 = new Player("Player 2.2");
        while (true) {
            DeckOfCards deckOfCards = new DeckOfCards();
            Game game = new Game(player1, player2, player3, player4, deckOfCards);
            game.giveCards();
            game.registerBids();
            if (game.highestBid() == Bid.PASS) {
                continue;
            }
            game.giveLastCards();
        }
    }
}

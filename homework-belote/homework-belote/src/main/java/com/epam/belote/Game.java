package com.epam.belote;

import com.epam.belote.cards.DeckOfCards;

public class Game {
    private Player player1;
    private Player player2;
    private Player player3;
    private Player player4;
    private DeckOfCards deckOfCards;

    public Game(Player player1, Player player2, Player player3, Player player4, DeckOfCards deckOfCards) {
        this.player1 = player1;
        this.player2 = player2;
        this.player3 = player3;
        this.player4 = player4;
        this.deckOfCards = deckOfCards;
    }

    public void giveCards() {
        deckOfCards.shuffle();
        player1.addCards(deckOfCards.getNext5Cards());
        player2.addCards(deckOfCards.getNext5Cards());
        player3.addCards(deckOfCards.getNext5Cards());
        player4.addCards(deckOfCards.getNext5Cards());
    }

    public void registerBids() {
        player1.bid(Bid.CLUBS_TRUMP);
        player2.bid(Bid.PASS);
        player3.bid(Bid.NO_TRUMPS);
        player4.bid(Bid.ALL_TRUMPS);
    }

    public Bid highestBid(){
        Bid highestBid = player1.getBid();
        if(highestBid.getPriority() < player2.getBid().getPriority()){
            highestBid = player2.getBid();
        }
        if(highestBid.getPriority() < player3.getBid().getPriority()){
            highestBid = player3.getBid();
        }
        if(highestBid.getPriority() < player4.getBid().getPriority()){
            highestBid = player4.getBid();
        }
        return highestBid;
    }
    public void giveLastCards() {
        player1.addCards(deckOfCards.getNext3Cards());
        player2.addCards(deckOfCards.getNext3Cards());
        player3.addCards(deckOfCards.getNext3Cards());
        player4.addCards(deckOfCards.getNext3Cards());
    }
}

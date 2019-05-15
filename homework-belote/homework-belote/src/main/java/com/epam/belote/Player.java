package com.epam.belote;

import com.epam.belote.bonus.Bonus;
import com.epam.belote.cards.Card;
import com.epam.belote.cards.DeckOfCards;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Player implements IPlayer {
    private String name;
    private ArrayList<Card> cardsPlayer = new ArrayList<Card>();
    private Bid bid;

    public Player(String name) {
        this.name = name;
    }

    public void addCards(List<Card> cards){
        cardsPlayer.addAll(cards);
    }

    public int sizeOfHand(){
        return cardsPlayer.size();
    }

    public void bid(Bid bid) {
        this.bid = bid;
    }

    public Bid getBid(){
        return bid;
    }

    public Set<Bonus> declareBonus() {
        return null;
    }

    public Card playCard() {
        return null;
    }

    public Team getTeam() {
        return null;
    }

    public String getName() {
        return name;
    }

    public List<Card> getCardsPlayer() {
        return new ArrayList<>(cardsPlayer);
    }
}

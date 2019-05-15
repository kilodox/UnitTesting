package com.epam.belote.cards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class DeckOfCards {
    private final List<Card> cards = new ArrayList<Card>();

    public DeckOfCards() {
        for (CardSuit suit : CardSuit.values()) {
            for (CardType type : CardType.values()) {
                cards.add(new Card(type, suit));
            }
        }
    }

    List<Card> getCardsCopy(){
        return new ArrayList<>(cards);
    }

    public void shuffle() {
        Collections.shuffle(this.cards);
    }

    public int size() {
       return cards.size();
    }

    public List<Card> getNext5Cards() {
        return getNextCards(5);
    }

    public List<Card> getNext3Cards() {
        return getNextCards(3);
    }

    private List<Card> getNextCards(int n) {
        List<Card> fiveCards = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            fiveCards.add(cards.get(i));
            cards.remove(i);
        }
        return fiveCards;
    }
}

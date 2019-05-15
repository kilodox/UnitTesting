package com.epam.belote.cards;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.fail;

public class DeckOfCardsTest {
    @Test
    void correctNumberOfCardsInDeck(){
        DeckOfCards deckOfCards = new DeckOfCards();

        assertEquals(32, deckOfCards.size());
    }

    @Test
    void uniqueCardsInDeck(){
        DeckOfCards deckOfCards = new DeckOfCards();
        Set<Card> uniqueCards = new HashSet<>(deckOfCards.getCardsCopy());

        assertEquals(32, uniqueCards.size());
    }

    @Test
    void  testIfShuffled(){
        DeckOfCards deckOfCards = new DeckOfCards();
        List<Card> deckBeforeShuffle = deckOfCards.getCardsCopy();
        deckOfCards.shuffle();
        List<Card> deckAfterShuffle = deckOfCards.getCardsCopy();

        boolean correctShuffle = false;

        for(int i = 0; i<deckAfterShuffle.size();i++){
            if(!deckBeforeShuffle.get(i).equals(deckAfterShuffle.get(i))){
                correctShuffle = true;
                break;
            }
        }

        if(!correctShuffle){
            fail();
        }
    }

    @Test
    void returnedCorrectNumberOfCards(){
        DeckOfCards deckOfCards = new DeckOfCards();

        assertEquals(5, deckOfCards.getNext5Cards().size());
        assertEquals(3, deckOfCards.getNext3Cards().size());
    }

    @Test
    void returnedCardsNotInDeck(){
        DeckOfCards deckOfCards = new DeckOfCards();
        List<Card> next5Cards = deckOfCards.getNext5Cards();
        List<Card> cardsCopy = deckOfCards.getCardsCopy();

        assertFalse(cardsCopy.containsAll(next5Cards));
    }
}

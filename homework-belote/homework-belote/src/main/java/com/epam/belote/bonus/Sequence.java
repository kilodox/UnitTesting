package com.epam.belote.bonus;

import com.epam.belote.cards.Card;
import com.epam.belote.cards.CardSuit;
import com.epam.belote.cards.CardType;
import com.epam.belote.cards.CardTypeComparator;

import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.unmodifiableList;

/**
 * The Sequence bonus is declared when the player has a sequence of three or more cards of the same suit, for example Jack, Queen and King of Spades
 */
public class Sequence implements Bonus {
    private final CardSuit suit;
    private final List<CardType> cards;

    public Sequence(CardSuit suit, List<CardType> cards) {
        this.suit = suit;
        this.cards = new ArrayList<>(cards);
    }

    public CardSuit getSuit() {
        return suit;
    }

    public List<CardType> getCards() {
        return cards;
    }

    public int getBonus() {
        this.cards.sort(new CardTypeComparator());
        int previousIndex = 0;
        int sequenceCounter = 1;
        System.out.println(cards);

        for (CardType card : cards) {
            if (previousIndex != 0) {
                if (previousIndex + 1 == card.getIndex()) {
                    sequenceCounter++;
                } else {
                    if (sequenceCounter > 2) {
                        break;
                    }
                }
            }
            previousIndex = card.getIndex();
        }
        System.out.println(sequenceCounter);
        if (sequenceCounter == 3) {
            return 20;
        } else if (sequenceCounter == 4) {
            return 50;
        } else if (sequenceCounter > 4) {
            return 100;
        } else {
            return 0;
        }
    }
}

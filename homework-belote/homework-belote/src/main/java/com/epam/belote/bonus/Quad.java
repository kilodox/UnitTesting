package com.epam.belote.bonus;

import com.epam.belote.cards.CardType;

/**
 * A Quad bonus is declared whenever the player has 4 cards of the same type, e.g. four Kings
 */
public class Quad implements Bonus {
    private final CardType cardType;

    public Quad(CardType cardType) {
        this.cardType = cardType;
    }

    public CardType getCardType() {
        return cardType;
    }

    public int getBonus() {
        switch (cardType) {
            case JACK:
                return 200;
            case NINE:
                return 150;
            case KING:
            case QUEEN:
            case ACE:
                return 100;
            default:
                return 0;
        }
    }
}

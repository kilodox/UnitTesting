package com.epam.belote.cards;

import java.util.Comparator;

public class CardTypeComparator implements Comparator<CardType> {

    @Override
    public int compare(CardType o1, CardType o2) {
        return Integer.compare(o1.getIndex(), o2.getIndex());
    }
}

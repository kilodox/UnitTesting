package com.epam.belote.cards;

public enum CardType {
    SEVEN(7), EIGHT(8), NINE(9), TEN(10), JACK(11), QUEEN(12), KING(13), ACE(14);

    private int index;

    CardType(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }
}

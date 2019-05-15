package com.epam.belote.bonus;

import com.epam.belote.cards.CardSuit;
import com.epam.belote.cards.CardType;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SequenceTest {
    @Test
    void test3SubsequentCards(){
        Sequence sequence = new Sequence(CardSuit.CLUBS,
                Arrays.asList(CardType.SEVEN,CardType.ACE,CardType.NINE, CardType.EIGHT));

        assertEquals(20, sequence.getBonus());
    }

    @Test
    void testNoSubsiquentCards(){
        Sequence sequence = new Sequence(CardSuit.CLUBS,
                Arrays.asList(CardType.SEVEN,CardType.ACE, CardType.EIGHT));

        assertEquals(0, sequence.getBonus());
    }
}

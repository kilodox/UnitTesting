package com.epam.belote.bonus;

import com.epam.belote.cards.CardType;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class QuadTest {
    @Test
    void testBonusPoints(){
        assertEquals(200, new Quad(CardType.JACK).getBonus());
        assertEquals(150, new Quad(CardType.NINE).getBonus());
        assertEquals(100, new Quad(CardType.KING).getBonus());
    }
}

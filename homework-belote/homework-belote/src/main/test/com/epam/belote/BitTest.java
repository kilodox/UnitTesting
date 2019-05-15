package com.epam.belote;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.fail;

public class BitTest {
    @Test
    void testUniquenessOfPriorities(){
        Set<Integer> priorities = new HashSet<>();

        for (Bid bid: Bid.values()) {
            if(priorities.contains(bid.getPriority())){
                fail();
            }else {
                priorities.add(bid.getPriority());
            }
        }
    }
}

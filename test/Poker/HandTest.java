package Poker;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HandTest {
    @Test
    void HighCard() throws InvalidHandException {
        Hand highCardHand=new Hand("2♦3♣4♥5♠6♥");
        assertEquals("High card",highCardHand.getCategory());
    }

    @Test void onePair() throws InvalidHandException {
        Hand onePairHand=new Hand("2♦2♣4♥5♠6♥");
        assertEquals("One Pair",onePairHand.getCategory());
    }

    @Test void invalidHandBecauseMissedSuit() {
        Exception exception=assertThrows(InvalidHandException.class,()-> {
            Hand onePairHand=new Hand("242♣4♥5♠6♥");
        });
        assertEquals("Missing Suit",exception.getMessage());
    }

    @Test void invalidHandBecauseTooLong() {
        Exception exception=assertThrows(InvalidHandException.class,()-> {
            Hand onePairHand=new Hand("2♣2♣4♥5♠6♥2♣");
        });
        assertEquals("A hand needs to be 10 chars long.",exception.getMessage());
    }

    @Test void invalidHandBecauseTooShort() {
        Exception exception=assertThrows(InvalidHandException.class,()-> {
            Hand onePairHand=new Hand("2");
        });
        assertEquals("A hand needs to be 10 chars long.",exception.getMessage());
    }

    ////Straight ---> (56789) escalera diferentes colores
    @Test void isStraightWhenCardsAreLowNumbers() throws InvalidHandException {
        Hand onePairHand=new Hand("2♦3♣4♥5♠6♥");
        assertEquals("Straight",onePairHand.getCategory());
    }

    @Test void isStraightWhenCardsAreHighNumbers() throws InvalidHandException {
        Hand onePairHand=new Hand("5♦6♣7♥8♠9♥");
        assertEquals("Straight",onePairHand.getCategory());
    }

    @Test void isStraightWhenCardsAreLetterRanks() throws InvalidHandException {
        Hand onePairHand=new Hand("T♦J♣Q♥K♠A♥");
        assertEquals("Straight",onePairHand.getCategory());
    }


    @Test void isNotStraightWhenCardsAreLowRanks() throws InvalidHandException {
        Hand onePairHand=new Hand("2♦3♣5♥6♠7♥");
        assertEquals(false,onePairHand.isStraight());
    }

}
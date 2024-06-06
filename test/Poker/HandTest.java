package Poker;

import org.junit.jupiter.api.Test;

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

}
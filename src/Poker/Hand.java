package Poker;

//1-Saber qué jugada lleva una Mano "AAKJ2" -> Pareja de Ases
//2-Comparador de "manos" -> "AAKJ2" > "3326J"
//3-Añadir los "palos" (diamante, corazón, pica, trebol)


/*
High card -----> Done (12345) carta mas alta
One pair   -----> Done (11234) 1 par
Two pair   ----> Done (22335) dos pares
Three of a kind  ---> Done (11154) tres pares
Straight ---> (56789) escalera diferentes colores
Flush  ---> (KQ985) Done Mismo color
Full house --->Done (KK888) pareja y trio
Four of a kind ---->Done (AAAA3) da igual el color se llama Poker
Straight flush ----> (678910) escalera mismo color
Five of a kind ----> (AKQJ10) Mismo Color
 */

public class Hand {


    private String hand;
    public Hand(String hand) throws InvalidHandException {
        this.hand =hand;

        if (this.hand.length()!=10) {
            throw new InvalidHandException("A hand needs to be 10 chars long.");
        }
        //Detectar cuando faltan palos
    }

    private String getHandWithoutSuits() {
        String handWithoutSuits="";
        for(char c:this.hand.toCharArray()) {
            if (Character.isDigit(c)) {
                handWithoutSuits=handWithoutSuits+c;
            }
        }
        return handWithoutSuits;
    }
    private String getHandWithoutRank() {
        String handWithoutRank="";
        for(char c:this.hand.toCharArray()) {
            if (!Character.isDigit(c)) {
                handWithoutRank=handWithoutRank+c;
            }
        }
        return handWithoutRank;
    }

    public String getCategory() {
        if (isFullHouse()) {
            return "Full House";
        } else if (handHasFourOfAKind()) {
            return "Four of a Kind";
        } else if (handHasThreeOfAKind()) {
            return "Three of a kind";
        } else if (handHasOneRepeatChar()) {
            return "One Pair";
        } else if (handHasTwoPairs()) {
            return "Two Pair";
        } else if (isFlush()) {
            return "Flush";
        }
        return "High card";
    }

    private boolean handHasOneRepeatChar() {
        String handWithoutSuits=getHandWithoutSuits();
        int pairsCount = 0;
        for (char card : handWithoutSuits.toCharArray()) {
            if (countRepeats(handWithoutSuits, card) == 2) {
                pairsCount++;
            }
        }
        return pairsCount == 2;

    }

    private boolean handHasTwoPairs() {
        String handWithoutSuits=this.getHandWithoutSuits();
        for(char card:handWithoutSuits.toCharArray()) {
            if (countRepeats(handWithoutSuits, card)==2) return true;
        }
        return false;
    }

    private boolean handHasThreeOfAKind() {
        String handWithoutSuits=this.getHandWithoutSuits();
        for (char card : handWithoutSuits.toCharArray()) {
            if (countRepeats(handWithoutSuits, card) == 3) {
                return true;
            }
        }
        return false;
    }

    private boolean handHasFourOfAKind() {
        String handWithoutSuits = this.getHandWithoutSuits();
        for (char card : handWithoutSuits.toCharArray()) {
            if (countRepeats(handWithoutSuits, card) == 4) {
                return true;
            }
        }
        return false;
    }

    private boolean isFullHouse() {
        String handWithoutSuits = getHandWithoutSuits();
        boolean hasThreeOfAKind = false;
        boolean hasPair = false;
        for (char card : handWithoutSuits.toCharArray()) {
            int count = countRepeats(handWithoutSuits, card);
            if (count == 3) {
                hasThreeOfAKind = true;
            } else if (count == 2) {
                hasPair = true;
            }
        }
        return hasThreeOfAKind && hasPair;
    }


    private boolean isFlush() {
        String handWithoutRank=getHandWithoutRank();
        for (char c:"♦♣♥♠".toCharArray()) {
            if (this.countRepeats(handWithoutRank, c)==5) {
                return true;
            }
        }
        return false;
    }

    private int countRepeats(String str, char c) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                count++;
            }
        }
        return count;
    }

    @Override
    public String toString() {
        return hand;
    }

    //Palo (Suit)
    //diamonds (♦), clubs (♣), hearts (♥) and spades (♠)
    public static void main(String[] args) throws InvalidHandException {
        Hand twoPairHand=new Hand("2♦2♣4♥4♠6♥");
        System.out.println(twoPairHand.toString() +"->"+twoPairHand.getCategory());
        Hand ThreeOfaKind=new Hand("2♦2♣2♥4♠6♥");
        System.out.println(ThreeOfaKind.toString() +"->"+ThreeOfaKind.getCategory());
        Hand ThreeOfaKind2=new Hand("A♦A♣A♥4♠6♥");
        System.out.println(ThreeOfaKind2.toString() +"->"+ThreeOfaKind2.getCategory());
        Hand fullHouseHand = new Hand("3♦3♣3♥4♠4♥");
        System.out.println(fullHouseHand.toString() + " -> " + fullHouseHand.getCategory());
        Hand flushDiamonds=new Hand("2♦3♦4♦6♦7♦");
        System.out.println(flushDiamonds.toString() +"->"+flushDiamonds.getCategory());
        Hand flushHearts=new Hand("2♥3♥4♥6♥7♥");
        System.out.println(flushHearts.toString() +"->"+flushHearts.getCategory());
        Hand fourOfaKind = new Hand("2♦2♣2♥2♠6♥");
        System.out.println(fourOfaKind.toString() + " -> " + fourOfaKind.getCategory());
        Hand fourOfaKind2 = new Hand("A♦A♣A♥A♠6♥");
        System.out.println(fourOfaKind2.toString() + " -> " + fourOfaKind2.getCategory());

    }

}
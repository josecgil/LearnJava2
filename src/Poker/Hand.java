package Poker;

//1-Saber qué jugada lleva una Mano "AAKJ2" -> Pareja de Ases
//2-Comparador de "manos" -> "AAKJ2" > "3326J"
//3-Añadir los "palos" (diamante, corazón, pica, trebol)


/*
High card
One pair
Two pair
Three of a kind
Straight
Flush
Full house
Four of a kind
Straight flush
Five of a kind
 */

public class Hand {


    private String hand;
    public Hand(String hand) {
        this.hand =hand;
    }

    private String getCategory() {

        if (handHasOneRepeatChar()) {
            return "One Pair";
        }
        return "High card";
    }

    private boolean handHasOneRepeatChar() {
        //"23452"
        for(char card:this.hand.toCharArray()) {
            if (countRepeats(this.hand, card)==2) return true;
        }
        return false;
    }

    private int countRepeats(String str, char c) {
        //saber el número de veces que c aparece en str
        return 0;
    }

    @Override
    public String toString() {
        return hand;
    }

    public static void main(String[] args) {
        Hand highCardHand=new Hand("23456");
        System.out.println(highCardHand.toString() +"->"+highCardHand.getCategory());
        Hand onePairHand=new Hand("22456");
        System.out.println(onePairHand.toString() +"->"+onePairHand.getCategory());
    }

}

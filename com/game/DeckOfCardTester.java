package com.game;

public class DeckOfCardTester {

    public static void main(String[] args) {
        DeckOfCards deck = new DeckOfCards();
        for (int i = 0; i < 52; i++) {
            if (i==13||i==26||i==39){
                System.out.println("\n");
            }
            System.out.println(deck.printdeck());
        }
        System.out.println("\n");
        String[][] players={
                {"2C","3C","4C","5C","6C","7C","8C","9C","10C","jack(C)","queen(C)","king(C)","ace(C)"},
                {"2D","3D","4D","5D","6D","7D","8D","9D","10D","jack(D)","queen(D)","king(D)","ace(D)"},
                {"2H","3H","4H","5H","6H","7H","8H","9H","10H","jack(H)","queen(H)","king(H)","ace(H)"},
                {"2S","3S","4S","5S","6S","7S","8S","9S","10S","jack(S)","queen(S)","king(S)","ace(S)"}};
        deck.shuffleForPlayers(players);

    }
    // i will distribute 9 cards among 4 players
    //static String[][] players= new String[4][9];
}

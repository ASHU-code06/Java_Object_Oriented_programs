package com.game;

import java.util.Random;

public class DeckOfCards {
    private static int currentCard = 0;
    private Card[] deck; //an array(deck) of type deck
    private static final int NUMBER_OF_CARDS = 52;
    private static final Random randomNumbers = new Random();//It is making sure that there is no duplicate random cards

    public DeckOfCards() {
        String faces[] = {"Ace", "Deuce", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "King", "Queen"};
        String suits[] = {"Hearts", "Diamonds", "Spades", "Clubs"};
        deck = new Card[NUMBER_OF_CARDS];//Initializing array(deck)
        //Populate the deck of cards
        for (int count = 0; count < deck.length/*array.length*/; count++) {
            deck[count] = new Card(faces[count % 13], suits[count / 13]);//faces for each type of suit, '%' will give all faces ( ace to queen ) and '/' will give all suit.
        }
    }

    public void shuffle() {
        for (int first = 0; first < deck.length; first++) {
            int second = randomNumbers.nextInt(NUMBER_OF_CARDS);//Randomly any card among 52 cards is picked
            // Swapping
            Card swap = deck[first]; // swap of type card
            deck[first] = deck[second];
            deck[second] = swap;
        }
    }
    public  int getCurrentCard() {
        return currentCard;
    }
    public Card printdeck(){
        if (currentCard < deck.length) {
            return deck[currentCard++];
        } else {
            return null;
        }
    }
    public void shuffleForPlayers(String[][] card){  //Method for shuffling cards
        String temp;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                int row = (int)Math.floor(Math.random() * 3);
                int column = (int)Math.floor(Math.random() * 8);
                temp=card[i][j];
                card[i][j] = card[row][column];
                card[row][column] = temp;
            }
        }
        for (int i = 0; i < 4; i++) { //displaying shuffled cards
            System.out.print("Player"+ (i+1) + ": ");
            for (int j = 0; j < 13; j++) {
                System.out.print(card[i][j]+" ");
            }
            System.out.println();
        }
    }
}

package com.midterms;

import java.util.Scanner;
import java.util.Random;


public class Main {

    public static void main(String[] args) {

        Random rand = new Random();

        Hand hand = new Hand(30);
        Deck deck = new Deck(30);
        Discard discard = new Discard(30);

        System.out.println("Deck");
        for(int i = 0; i < 30; i++)
        {
            deck.push(new Card(1 + i, "Card " + i));
        }

        Scanner kbd = new Scanner(System.in);
        String answer;

        while(!deck.isEmpty()) {
            System.out.println("Player's Current Hand:");
            hand.printHand();
            System.out.println("Player's deck size = " + deck.size());
            System.out.println("Player's discard pile = " + discard.size() + "\n");

            System.out.println("Type X to draw, Y to discard, Z to get card from the discarded pile.");
            answer = kbd.nextLine();


            switch (answer) {
                case "X":
                    int randNum = rand.nextInt(5) + 1;
                    System.out.println("\nDraw to Hand");
                    for (int i = 0; i < randNum; i++) {
                        hand.push(deck.pop());
                    }
                    hand.printHand();
                    System.out.println("\n");
                    break;

                case "Y":
                    randNum = rand.nextInt(5) + 1;
                    System.out.println("\nDiscard");
                    if (hand.isEmpty()) {
                        System.out.println("There is no cards to discard.");
                    }
                    else if(hand.size() < randNum )
                    {
                        randNum = hand.size();
                        for (int i = 0; i < randNum; i++) {
                            discard.push(hand.pop());
                        }
                        discard.printDiscard(discard.size());
                    }
                    else {
                        for (int i = 0; i < randNum; i++) {
                            discard.push(hand.pop());
                        }
                        discard.printDiscard(discard.size());
                    }
                    break;

                case "Z":
                    randNum = rand.nextInt(5) + 1;
                    System.out.println("\nGetting cards from Discard Pile");
                    if (discard.isEmpty()) {
                        System.out.println("There is no cards to put back to hand.");
                    }
                    else if(discard.size() < randNum )
                    {
                        randNum = discard.size();
                        for (int i = 0; i < randNum; i++) {
                            hand.push(discard.pop());
                        }
                    }
                    else {
                        for (int i = 0; i < randNum; i++) {
                            hand.push(discard.pop());
                        }
                    }
                    break;
            }



        }

    }
}

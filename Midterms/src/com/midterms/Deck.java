package com.midterms;

import java.util.Random;
import java.util.EmptyStackException;

public class Deck {
   // CARD STACK
   private Card[] stack;
   int deckSize;
   private int top;


   public Deck(int capacity) {
      stack = new Card[capacity];
   }

   public void push(Card card) {
      if (top == stack.length) {
         Card[] newCard = new Card[2 * stack.length];
         System.arraycopy(stack, 0, newCard, 0, stack.length);
         stack = newCard;
      }
      stack[top++] = card;
      deckSize++;
   }

   public Card pop()
   {
      if(isEmpty())
      {
         throw new EmptyStackException();
      }

      Card poppedCard = stack[--top];
      stack[top] = null;
      deckSize--;
      return poppedCard;
   }

   public boolean isEmpty()
   {
      return top == 0;
   }

   public void printDeck()
   {
      for(int i = 0; i < stack.length; i++)
      {
         if(stack[i] == null)
         {
            break;
         }
         System.out.println(stack[i]);
      }
   }

   public int size()
   {
      return deckSize;
   }
}

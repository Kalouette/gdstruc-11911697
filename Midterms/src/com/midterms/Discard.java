package com.midterms;

import java.util.EmptyStackException;

public class Discard {

    private Card[] stack;
    int discardSize;
    private int top;

    public Discard(int capacity) {
        stack = new Card[capacity];
    }

    public void push(Card card) {
        if (top == stack.length) {
            Card[] newCard = new Card[2 * stack.length];
            System.arraycopy(stack, 0, newCard, 0, stack.length);
            stack = newCard;
        }
        stack[top++] = card;
        discardSize++;
    }

    public Card pop()
    {
        if(isEmpty())
        {
            throw new EmptyStackException();
        }

        Card poppedCard = stack[--top];
        stack[top] = null;
        discardSize--;
        return poppedCard;

    }

    public boolean isEmpty()
    {
        return top == 0;
    }

    public void printDiscard(int x)
    {
        for(int i = 0; i < x ; i++)
        {
            System.out.println(stack[i]);
        }
    }

    public int size()
    {
        return discardSize;
    }

}

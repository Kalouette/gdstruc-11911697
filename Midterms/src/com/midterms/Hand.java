package com.midterms;

import java.util.EmptyStackException;

public class Hand {

    private Card[] stack;
    int handSize;
    private int top;

    public Hand(int capacity) {
        stack = new Card[capacity];
    }

    public void push(Card card) {
        if (top == stack.length) {
            Card[] newCard = new Card[2 * stack.length];
            System.arraycopy(stack, 0, newCard, 0, stack.length);
            stack = newCard;
        }
        stack[top++] = card;
        handSize++;
    }

    public Card pop()
    {
        if(isEmpty())
        {
            throw new EmptyStackException();
        }

        Card poppedCard = stack[--top];
        stack[top] = null;
        handSize--;
        return poppedCard;
    }

    public boolean isEmpty()
    {
        return top == 0;
    }

public void printHand()
{

    for(int i = 0; i < 30; i++)
    {
        if(isEmpty())
        {
            System.out.println("There's no cards in your hand");
            break;
        }
        else if(handSize > 0)
        {
            if(stack[i] == null){
                break;
            }
            System.out.println(stack[i]);
        }

    }
}
public int size()
{
    return handSize;
}

}

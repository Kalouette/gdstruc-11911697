package com.Module1Sorting;

public class Main {

    public static void main(String[] args) {
        int[] bubbleNumbers = new int[10];
        int[] selectionNumbers = new int[10];

        bubbleNumbers[0] = 16;
        bubbleNumbers[1] = 65;
        bubbleNumbers[2] = -10;
        bubbleNumbers[3] = 1337;
        bubbleNumbers[4] = 2016;
        bubbleNumbers[5] = 322;
        bubbleNumbers[6] = 420;
        bubbleNumbers[7] = -55334;
        bubbleNumbers[8] = 55432;
        bubbleNumbers[9] = 91021;

        selectionNumbers[0] = 16;
        selectionNumbers[1] = 65;
        selectionNumbers[2] = -10;
        selectionNumbers[3] = 1337;
        selectionNumbers[4] = 2016;
        selectionNumbers[5] = 322;
        selectionNumbers[6] = 420;
        selectionNumbers[7] = -55334;
        selectionNumbers[8] = 55432;
        selectionNumbers[9] = 91021;

        System.out.println("Before bubble sort:");
        printArrayElements(bubbleNumbers);

        bubbleSort(bubbleNumbers);

        System.out.println("\n\nAfter bubble sort descending order:");
        printArrayElements(bubbleNumbers);

        System.out.println("\n\nBefore selection sort descending order:");
        printArrayElements(selectionNumbers);

        selectionSort(selectionNumbers);

        System.out.println("\n\nAfter selection sort descending order:");
        printArrayElements(selectionNumbers);
    }
    private static void bubbleSort(int[] arr) {
        for (int lastSortedIndex = arr.length - 1;lastSortedIndex > 0; lastSortedIndex-- )
        {
            for (int i = 0; i < lastSortedIndex; i++)
            {
                if (arr[i] < arr[i + 1])
                {
                    int temp = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }
    private static void selectionSort(int[] arr)
    {
        for(int lastSortedIndex = arr.length - 1; lastSortedIndex > 0; lastSortedIndex--)
        {
            int shortestIndex = 0;
            for(int i = 1; i <= lastSortedIndex; i++)
            {
                if(arr[i] < arr[shortestIndex])
                {
                    shortestIndex = i;
                }
            }
            int temp = arr[lastSortedIndex];
            arr[lastSortedIndex] = arr[shortestIndex];
            arr[shortestIndex] = temp;
        }
    }
    private static void printArrayElements(int[] arr)
    {
            for (int j : arr) {
                System.out.print(j + " ");
            }
        }
    }


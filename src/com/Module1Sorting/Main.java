package com.Module1Sorting;

public class Main {

    public static void main(String[] args) {
        int[] numbers = new int[10];

        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = -10;
        numbers[3] = 109;
        numbers[4] = 1214;
        numbers[5] = 256;
        numbers[6] = 420;
        numbers[7] = -69;
        numbers[8] = 1337;
        numbers[9] = 91021;
        System.out.println("Before selection sort:");
        printArrayElements(numbers);
        selectionSort(numbers);

        System.out.println("\n\nAfter selection sort:");
        printArrayElements(numbers);
    }
    private static void bubbleSort(int[] arr) {
        for (int lastSortedIndex = arr.length - 1;lastSortedIndex > 0; lastSortedIndex-- )
        {
            for (int i = 0; i < lastSortedIndex; i++)
            {
                if (arr[i] > arr[i + 1])
                {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
    }
    private static void selectionSort(int[] arr)
    {
        for(int lastSortedIndex = arr.length - 1; lastSortedIndex > 0; lastSortedIndex--)
        {
            int largestIndex = 0;
            for(int i = 1; i <= lastSortedIndex; i++)
            {
                if(arr[i] > arr[largestIndex])
                {
                    largestIndex = i;
                }
            }

            int temp = arr[lastSortedIndex];
            arr[lastSortedIndex] = arr[largestIndex];
            arr[largestIndex] = temp;

        }
    }
    private static void printArrayElements(int[] arr)
    {
            for (int j : arr) {
                System.out.println(j);
            }
        }
    }


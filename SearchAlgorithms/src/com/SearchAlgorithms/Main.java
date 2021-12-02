package com.SearchAlgorithms;

public class Main {

    public static void main(String[] args) {
	int numbers[] = {-400, 10, 24253, 7117, -14624, 1437, 2803, 0};

    System.out.println(bubbleSortingSearch(numbers, -400));
    printArrayElements(numbers);
    }

    public static int bubbleSortingSearch(int[] arr, int elementToFind) {

        for (int lastSortedIndex = arr.length - 1; lastSortedIndex > 0; lastSortedIndex--) {
            for (int i = 0; i < lastSortedIndex; i++)
            {
                if (arr[i] < arr[i + 1])
                {
                    int temp = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = temp;
                }
                if(arr[i] == elementToFind)
                {
                    System.out.println("Element found in index: ");
                    return i;
                }
            }
        }
        System.out.println("System cannot find Element in array: ");
        return -1;
    }
    private static void printArrayElements(int[] arr)
    {
        for(int j : arr)
        {
            System.out.print(j + " ");
        }
    }
}








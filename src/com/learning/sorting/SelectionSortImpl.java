package com.learning.sorting;

public class SelectionSortImpl {
    public int[] arr;

    public SelectionSortImpl(int[] arr) {
        this.arr = arr;
    }

    public void sort() {
        int minIndex = 0;
        int tempVariable = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex])
                    minIndex = j;
            }
            tempVariable = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = tempVariable;
        }
    }

    public void print() {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String args[]) {
        int[] arr = {3, 2, 5, 7, 9, 6};
        SelectionSortImpl selectionSort = new SelectionSortImpl(arr);
        selectionSort.sort();
        selectionSort.print();
    }
}


// SELECTION SORT
// TIME COMPLEXITY: O(N * N)

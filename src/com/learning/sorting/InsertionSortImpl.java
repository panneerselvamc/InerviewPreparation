package com.learning.sorting;

public class InsertionSortImpl {
    private int[] arr;

    public InsertionSortImpl(int[] arr) {
        this.arr = arr;
    }

    public void sort() {
        int j = 0;
        int key = 0;
        for (int i = 0; i < arr.length; i++) {
            key = arr[i];
            j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    public void print() {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }

    public static void main(String args[]) {
        int[] arr = {3, 2, 5, 7, 9, 6};
        InsertionSortImpl insertionSort = new InsertionSortImpl(arr);
        insertionSort.sort();
        insertionSort.print();
    }
}

// TIME COMPLEXITY : O(N)

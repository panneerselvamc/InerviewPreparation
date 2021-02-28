package com.learning.binarysearch;

public class BinarySearchImpl {

    public static int search(int[] arr, int start, int end, int key) {
        if (end >= 1) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == key) {
                return key;
            }
            if (arr[mid] > key) {
                return search(arr, start, mid - 1, key);
            } else if (arr[mid] < key) {
                return search(arr, mid + 1, end, key);
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9};
        System.out.println(search(arr, 0, arr.length, 3));
    }
}

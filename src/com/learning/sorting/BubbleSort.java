package com.learning.sorting;

import java.util.Arrays;

public class BubbleSort {
    public  static void sort(int[] arr){
        int temp=0;
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }

            }
        }

    }
    public static void main(String[] args) {
        int[] arr = {3, 2, 5, 7, 9, 6};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}

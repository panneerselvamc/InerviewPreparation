package com.learning.sorting;

import java.util.Arrays;

public class ShellSortImpl {
    public static void sort(int[] arr){
        int temp=0;
       for(int gap=arr.length/2;gap>=1;gap=gap/2){
           for(int j=gap;j<arr.length;j++){
               for(int i=j-gap;i>=0;i=i-gap){
                   if(arr[i+gap]<arr[i]){
                        temp=arr[i];
                       arr[i]=arr[i+gap];
                       arr[i+gap]=temp;
                   }
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

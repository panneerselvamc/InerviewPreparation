package com.learning.sorting;

import java.util.Arrays;


public class MergeSortImpl{

    public static void sort(int[] arr,int arrSize){
        if(arrSize>=2){
            int mid=arrSize/2;
            int[] leftArr=new int[mid];
            int[] rightArr=new int[arrSize-mid];

            for(int i=0;i<mid;i++){
                leftArr[i]=arr[i];
            }
            for(int i=mid;i<arrSize;i++){
                rightArr[i-mid]=arr[i];
            }

            sort(leftArr,mid);
            sort(rightArr,arrSize-mid);
            merge(arr,leftArr,rightArr,mid,arrSize-mid);

        }

    }

    public static void merge(int[] arr,int[] leftArr,int[] rightArr,int left,int right){
        int i=0,j=0,k=0;

        while (i<left && j<right){
            if(leftArr[i]<=rightArr[j]){
                arr[k++]=leftArr[i++];
            }
            else{
                arr[k++]=rightArr[j++];
            }
        }

        while (i<left){
            arr[k++]=leftArr[i++];
        }
        while (j<right){
            arr[k++]=rightArr[j++];
        }
    }
    public static void main(String args[]){
        int[] arr={3,5,2,1,7,6};
        sort(arr,arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
package com.learning.sorting;

import java.util.Arrays;

public class QuickSortImpl {
    public void sort(int start,int end, int[] arr){
        if(start<end){
            int pivot=getPartition(start,end,arr);
            sort(start,pivot-1,arr);
            sort(pivot+1,end,arr);
        }
    }
    public int getPartition(int start,int end,int[] arr){

        int i=start-1;
        int pivot=arr[end];
        int temp=0;

        for(int j=start;j<end;j++){
            if(arr[j]<=pivot){
                i++;
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;

            }
        }

       // Replacing PIVOT ELEMENT
       temp=arr[i+1];
        arr[i+1]=pivot;
        arr[end]=temp;
        return i+1;
    }
    public  static void main(String args[]){
        int[] arr={5,2,1,3};
        QuickSortImpl quickSort=new QuickSortImpl();
        quickSort.sort(0,arr.length-1,arr);
        System.out.println(Arrays.toString(arr));

    }
}


// TIME COMPLEXITY: AVERAGE - O( N LOG N), WORST : O(N* N)

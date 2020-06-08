package com.shobaki;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = {20, 35, -15, 7, 55, 1, -22};
	    //Like bubble sort, Selection sort divide the array to unsorted and sorted partition
        //lastUnsortedIndex  = 6 --> this is the last index of the unsorted partition
        //i=1 --> index used to traverse the array from left to right   //inner loop start from 1
        //largest = 0 --> index of largest element in unsorted partition

        //Selection sort: //usually perform better than bubble sort because it doesn't require swapping as bubble sort
        //- In-place algorithm
        //O of n squared complexity - quadratic
        //unstable sort algorithm --> if there duplicate elements will be no guarantee that the original order will be preserved
        //Selection sort called selection because on each traversal, its selecting the largest element
        //and move to the sorted partition

        for(int lastUnsortedIndex = arr.length-1; lastUnsortedIndex >0; lastUnsortedIndex--){
            int largest =0; //position 0
            for(int i=1; i<= lastUnsortedIndex; i++){   //inner loop start at 1
                // i<= last (equal because we need to compare largest to the last element in the array)
                if(arr[i] > arr[largest]){
                    largest = i;
                }
            }
            swap(arr, largest, lastUnsortedIndex);
        }

        System.out.println(Arrays.toString(arr));
    }
    public static void swap(int[] array , int i, int j){
        if(i == j){
            return;
        }
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}

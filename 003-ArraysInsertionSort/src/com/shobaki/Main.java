package com.shobaki;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = {20, 35, -15, 7, 55, 1, -22};
        //Insertion sort:
        //grows assorted partition from left to right ( not like bubble or selection sorts)
        //firstUnsortedIndex = 1 -> this is the first index of the unsorted partition
        //i = 0  -> index used to travers the sorted partition from right to left
        //newElement = 35 -> the value we want to insert into the sorted partition -> arr[firstUnsortedIndex]
        //- In-place algorithm
        //O of n squared time complexity - quadratic
        //Stable algorithm

        for(int firstUnsortedIndex = 1; firstUnsortedIndex < arr.length; firstUnsortedIndex++){
            int newElement = arr[firstUnsortedIndex];
            int i;
            for( i = firstUnsortedIndex; i > 0 && arr[i-1] > newElement; i--){
                arr[i] = arr[i-1];
            }
            arr[i] = newElement;
        }

        System.out.println(Arrays.toString(arr));
    }
}

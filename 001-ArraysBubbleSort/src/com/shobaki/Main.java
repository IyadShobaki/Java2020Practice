package com.shobaki;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] arr = {20, 35, -15, 7, 55, 1, -22};
        //In bubble sort algorithm, as the algorithm progresses, it partition the array into
        //a sorted partition and an unsorted partition
        //when we start to sort the array above:
        //unsortedPartitionIndex = 6 --> this the last index of the unsorted partition
        //i = 0 --> index to traverse the array from left to right

        //at the for loop, we will compare arr[0] and arr[1] then arr[1] and arr[2]  ...... until the last element

        //after first loop --> unsortedPartitionIndex = 5

        //Bubble sort: - In-place algorithm --> we don't have to create another array in order to perform this sort
        // - O of n squared time complexity - quadratic --> degrades quickly
        //one of the least efficient algorithm
        //stable sort algorithm --> if there is two same numbers, they will stay at the same position
        for(int lastUnsortedIndex = arr.length-1; lastUnsortedIndex > 0 ; lastUnsortedIndex--){
            for(int i=0; i< lastUnsortedIndex; i++){
                if(arr[i] > arr[i+1]){
                    swap(arr,i, i+1);
                }
            }
        }

        System.out.println(Arrays.toString(arr));

    }
    //start with write a swap method
    public static void swap(int[] array, int i, int j){
        if(i == j){
            return;
        }
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}

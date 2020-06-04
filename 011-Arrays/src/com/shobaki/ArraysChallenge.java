package com.shobaki;

import java.util.Arrays;

public class ArraysChallenge {

    public static void main(String[] args) {
        int[] values = {106, 26,81,5,15};

        System.out.println(Arrays.toString(sortIntegers(values)));
    }
    public static int[] sortIntegers(int[] array){
        int[] sortedArray = new int[array.length];
        for(int i=0; i<array.length; i++){
            sortedArray[i] = array[i];
        }
//        int[] sortedArray = Arrays.copyOf(array, array.length);
        boolean flag = true;
        int temp;
        while(flag){
            flag = false;
            for(int i=0; i< sortedArray.length-1; i++){
                if(sortedArray[i] < sortedArray[i+1]){
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }
}

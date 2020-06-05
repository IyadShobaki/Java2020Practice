package com.shobaki;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumElementChallenge {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("How many integers you want to enter:\r");
        int count= scanner.nextInt();
        scanner.nextLine();

        int[] array = readIntegers(count);

        System.out.println(Arrays.toString(array));

        System.out.println(findMin(array));

    }
    private static int[] readIntegers(int count){
        int[] array = new int[count];
        for(int i =0; i < array.length; i++){
            System.out.println("Enter " + (i +1) +  " number:");
            array[i] = scanner.nextInt();
            scanner.nextLine();
        }

        return array;
    }
    private static int findMin(int[] array){
        int min = Integer.MAX_VALUE;
        //int min = array[0];
        for(int i=0; i< array.length; i++){
            if(array[i] < min){
                min = array[i];
            }
        }
        return min;
    }
}

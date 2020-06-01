package com.shobaki;

import java.util.Arrays;

public class ArraysLeftRotation {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};
       //System.out.println(Arrays.toString(rotLeft(arr, 4)));
        System.out.println(Arrays.toString(rotLeftInternet(arr, 4)));
        //[5, 1, 2, 3, 4]
        int[] arr1 = new int[] {1,2,3,4,5};
        System.out.println(Arrays.toString(rotLeft(arr1,2)));
    }


    //Terminated due to timeout :(     Test case 8 and 9
    public static int[] rotLeft(int[] a, int d) {

        int f = 0;
        while (f < d) {
            int temp = a[0];
            for (int i = 0; i < a.length; i++) {
                if (i == a.length - 1) {
                    a[i] = temp;
                } else {
                    a[i] = a[i + 1];
                }
            }
            f++;
        }


        return a;
    }

    //internet solution
    public static int[] rotLeftInternet(int[] a, int d) {
       int size = a.length;
       int[] rotatedArray = new int[size];
       int i =0;
       int rotateIndex = d;
       while(rotateIndex < size){
           rotatedArray[i] = a[rotateIndex];
           i++;
           rotateIndex++;
       }
       rotateIndex = 0;
       while(rotateIndex< d){
           rotatedArray[i] = a[rotateIndex];
           i++;
           rotateIndex++;
       }
       return rotatedArray;
    }

}

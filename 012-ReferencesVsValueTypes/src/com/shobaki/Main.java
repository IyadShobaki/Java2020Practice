package com.shobaki;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int myIntValue  =10;
        int anotherIntValue = myIntValue;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("anotherIntValue = " + anotherIntValue);

        anotherIntValue++;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("anotherIntValue = " + anotherIntValue);
        //Value Type
        //when we create int variable a single space in memory
        //is allocated to store the value and that variable
        // if we sign it to another variable the value is copied directly
        // and both variables work independently

        //Reference type , arrays are a reference types, they hold
        // a reference or address to the object and not the object itself

        int[] myIntArray = new int[5];
        int[] anotherArray = myIntArray; //declare another reference to the same array in memory
        //the two reference pointing to the same array in memory

        System.out.println("myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("anotherArray = " + Arrays.toString(anotherArray));
        anotherArray[0] = 1;
        System.out.println("After change myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("After change anotherArray = " + Arrays.toString(anotherArray));

       // anotherArray = new int[] {4,5,6,7,8}; //de referencing, anotherArray pointing to another array in memory
        modifyArray(myIntArray);

        System.out.println("After modify myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("After modify anotherArray = " + Arrays.toString(anotherArray));

    }

    private static void modifyArray(int[] array){
        array[0] = 2;
        array = new int[] {1,2,3,4,5};

    }
}

package com.shobaki;

public class Main {

    public static void main(String[] args) {

        //- Integer is a wrapper class allow us to perform different operations on int
        //- Byte - > 8 bits / Short -> 16bits / int -> 32 bits / long -> 64 bits  2^63 (need L at the end)
        //				/float -> 32 bits (need f) / double -> 64 bits
        int intNumber = Integer.MAX_VALUE;
        long bigLongNumber = 2_147_483_647_234L;
	    float myFloatValue = 5.25f;
	    float floatNumber = (float) 5.25;
	    //pounds to kilograms
        double pound = 200;
        double kilogram;
        System.out.println(kilogram = pound * 0.45359237);
        //for precise calculation use BigDecimal data type
        //char - > 16 bits

        char unicode = '\u0044';
        System.out.println(unicode);

        //String is a sequence of character and they are immutable
        String  myString = "Iyad";
        myString = myString + " Shobaki"; //java will create a new String.
        // (It doesn't append the new word to the previous myString)
        System.out.println(myString);

        //StringBuffer unlike the String can be changed and append new values

        //---------------------
        //operand is a term to describe any object that is manipulated by an operator
        int myVar = 15 + 12;  //15 and 12 are operands
        //(15 + 12)  -> is the expression
        //if(isTrue == true)  /  isTrue = true  -> is the expression

        //Ternary Operator
        boolean isCar = false;
        String wasCar= isCar ? "isCar" : "isNotCar";
        System.out.println(wasCar);

        //operator challenge
        double dValue = 20.00;
        double dValue2 = 80.00;
        double result = (80.00 + 20.00) * 100;
        double remainder = result % 40.00;
        boolean isNoRemainder = (remainder == 0 ) ? true : false;
        System.out.println(isNoRemainder);

        //double kilometers = (100 * 1.609344);  the whole thing is a statement
        //kilometers = (100 * 1.609344) - > is the expression (
    }
}

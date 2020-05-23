package com.shobaki;

public class FeetToInches {

    public static void main(String[] args) {
        System.out.println(calcFeetAndInchesToCentimeters(100));

    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if( feet < 0 || inches < 0 || inches > 12){
            return -1;
        }
        double totalCentimeters = ( (feet * 12) + inches)  * 2.54;
        return totalCentimeters;
    }

    public static double calcFeetAndInchesToCentimeters(double inches){
        double feet;
        if(inches < 0){
            return -1;
        }
        if(inches < 12){
            feet = 0;

        }else{
            feet = (int) inches / 12;
        }

        double remainingInches = (int) inches % 12;

        return calcFeetAndInchesToCentimeters(feet, remainingInches);

    }
}

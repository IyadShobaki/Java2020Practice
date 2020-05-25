package com.shobaki;

public class AllFactors {
    public static void main(String[] args) {
        printFactors(6);
        System.out.println(isPerfectNumber(6));
    }
    public static void printFactors(int number){
        if(number < 1){
            System.out.println("Invalid Value");
        }
        for(int i=1; i<=number; i++){
            if(number % i == 0){
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isPerfectNumber(int number) {
        if(number < 1)
            return false;
        int count =0;
        for(int i =1; i< number; i++) {
            if(number % i == 0)
                count += i;
        }
        if(count == number)
            return true;

        return false;
    }
}

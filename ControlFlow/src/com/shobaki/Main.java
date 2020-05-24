package com.shobaki;

public class Main {

    public static void main(String[] args) {
//        System.out.println(1221 % 10);
//        System.out.println(1221 / 10);

        System.out.println(sumDigits(1221));
        System.out.println(isPalindrome(1221));
        System.out.println(firstAndLastDigitSum(1221));
        System.out.println(evenDigitSum(1221));

    }

    public static int sumDigits(int number) {
        int sum = 0;
        if (number < 10) {
            return -1;
        }
        while (number > 0) {
           // System.out.println(number);
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
    public static boolean isPalindrome(int number){
        if(number < 0){
            number *= -1;
        }
        int originalNumber = number;
        int reverseNumber = 0;

        while(number > 0){
            int digit = number % 10;
            reverseNumber = (reverseNumber * 10 ) + digit;
            number /= 10;
        }
        if(originalNumber == reverseNumber){
            return true;
        }
        return false;
    }

    public static int firstAndLastDigitSum(int number){
        if(number < 0){
            return -1;
        }
        if(number < 10){
            return number;
        }
        int firstDigit = number % 10;
        while(number > 0){
            if(number < 10){
                break;
            }else{
                number /=10;
            }
        }
        return firstDigit + number;

    }
    public static int evenDigitSum(int number){
        if(number < 0){
            return -1;
        }
        int sum = 0;

        while(number > 0){
            int digit = number % 10;
            if(digit % 2 == 0){
                sum += digit;
            }
            number /=10;
        }
        return sum;
    }
}

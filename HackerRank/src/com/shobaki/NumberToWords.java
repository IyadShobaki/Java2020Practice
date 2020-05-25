package com.shobaki;

public class NumberToWords {
    public static void main(String[] args) {
        numberToWords(123);
        numberToWords(1010);
        numberToWords(1000);
        numberToWords(-12);
    }
    public static void numberToWords(int number) {
        if(number < 0)
            System.out.println("Invalid Value");
        int original = number;
        number = reverse(number);
        int count =0;
        while(number > 0) {
            int digit = number % 10;
            switch (digit) {
                case 0:
                    System.out.println("Zero");
                    count++;
                    break;
                case 1:
                    System.out.println("One");
                    count++;
                    break;
                case 2:
                    System.out.println("Two");
                    count++;
                    break;
                case 3:
                    System.out.println("Three");
                    count++;
                    break;
                case 4:
                    System.out.println("Four");
                    count++;
                    break;
                case 5:
                    System.out.println("Five");
                    count++;
                    break;
                case 6:
                    System.out.println("Six");
                    count++;
                    break;
                case 7:
                    System.out.println("Seven");
                    count++;
                    break;
                case 8:
                    System.out.println("Eight");
                    count++;
                    break;
                case 9:
                    System.out.println("Nine");
                    count++;
                    break;
            }

            number /=10;
        }
        int total = getDigitCount(original) - count;
        if(total > 0)
            for(int i = 0; i < total; i++)
                System.out.println("Zero");

    }
    public static int reverse(int number) {
        boolean isNeg = false;
        if(number < 0) {
            number *= -1;
            isNeg = true;
        }

        int reverse =0;
        while(number >0) {
            int digit = number % 10;
            reverse = (reverse * 10) + digit;

            number /=10;
        }
        if(isNeg)
            return reverse * -1;



        return reverse;
    }
    public static int getDigitCount(int number) {
        if(number < 0)
            return -1;
        if(number == 0)
            return 1;
        int count =0;
        while(number >0) {
            count++;
            number /= 10;

        }
        return count;
    }
}

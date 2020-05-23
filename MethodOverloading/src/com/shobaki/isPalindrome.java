package com.shobaki;

import java.net.InetAddress;

public class isPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(1221));
        System.out.println("**************");
        System.out.println(isPalindrome("1221"));
    }

    public static boolean isPalindrome(int number){
        if(number < 0){
            number *= -1;
        }
        int originalNumber = number;
        int reverse = 0;

        while (number > 0){
            int digit = number %10;
            System.out.println(digit);
            reverse = (reverse * 10) + digit;

            number /= 10;
            System.out.println(number);
        }
        if(originalNumber == reverse){
            return true;
        }
        return false;
    }
    public static boolean isPalindrome(String str){


//        int number = Integer.parseInt(str);
//        System.out.println(number);


        char[] firstString = str.toCharArray();
        for(char a : firstString){
            System.out.println(a);
        }
        char[] secondString = new char[str.length()];
        int sec = firstString.length-1;
        for(int i =0; i < firstString.length; i++){
            secondString[i] = firstString[sec];
            sec--;
        }
        for(char a : secondString){
            System.out.println(a);
        }
        String f = new String(firstString);
        String s = new String(secondString);

        System.out.println(f);
        System.out.println(s);
        if(f.equals(s)){
            return true;
        }
        return false;
    }


}



package com.shobaki;

public class FlourPack {
    public static void main(String[] args) {
        System.out.println(canPack(1, 0, 4)); //false
        System.out.println(canPack(1, 0, 5)); //true
        System.out.println(canPack(0, 5, 4)); //true
        System.out.println(canPack(2, 2, 11)); //true
        System.out.println(canPack(-3, 2, 12)); //false
        System.out.println(canPack(0, 5, 6)); //false
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if(bigCount < 0 || smallCount < 0 || goal < 0)
            return false;
        bigCount *= 5;
        if(smallCount >= goal || (bigCount >0  && bigCount % goal == 0))
            return true;

        while(bigCount > goal) {
            bigCount -= 5;
        }
        if(smallCount >= (goal - bigCount))
            return true;

        return false;
    }
}
//HackerRank
package com.shobaki;

public class Main {

    public static void main(String[] args) {
        int [] height = new int[]{1,2,3,3,2};
        System.out.println(hurdleRace(1,height));//2

        int [] height2 = new int[]{1,6,3,5,2};
        System.out.println(hurdleRace(4,height2)); //2

        int [] height3 = new int[]{2,5,4,5,2};
        System.out.println(hurdleRace(7,height3)); //0

    }

    public static int hurdleRace(int k, int[] height) {
        int largeNumber = 0;

        for(int h : height){
            if(largeNumber < h){
                largeNumber = h;
            }
        }
//        System.out.println(largeNumber);
        if(largeNumber > k){
            return largeNumber - k;

        }
        return 0;

    }
}

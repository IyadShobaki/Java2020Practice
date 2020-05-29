package com.shobaki;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SockMerchant {
    public static void main(String[] args) {

        int[] colors = new int[]{1,2,1,2,1,3,2};
        System.out.println(sockMerchant1(7,colors)); //should be 2

        int[] colors1 = new int[]{10,20,20,10,10,30,50,10,20};
        System.out.println(sockMerchant1(9,colors1));//should be 3


        int[] colors2 = new int[]{4, 5, 5, 5, 6, 6, 4, 1, 4, 4, 3, 6, 6, 3, 6, 1, 4, 5, 5, 5};
        System.out.println(sockMerchant1(20,colors2));  //should be 9

        int[] colors3 = new int[]{1, 1, 3, 1, 2, 1, 3, 3, 3, 3};
        System.out.println(sockMerchant1(10,colors3));  //should be 4
    }


    public static int sockMerchant1(int n, int[] ar) {
        Arrays.sort(ar);
        int count=0;
        int counter =0;
        for(int i =0; i < ar.length; i++){
            counter++;
            if(i == ar.length-1){
                break;
            }
            if(ar[i] != ar[i+1] && counter % 2 != 0){
                counter--;
            }
            if(ar[i] == ar[i+1] && counter%2 !=0){
                count++;
            }

        }
        return count;
    }


    //old solution
    static int sockMerchant(int n, int[] ar) {

        int count =0;
        List<Integer> list = new ArrayList<>();
        int[] arr = new int[n];
        for(int i =0; i < ar.length; i++) {
            if(list.contains(ar[i])) {

            }else {
                list.add(ar[i]);

            }
        }

        int[] newArray = new int[list.size()];
        for(int i= 0; i < newArray.length; i++) {
            newArray[i] =0;
        }

        for(int i =0; i < list.size(); i++) {
            for(int j =0; j <n; j++) {
                if(ar[j] == list.get(i)) {
                    newArray[i]++;
                }
            }
        }

        for(int i =0; i < newArray.length; i++) {
            if(newArray[i] == 0) {
                while(newArray[i] > 0) {
                    count++;
                    newArray[i]-= 2;
                }
            }else {
                while(newArray[i] > 1) {
                    count++;
                    newArray[i]-= 2;
                }
            }

        }
        return count;
    }

}

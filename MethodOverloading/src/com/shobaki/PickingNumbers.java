package com.shobaki;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PickingNumbers {
    public static void main(String[] args) {
//        List<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(1);
//        list.add(2);
//        list.add(2);
//        list.add(4);
//        list.add(4);
//        list.add(5);
//        list.add(5);
//        list.add(5);
//        List<Integer> list = new ArrayList<>();
//        list.add(4);
//        list.add(6);
//        list.add(5);
//        list.add(3);
//        list.add(3);
//        list.add(1);
//        List<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(2);
//        list.add(2);
//        list.add(3);
//        list.add(1);
//        list.add(2);
//        System.out.println(pickingNumbers(list));

        int[] arr = {1,2,2,3,1,2};
        System.out.println(pickingNumbers(arr));

    }

    public static int pickingNumbers(List<Integer> a) {

        Collections.sort(a);
//        for(int number : a){
//            System.out.println(number);
//        }
        //int count = 0;
        int countOfCurrentArray = 1;
        int countOfLargestArray = 0;
        List<Integer> shortList = new ArrayList<>();
        for (int i = 0; i < a.size(); i++) {
            for (int j = i + 1; j < a.size(); j++) {
                if ((Math.abs((a.get(i) - a.get(j))) <= 1)) {
                    System.out.print(a.get(i) + " " + a.get(j) + "\n");
                    countOfCurrentArray++;
                }
                if (countOfCurrentArray > countOfLargestArray) {
                    countOfLargestArray = countOfCurrentArray;
                }

            }
            countOfCurrentArray = 1;
        }


        return countOfLargestArray;
    }

    public static int pickingNumbers(int[] a) {
        int[] count=new int[a.length-1];
        Arrays.sort(a);
        for(int i=0;i<a.length-1;i++){
            ArrayList<Integer> arr = new ArrayList<Integer>();
            arr.add(a[i]);
            for(int j=i+1;j<a.length;j++){
                if(Math.abs(a[i]-a[j])==0||Math.abs(a[i]-a[j])==1){
                    arr.add(a[j]);
                }

            }
            count[i]=arr.size();
        }
        Arrays.sort(count);
        return count[count.length-1];
    }
}

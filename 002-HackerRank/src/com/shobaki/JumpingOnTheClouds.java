package com.shobaki;


//Any valid test case starts with 0 and has no consecutive 1s.

public class JumpingOnTheClouds {
    public static void main(String[] args) {
        int[] arr = new int[] {0,0,1,0,0,1,0};
        System.out.println(jumpingOnClouds(arr)); //should be 4
        //internet solution
        System.out.println(jumpingOnClouds1(arr));

        int[] arr1 = new int[] {0, 0, 0, 0, 1, 0};
        System.out.println(jumpingOnClouds(arr1)); //should be 3

        System.out.println(jumpingOnClouds1(arr1));

        int[] arr2 = new int[] {0, 1, 0, 0, 0, 1, 0};
        System.out.println(jumpingOnClouds(arr2)); //should be 3

        System.out.println(jumpingOnClouds1(arr2));

        int[] arr3 = new int[] {0, 0, 0, 1, 0, 0};
        System.out.println(jumpingOnClouds(arr3)); //should be 3

        //internet solution
        System.out.println(jumpingOnClouds1(arr3));
    }

    public static int jumpingOnClouds(int[] c) {

        int count =0;
        int jump =0;

        for(int i =0; i < c.length; i++){
            if(c[i] == 0){
                count++;
            }
            if(i == c.length-1 && count==2){
                jump++;
                break;
            }
            if(count == 3){
                jump++;
                count= 1;
                continue;
            }

            if(c[i] == 1 && count ==1){
                count=0;
                jump++;
            }
            if(c[i]==1 && count ==2){
                count=0;
                jump+=2;
            }
        }
        return jump;
    }
    //internet solution
    public static int jumpingOnClouds1(int[] c) {
        int count = -1;
        for (int i = 0; i < c.length; i++, count++) {
            if (i < c.length - 2 && c[i + 2] == 0) i++;
        }
        return count;
    }
}

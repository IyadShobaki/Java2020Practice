package com.shobaki;

//2D Array - DS
public class HourGlassSum {
    public static void main(String[] args) {
        int[][] arr = new int[][]{
                {1, 1, 1, 0, 0, 0},
                {0, 1, 0, 0, 0, 0},
                {1, 1, 1, 0, 0, 0},
                {0, 0, 2, 4, 4, 0},
                {0, 0, 0, 2, 0, 0},
                {0, 0, 1, 2, 4, 0}};
        System.out.println(hourglassSum(arr));//19

        int[][] arr1 = new int[][]{
                {-9, -9, -9, 1, 1, 1},
                {0, -9, 0, 4, 3, 2},
                {-9, -9, -9, 1, 2, 3},
                {0, 0, 8, 6, 6, 0},
                {0, 0, 0, -2, 0, 0},
                {0, 0, 1, 2, 4, 0}};
        System.out.println(hourglassSum(arr1));//28

        int[][] arr2 = new int[][]{
                {1, 1, 1, 0, 0, 0},
                {0, 1, 0, 0, 0, 0},
                {1, 1, 1, 0, 0, 0},
                {0, 9, 2, -4, -4, 0},
                {0, 0, 0, -2, 0, 0},
                {0, 0, -1, -2, -4, 0}};
        System.out.println(hourglassSum(arr2));//13

        int[][] arr3 = new int[][]{
                {0, -4, -6, 0, -7, -6},
                {-1, -2, -6, -8, -3, -1},
                {-8, -4, -2, -8, -8, -6},
                {-3, -1, -2, -5, -7, -4},
                {-3, -5, -3, -6, -6, -6},
                {0, -3, -6, 0, -8, -6, -7}};
        System.out.println(hourglassSum(arr3));//-19


    }

    static int hourglassSum(int[][] arr) {

        int sum = 0;
        int total = Integer.MIN_VALUE;
        int d = 0;
        while (d < 4) {
            int k = 0;
            while (k < 4) {
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {

                        if((i == 1 && j == 0) || (i ==1 && j ==2)){
                           // System.out.print("-");
                        }else{
                            sum += arr[i + d][j + k];
                           // System.out.print(arr[i + d][j + k]);
                        }

                    }

                   // System.out.println();
                }
                //System.out.println(sum);
                if(sum > total){
                    total = sum;
                }
                sum = 0;
                k++;
               //System.out.println();
            }

            d++;
        }


        System.out.println();
        return total;

    }

}

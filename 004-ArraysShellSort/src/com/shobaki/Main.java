package com.shobaki;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = {20, 35, -15, 7, 55, 1, -22};
        //Shell sort:
        //variation of Insertion sort
        //Insertion sort chooses which element to insert using a gap of 1
        //Shell sort starts out using a larger gap value
        //as the algorithm runs, the gap is reduced
        //the goal is to reduce the amount of shifting required
        //the last gap value is always 1 and then the sort will become Insertion sort
        //by the time we get to insertion sort, the array has been partially sorted and less shifting required
        //At wikipedia under Shell sort page. There are different gap value we can choose.
        //Each gap value can influence (the time complexity differently) or how many steps the algorithm requires.
        //There are a number of ways we can calculate the gap value. One really common sequence is Knuth sequence.
        //Knuth sequence:
        //Gap is calculated using (3 to the power of k - 1) / 2
        //we set k based on the length of the array (the gap should be close as possible to the length but not greater)

        //-In-place algorithm
        //Worst case ( O for n squared ) time complexity, but its varies depend on the gap
        //unstable algorithm

        //we can improve bubble sort using shell sort  -- using gaps  //I think will make bubble sort unstable

        for(int gap = arr.length /2; gap > 0; gap /= 2){
            for(int i = gap; i < arr.length; i++){
                int newElement = arr[i];

                int j = i;
                while(j >= gap && arr[j-gap] > newElement){
                    arr[j] = arr[j - gap];
                    j -= gap;
                }
                arr[j] = newElement;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}

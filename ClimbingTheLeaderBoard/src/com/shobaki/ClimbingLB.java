package com.shobaki;

import java.util.Arrays;

public class ClimbingLB {
    public static void main(String[] args) {
        int[] scores = new int[]{100, 100, 50, 40, 40, 20, 10};//DESC
        int[] aliceScores = new int[]{5, 25, 50, 120};//ASC
        System.out.println(Arrays.toString(climbingLeaderboard(scores, aliceScores)));
        //[6, 4, 2, 1] the right answer

        int[] scores1 = new int[]{100, 90, 90, 80, 75, 60};//DESC
        int[] aliceScores1 = new int[]{50, 65, 77, 90, 102};//ASC
        System.out.println(Arrays.toString(climbingLeaderboard(scores1, aliceScores1)));
        //[6, 5, 4, 2, 1] the right answer
    }

    public static int[] climbingLeaderboard(int[] scores, int[] alice) {

        int[] result = new int[alice.length];
        int position = 1;
        int start = 0;
        int count=0;
        for (int i = alice.length - 1; i >= 0; i--) {

            for (int j = start; j < scores.length; j++) {

                if(i < alice.length-1){
                    if(alice[i] == alice[i+1]){
                        result[i] = position;
                        break;
                    }
                }
                if (alice[i] > scores[0]) {
                    result[i] = 1;
                    start++;
                    break;
                }

                if (alice[i] == scores[j]) {
                    count++;
                    if(count>1){
                        continue;
                    }
                    result[i] = position;
                    start = j;
                    position++;
                    break;
                }

                if (j == scores.length - 1) {
                    if (alice[i] < scores[j]) {
                        result[i] = position + 1;
                        break;
                    }
                }else{
                    if (alice[i] < scores[j]) {
                        count = 0;
                        if (scores[j] != scores[j-1]) {
                            position++;
                        }
                      continue;
                    }
                }
                if (alice[i] > scores[j]) {
                    count =0;
                    result[i] = position;
                    start = j;
                    //position++;
                    break;
                }
            }
        }
        return result;
    }
}

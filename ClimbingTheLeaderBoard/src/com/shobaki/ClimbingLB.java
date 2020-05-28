package com.shobaki;

import java.util.Arrays;

public class ClimbingLB {
    public static void main(String[] args) {
        int[] scores = new int[]{100, 100, 50, 40, 40, 20, 10};//DESC
        int[] aliceScores = new int[]{5, 25, 50, 120};//ASC
        System.out.println(Arrays.toString(climbingLeaderboard(scores, aliceScores)));
        //[6, 4, 2, 1] the right answer
//
        int[] scores1 = new int[]{100, 90, 90, 80, 75, 60};//DESC
        int[] aliceScores1 = new int[]{50, 65, 77, 90, 102};//ASC
        System.out.println(Arrays.toString(climbingLeaderboard(scores1, aliceScores1)));
        //[6, 5, 4, 2, 1] the right answer
//
        int[] scores2 = new int[]{100, 90, 90, 80, 75, 60};//DESC
        int[] aliceScores2 = new int[]{85, 90, 90, 100, 100, 102, 102};//ASC
        System.out.println(Arrays.toString(climbingLeaderboard(scores2, aliceScores2)));
        //[3, 2, 2, 1, 1, 1, 1]
    }
    // 9/12 test cases failed :(    HackerRank

    public static int[] climbingLeaderboard(int[] scores, int[] alice) {

        int[] result = new int[alice.length];
        int position = 0;
        int start = 0;
        int count = 0;
        for (int i = alice.length - 1; i >= 0; i--) {

            for (int j = start; j < scores.length; j++) {

                if (alice[i] >= scores[0]) {
                    result[i] = 1;
                    break;
                }

                if (j != scores.length - 1) {
                    position++;
                    if (j > 0) {
                        if (scores[j] == scores[j - 1]) {
                            position--;
                        }
                    }
                    if (alice[i] < scores[j] && alice[i] > scores[j + 1]) {
                        count = 0;
                        result[i] = position;
                        start = j+1;
                        break;
                    }
                    if (alice[i] == scores[j]) {
                        count++;
                        if (count > 1) {
                            position--;
                            result[i] = position;
                            start = j;
                            break;
                        }
                        result[i] = position;
                        start = j;
                        break;
                    }
                }else{
                    if(alice[i] >= scores[j]){
                        result[i] = position;
                        break;
                    }
                    result[i] = position+1;
                    break;
                }

            }
        }
        return result;
    }
}


//
//                if (j == scores.length - 1) {
//                    if (alice[i] < scores[j]) {
//                        result[i] = position + 1;
//                        break;
//                    }
//                }else{
//                    if (alice[i] < scores[j]) {
//                        count = 0;
//                        if (scores[j] != scores[j-1]) {
//                            position++;
//                        }
//                      continue;
//                    }
//                }
//                if (alice[i] > scores[j]) {
//                    count =0;
//                    result[i] = position;
//                    start = j;
//                    //position++;
//                    break;
//                }
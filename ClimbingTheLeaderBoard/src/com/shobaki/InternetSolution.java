package com.shobaki;

import java.util.Arrays;

public class InternetSolution {
    public static void main(String[] args) {
        int[] scores = new int[]{100, 100, 50, 40, 40, 20, 10};//DESC
        int[] aliceScores = new int[]{5, 25, 50, 120};//ASC
        System.out.println(Arrays.toString(climbingLeaderboard(scores, aliceScores)));

        int[] scores1 = new int[]{100, 90, 90, 80, 75, 60};//DESC
        int[] aliceScores1 = new int[]{50, 65, 77, 90, 102};//ASC
        System.out.println(Arrays.toString(climbingLeaderboard(scores1,aliceScores1)));
    }
    // Complete the climbingLeaderboard function below.
    static int[] climbingLeaderboard(int[] scores, int[] alice) {

        int previousScore = -1;
        int startPosition = scores.length-1; // To remember position on leaderboard
        int[] leaderboard = new int[scores.length];

        // Remove duplicates from scores and add to leaderboard
        for (int i = 0, j = 0; i < scores.length; i++, j++) {
            if (scores[i] != previousScore) {
                leaderboard[j] = scores[i];
            }
            else {
                j--;
                startPosition--;
            }
            previousScore = scores[i];
        } // end for


        final int LOWEST_RANK = startPosition +2;
        final int LOWEST_SCORE = leaderboard[startPosition];

        for (int i = 0; i < alice.length; i++) {
            // If Alice's score is >= top score
            if (alice[i] >= leaderboard[0]) {
                alice[i] = 1; // Alice's rank is 1
                continue;
            }
            // If Alice's score is < the lowest score
            if (alice[i] < LOWEST_SCORE) {
                alice[i] = LOWEST_RANK; // Alices's rank is the lowest rank
                continue;
            }
            // Start at end of leaderboard and work back
            for (int j = startPosition; j >=0; j--) {
                // If Alice's score > current leaderboard score
                if (alice[i] > leaderboard[j]) {
                    continue; // Move on to next leaderboard score
                }
                if (alice[i] == leaderboard[j]) {
                    alice[i] = (j+1); // Alice's rank is index position + 1
                }
                else {
                    alice[i] = (j+2); // Alice's rank is index position + 2
                }
                startPosition = j;
                break;
            } // end inner for
        } // end outer for
        return alice;
    } // end climbingLeaderboard

}

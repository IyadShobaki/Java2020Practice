package com.shobaki;

public class Main {

    public static void main(String[] args) {
        int newScore= calculateScore("Iyad", 500);
        System.out.println("New score is "+ newScore);

        int newScore1 = calculateScore(75);
        System.out.println("New score is " + newScore1 );

    }

    public static int calculateScore(String playerName, int score){
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }
    public static int calculateScore(int score){
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }
}

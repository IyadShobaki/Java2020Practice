package com.shobaki;

public class Methods {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        displayHighScorePosition("Iyad", calculateHighScorePosition(1500));
        displayHighScorePosition("Tim", calculateHighScorePosition(900));
        displayHighScorePosition("John", calculateHighScorePosition(400));
        displayHighScorePosition("Jane", calculateHighScorePosition(50));

    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){
        if(gameOver){
            int finalScore = score + ( levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }

        return -1;
    }
    public static void displayHighScorePosition(String playerName, int position){
        System.out.println(playerName + " managed to get into position "
                + position + " on the high score table");
    }
    public static int calculateHighScorePosition(int score){
//        if(score >= 1000){
//            return 1;
//        }else if(score >= 500){
//            return 2;
//        }else if(score >=100){
//            return 3;
//        }
//
//        return 4;
        int position = 4;
        if(score >= 1000){
            position =1;
        }else if(score >= 500){
            position =2;
        }else if(score >= 100){
            position=3;
        }

        return position;
    }

}

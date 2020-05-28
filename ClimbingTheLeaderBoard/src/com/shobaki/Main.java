
//HackerRank
package com.shobaki;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static int start;

    public static void main(String[] args) {
        int[] scores = new int[]{100, 100, 50, 40, 40, 20, 10};//DESC
        int[] aliceScores = new int[]{5, 25, 50, 120};//ASC
        System.out.println(Arrays.toString(climbingLeaderboard(scores, aliceScores)));
        //[6, 4, 2, 1] the right answer

        int[] scores1 = new int[]{100, 90, 90, 80, 75, 60};//DESC
        int[] aliceScores1 = new int[]{50, 65, 77, 90, 102};//ASC
        System.out.println(Arrays.toString(climbingLeaderboard(scores1,aliceScores1)));
        //[6, 5, 4, 2, 1] the right answer
    }

    public static int[] climbingLeaderboard(int[] scores, int[] alice) {

        //
        start = 0;
        int[] result = new int[alice.length];
        for (int i = 0; i < alice.length; i++) {
            result[i] = getPosition(alice[i], scores);
        }
        sortAndReserved(result);
        return result;
    }

    public static int getPosition(int score, int[] scores) {


        int[] newScores = new int[scores.length + 1 - start];
        newScores[0] = score;
        int d = 0;
        for (int i = 1; i < newScores.length; i++) {
            newScores[i] = scores[d];
            d++;
        }


        sortAndReserved(newScores);


        List<Integer> positions = new ArrayList<>();
        int f = 1;
        int h = 1;
        for (int i = 0; i < newScores.length - 1; i++) {
            positions.add(f);

            if (newScores[i] != newScores[h]) {
                f++;
            }
            if (h == newScores.length - 1) {
                positions.add(f);
            }

            h++;
        }


        return positions.get(getPos(newScores, score));

    }

    public static int getPos(int[] newScores, int score) {
        int pos = 0;
        for (int i = 0; i < newScores.length; i++) {
            if (newScores[i] == score) {
                pos = i;
            }
        }
        start = newScores.length - 1 - pos;
        return pos;
    }


    public static int[] sortAndReserved(int[] array) {
        Arrays.sort(array);
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
        return array;
    }

}

//second attempt    // same result Your code did not execute within the time limits
////HackerRank
//package com.shobaki;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//public class Main {
//
//    public static void main(String[] args) {
//        int[] scores = new int[]{100, 100, 50, 40, 40, 20, 10};//DESC
//        int[] aliceScores = new int[]{5, 25, 50, 120};//ASC
//        System.out.println(Arrays.toString(climbingLeaderboard(scores,aliceScores)));
//        //[6, 4, 2, 1]
//
////        int[] scores1 = new int[]{100, 90, 90, 80, 75, 60};//DESC
////        int[] aliceScores1 = new int[]{50, 65, 77, 90, 102};//ASC
////        System.out.println(Arrays.toString(climbingLeaderboard(scores1,aliceScores1)));
////        //[6, 5, 4, 2, 1]
//    }
//    public static int start = 0;
//    public static int[] climbingLeaderboard(int[] scores, int[] alice) {
//
//        int[] result = new int[alice.length];
//        for(int i=0; i < alice.length; i++){
//                result[i] = getPosition(alice[i], scores);
//            System.out.println("  =  " + result[i]);
//        }
//
//        sortAndReserved(result);
//        return result;
//    }
//
//    public static int getPosition(int score, int[] scores){
//
////        int[] newScores = new int[scores.length + 1];
////        System.arraycopy(scores,0,newScores,0,scores.length);
////        newScores[newScores.length-1] = score;
////
//////        for(int a : newScores){
//////            System.out.print(a + ", " );
//////
//////        }
//
//        //System.out.println();
//
//        int[] newScores = new int[scores.length+1 - start];
//        newScores[0] = score;
//        int d= 0;
//        for(int i =1; i< newScores.length; i++){
//            newScores[i] = scores[d];
//            d++;
//        }
//
//        sortAndReserved(newScores);
//
//        for (int a : newScores) {
//            System.out.print(a + ", ");
//            System.out.println();
//        }
//
//        List<Integer> positions = new ArrayList<>();
//        int f = 1;
//        int h = 1;
//        for(int i =0; i< newScores.length-1; i++){
//            positions.add(f);
//
//            if (newScores[i] != newScores[h]) {
//                f++;
//            }
//            if(h == newScores.length-1){
//                positions.add(f);
//            }
//
//            h++;
//        }
//
//        for(int a : positions){
//            System.out.print(a + " ");
//        }
////        int pos = 0;
////        for(int i=0; i< newScores.length; i++){
////            if(newScores[i] == score){
////                pos = i;
////            }
////        }
//        return positions.get(getPos(newScores, score));
//
//    }
//    public static int getPos(int[] newScores, int score){
//        int pos = 0;
//        for(int i=0; i< newScores.length; i++){
//            if(newScores[i] == score){
//                pos = i;
//            }
//        }
//        start = newScores.length-1-pos;

//        System.out.println("Pos " + pos);
//        System.out.println("start " + start);
//        return pos;
//    }
//
//
//    public static int[] sortAndReserved(int[] array){
//        Arrays.sort(array);
//        for(int i=0; i<array.length/2; i++){
//            int temp = array[i];
//            array[i] = array[array.length -i -1];
//            array[array.length -i -1] = temp;
//        }
////        int[] allScoresReversed = new int[array.length];
////        int d= 0;
////        for(int i = array.length-1; i>=0; i--){
////            allScoresReversed[d] = array[i];
////            d++;
////        }
////        return allScoresReversed;
//        return array;
//    }
//
//}


//The following solution work is fine but HackerRank message is for Test case 6,7,8, and 9:
//Your code did not execute within the time limits

////HackerRank
//package com.shobaki;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//public class Main {
//
//    public static void main(String[] args) {
//        int[] scores = new int[]{100, 100, 50, 40, 40, 20, 10};//DESC
//        int[] aliceScores = new int[]{5, 25, 50, 120};//ASC
//        System.out.println(Arrays.toString(climbingLeaderboard(scores,aliceScores)));
//        //[6, 4, 2, 1]
//
//        int[] scores1 = new int[]{100, 90, 90, 80, 75, 60};//DESC
//        int[] aliceScores1 = new int[]{50, 65, 77, 90, 102};//ASC
//        System.out.println(Arrays.toString(climbingLeaderboard(scores1,aliceScores1)));
//        //[6, 5, 4, 2, 1]
//    }
//
//    public static int[] climbingLeaderboard(int[] scores, int[] alice) {
//
//        int[] result = new int[alice.length];
//        for(int i=0; i < alice.length; i++){
//            result[i] = getPosition(alice[i], scores);
//        }
//
//        sortAndReserved(result);
//        return result;
//    }
//
//    public static int getPosition(int score, int[] scores){
//        int[] newScores = new int[scores.length+1];
//        newScores[0] = score;
//        int d= 0;
//        for(int i =1; i< newScores.length; i++){
//            newScores[i] = scores[d];
//            d++;
//        }
//        sortAndReserved(newScores);
//
//        List<Integer> positions = new ArrayList<>();
//        int f = 1;
//        int h = 1;
//        for(int i =0; i< newScores.length-1; i++){
//
//            positions.add(f);
//            if (newScores[i] != newScores[h]) {
//                f++;
//            }
//            if(h == newScores.length-1){
//                positions.add(f);
//            }
//            h++;
//
//        }
////        for(int a : positions){
////            System.out.print(a + " ");
////        }
//        int pos = 0;
//        for(int i=0; i< newScores.length; i++){
//            if(newScores[i] == score){
//                pos = i;
//            }
//        }
//        return positions.get(pos);
//
//    }
//
//
//    public static int[] sortAndReserved(int[] array){
//        Arrays.sort(array);
//        for(int i=0; i<array.length/2; i++){
//            int temp = array[i];
//            array[i] = array[array.length -i -1];
//            array[array.length -i -1] = temp;
//        }
////        int[] allScoresReversed = new int[array.length];
////        int d= 0;
////        for(int i = array.length-1; i>=0; i--){
////            allScoresReversed[d] = array[i];
////            d++;
////        }
////        return allScoresReversed;
//        return array;
//    }
//
////    public static int[] mergeTwoArrays(int[] first, int[] second){
////        int[] allScores = new int[first.length + second.length];
////
////        for(int i=0; i< allScores.length; i++){
////            if(i == first.length){
////                int k = i;
////                for(int j =0; j < second.length; j++){
////                    allScores[k] = second[j];
////                    i++;
////                    k++;
////                }
////            }else{
////                allScores[i] = first[i];
////            }
////        }
////
////
////
////        return allScores;
////    }
//}

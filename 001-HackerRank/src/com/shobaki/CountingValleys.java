package com.shobaki;

public class CountingValleys {
    public static void main(String[] args) {
        String string = "UDDDUDUU";
        System.out.println(countingValleys1(8,string));

        String string1 = "DDUUUUDD";
        System.out.println(countingValleys1(8,string1));

        String string2 = "DDUUDDUDUUUD";
        System.out.println(countingValleys1(12,string2));
    }


    public static int countingValleys1(int n, String s) {
        char[] steps = s.toCharArray();

        int vally = 0;
        int counter =0;
        boolean isVally = false;
        for(char a : steps){
            if(a == 'D'){
                counter--;
            }
            if(a == 'U'){
                counter++;
            }
            if(counter == -1 && !isVally){
                isVally = true;
                vally++;
            }
            if(counter ==0 && isVally){
                isVally = false;
            }
        }

        return vally;
    }

    //old solution
    public static int countingValleys(int n, String s) {
        int count =0;
        int val =0;
        boolean down = false;
        boolean up = false;
        for(int i =0; i < n; i++) {
            if(s.charAt(i) == 'U') {
                val++;
            }
            if(s.charAt(i) == 'D') {
                val--;
            }
            if(val <0) {
                down = true;
            }
            if(val == -1 && down && !up) {
                up = true;
                count++;
            }
            if(val >= 0 ) {
                up = false;
            }


        }

        return count;

    }
}

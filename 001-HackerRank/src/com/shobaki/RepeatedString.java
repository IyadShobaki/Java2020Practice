package com.shobaki;

public class RepeatedString {
    public static void main(String[] args) {
        String string = "aba";
        System.out.println(repeatedString(string, 10));  //should be 7

        try{
            String string1 = "a";
            System.out.println(repeatedString(string1, 1000000000000L));//should be 1000000000000
        }catch (OutOfMemoryError e){
            e.printStackTrace();
        }


        String string2 = "abcac";
        System.out.println(repeatedString(string2, 10));//should be 4
    }

    public static long repeatedString(String s, long n) {
        while(s.length() <n ){
            s = s.concat(s);

        }
        System.out.println(s);
        long count =0;
        for(int i =0; i < n; i++){
            if(s.charAt(i) == 'a'){
                count++;
            }
        }
        return count;
    }
}

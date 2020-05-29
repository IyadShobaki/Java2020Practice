package com.shobaki;

public class RepeatedString {
    public static void main(String[] args) {
        String string = "aba";
        System.out.println(repeatedString(string, 10));  //should be 7
        System.out.println(10 /string.length());
        System.out.println(10%string.length());


        String string1 = "a";
        System.out.println(repeatedString(string1, 1000000000000L));//should be 1000000000000


        String string2 = "abcac";
        System.out.println(repeatedString(string2, 10));//should be 4

        String string3 = "aadcdaccacabdaabadadaabacdcbcacabbbadbdadacbdadaccbbadbdcadbdcacacbcacddbcbbbaaccbaddcabaacbcaabbaaa";
        System.out.println(repeatedString(string3, 942885108885L));//should be 330009788107

        System.out.println(942885108885L / string3.length());
        System.out.println(942885108885L % string3.length());
        System.out.println(string3.length());
    }

    public static long repeatedString(String s, long n) {

        long aCount = 0L;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                aCount++;
            }
        }

        long l = n / s.length();
        long p = aCount * l ;
        for(int i=0; i< (n%s.length()); i++){
            if(s.charAt(i) == 'a'){
                p++;
            }
        }

        return p;

//
//        while (s.length() < n) {
//            s = s.concat(s);
//
//        }
//        System.out.println(s);
//        long count = 0L;
//        for (int i = 0; i < n; i++) {
//            if (s.charAt(i) == 'a') {
//                count++;
//            }
//        }
//        return count;
        }
    }


    //internet solution
//        char[] chrIn = s.toCharArray();
//        int i = 0;
//        long max = 0;
//        long quo = n / chrIn.length;
//        long rem = n % chrIn.length;
//        while (i < chrIn.length) {
//            if (chrIn[i] == 'a') {
//                max++;
//            }
//            i++;
//        }
//        i = 0;
//        max = max * quo;
//        while (i < rem) {
//            if (chrIn[i] == 'a') {
//                max++;
//            }
//            i++;
//        }
//        return max;
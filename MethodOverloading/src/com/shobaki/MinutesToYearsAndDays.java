package com.shobaki;

public class MinutesToYearsAndDays {
    public static void main(String[] args) {
        printYearsAndDays(527045L);
        printYearsAndDays(525605L);
        printYearsAndDays(525600L);
        printYearsAndDays(1445L);
        printYearsAndDays(1440L);
        printYearsAndDays(300L);
        printYearsAndDays(-1L);

    }

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
            return;
        }
        long years = minutes / 525600;
        long remainingMinutesFromYears = minutes % 525600;
        long days = minutes / 1440;
        long remainingMinutesFromDays = minutes % 1440;

        if (years >= 1) {
            days = remainingMinutesFromYears / 1440;
            if (days >= 1){
                remainingMinutesFromDays = remainingMinutesFromYears % 1440;
                System.out.println(minutes + " min = " + years + " y and " + days + " d "
                        + remainingMinutesFromDays + " minutes");
            }else{

                System.out.println(minutes + " min = " + years + " y and " + days + " d "
                        + remainingMinutesFromYears + " minutes");
            }

        }else{
            if(days >= 1){
                System.out.println(minutes + " min = " + years + " y and " + days + " d "
                        + remainingMinutesFromDays + " minutes");
            }else{
                System.out.println(minutes + " min = " + years + " y and " + days + " d "
                        + minutes + " minutes");
            }
        }

    }
}

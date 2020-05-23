package com.shobaki;

public class SecondsAndMinutes {
    public static void main(String[] args) {
        System.out.println(getDurationString(150, 9));
        System.out.println(getDurationString(3945));
    }
    public static String getDurationString(int minutes, int seconds){
        if(minutes < 0 || seconds < 0 || seconds > 59){
            return "Invalid Value";
        }
        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;

        String stringHours = hours < 10 ? "0"+hours : "" + hours;
        String stringMinutes = remainingMinutes < 10 ? "0"+remainingMinutes : "" + remainingMinutes;
        String stringSeconds = seconds < 10 ? "0"+seconds : ""+seconds;

        return String.format("%sh %sm %ss", stringHours, stringMinutes, stringSeconds);
    }
    public static String getDurationString( int seconds){
        if(seconds < 0){
            return "Invalid Value";
        }
        int minutes = seconds /60;
        int remainingSeconds = seconds % 60;
        return getDurationString(minutes, remainingSeconds);
    }
}

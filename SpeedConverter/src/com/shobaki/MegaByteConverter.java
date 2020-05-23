package com.shobaki;

public class MegaByteConverter {
    public static void main(String[] args) {

    }
    public static void megaBytesAndKiloBytes(int kiloBytes){
        if(kiloBytes < 0){
            System.out.println("Invalid Value");
        }else{
            int remainder = kiloBytes % 1024;
            int megaBytes = kiloBytes / 1024;
            System.out.println(kiloBytes + " KB = "  + megaBytes + "MB and " + remainder + " KB" );
        }
    }
}

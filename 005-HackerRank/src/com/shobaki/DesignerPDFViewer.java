package com.shobaki;

public class DesignerPDFViewer {
    public static void main(String[] args) {
        int[] heights = {1,3,1,3,1,4,1,3,2,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5};
        String word = "abc";
        System.out.println(designerPdfViewer(heights,word));

        int[] heights1 = {1,3,1,3,1,4,1,3,2,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,7};
        String word1 = "zaba";
        System.out.println(designerPdfViewer(heights1,word1));
    }


    public static int designerPdfViewer(int[] h, String word) {
        char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l',
        'm','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        char[] arr = word.toCharArray();

        int count =0;
        int tallestLetter =0;
        for(int j =0; j < arr.length; j++){
            for(int i =0; i< alphabet.length; i++){
                if(arr[j] == alphabet[i]){
                    count = h[i];
                }
            }
            if(tallestLetter < count){
                tallestLetter = count;
            }
        }

        return word.length() * tallestLetter;
    }
}

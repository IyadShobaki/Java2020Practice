package com.shobaki;

public class NewYearChaos {
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 3, 4};  //3
        minimumBribes(arr);

        int[] arr1 = {2, 5, 1, 3, 4}; // Too chaotic
        minimumBribes(arr1);

        int[] arr2 = {5, 1, 2, 3, 7, 8, 6, 4}; //Too chaotic
        minimumBribes(arr2);

        int[] arr3 = {1, 2, 5, 3, 7, 8, 6, 4}; // 7
        minimumBribes(arr3);

        int[] arr4 = {1, 2, 5, 3, 4, 7, 8, 6}; // 4
        minimumBribes(arr4);
    }


    public static void minimumBribes(int[] q) {

        int swapCount = 0;
        for (int i = q.length - 1; i >= 0; i--) {
            if (q[i] != i + 1) {
                if (((i - 1) >= 0) && q[i - 1] == (i + 1)) {
                    swapCount++;
                    swap(q, i, i - 1);
                } else if (((i - 2) >= 0) && q[i - 2] == (i + 1)) {
                    swapCount += 2;
                    swap(q, i - 2, i - 1);
                    swap(q, i - 1, i);
                } else {
                    System.out.println("Too chaotic");
                    return;
                }
            }
        }

        for (int a : q) {
            System.out.print(a + ", ");
        }
        System.out.println();
        System.out.println(swapCount);
    }

    private static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

//    public static void minimumBribes(int[] q) {
//
//
//        int count = 0;
//        for(int i=0; i< q.length; i++){
//            if(q[i] - (i+1) > 2){
//                System.out.println("Too chaotic");
//                return;
//            }
//            for(int j=i+1; j< q.length; j++){
//                if(q[i] > q[j]){
//                    int temp = q[j];
//                    q[j] = q[i];
//                    q[i] = temp;
//                    count++;
//                }
//            }
//        }
//
//        System.out.println(count);
//
//
//    }

//    public static void minimumBribes(int[] q) {
//        int count = 0;
//        boolean tooChaotic= false;
//        for(int i=0; i< q.length; i++){
//
//            if(q[i] - (i+1) <= 0){
//                continue;
//            }
//            if(q[i] - (i+1) == 1){
//                count++;
//
//            }
//            if(q[i] - (i+1) == 2){
//                count+=2;
//            }
//            if(q[i] - (i+1) > 2){
//                tooChaotic = true;
//                break;
//            }
//        }
//        if(tooChaotic){
//            System.out.println("Too chaotic");
//            return;
//        }
//        System.out.println(count);
//
//
//    }
}

package com.shobaki;

public class Main {

    public static void main(String[] args) {
	  //  int[] arr = {1,2,3,4,5,6,7,8,9};
	    //position 2 is a peak if arr[1] >= arr[0] && arr[1] >= arr[2]
        //position 9 is a peak if arr[8] >= arr[7]
        //look at n/2 elements
        //worst case complexity 0(n) theta n, because you may have to look at all n elements.

        //another solution to reduce complexity is using recursive // dividing conquer algorithm
        //1 ,2, ... , (n/2-1), (n/2) , (n/2+1) , ... , n-1, n
        //look at position n/2. if a[n/2] < a[n/2-1] then only look at
        //left half 1,...,n/2-1 to look for a peak
        //else if a[n/2] < a[n/2+1] then look at right half ... n/2+1 , n for a peak
        //else n/2 position is a peak
        //T(n) = T(n/2) + 0(1) theta 1 --> T(1) = 0(1) --> T(n) = 0(1) + ... + 0(1) = 0(log2n)

        int[] arr = {1,2,3,1}; // peak element is index number 2 (3)
        int[] arr1  ={1,2,1,3,5,6,4}; //peak element either index 1 (2) or 5 (6)
        System.out.println(findPeakElement(arr));
        System.out.println(findPeakElement(arr1));
    }
    //binary search
    public static int findPeakElement(int[] nums){
        int left = 0;
        int right = nums.length-1;
        while(left < right){
            int mid = left + (right - left) /2;
            if(nums[mid] < nums[mid+1]){
                left = mid +1;
            }else{
                right = mid;
            }
        }
        return left;
    }
}

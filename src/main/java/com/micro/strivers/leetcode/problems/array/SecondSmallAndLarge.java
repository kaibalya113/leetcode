package com.micro.strivers.leetcode.problems.array;

public class SecondSmallAndLarge {
    public static void main(String[] args){
        //Problem Statement:
        // Given an array, find the second smallest and second largest element in the array.
        // Print ‘-1’ in the event that either of them doesn’t exist.

        int[] arr = {1,2,4,7,7,5};
        int max = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int small = Integer.MAX_VALUE;
        int small2 = Integer.MAX_VALUE;
        for(int i =0; i<arr.length;i++){
            if(arr[i] > max){
                max2 = max;
                max = arr[i];
            }else if (arr[i] > max2 && arr[i] != max){
                max2 = arr[i];
            }

        }
        for(int i =0; i<arr.length;i++){
            if(small > arr[i] ){
                small2 = small;
                small = arr[i];
            }else if(arr[i] < small2 && arr[i] != small){
                small2 = arr[i];
            }
        }
        System.out.println("largest No: "+max+" And 2nd largest No: "+ max2);
        System.out.println("Smallest No: "+small+" And 2nd Smallest No: "+ small2);
    }
}

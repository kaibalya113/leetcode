package com.micro.strivers.leetcode.problems.array;

public class LargestElement {
    public static void main(String[] args){
        //Problem Statement:
        // Given an array, we have to find the largest element in the array.
        int arr[] = {2,5,1,3,10};
        int max = arr[0];
        for(int i =0; i<arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        System.out.println(max);


    }
}

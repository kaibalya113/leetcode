package com.micro.strivers.leetcode.problems.array;

public class RemoveDuplicate {
    public static void main(String[] args){
       // Problem Statement:
        // Given an integer array sorted in non-decreasing order,
        // remove the duplicates in place such that each unique element appears only once.
        // The relative order of the elements should be kept the same.

        int[] arr = {1,1,2,2,2,3,3};
        int prevArr = 0;
        int count=0;
        int[] finalArr = new int[arr.length];
        for(int i =0; i<arr.length;i++){
            if(arr[i] != prevArr){
                finalArr[count]= arr[i];
                count++;
            }
            prevArr=arr[i];
        }
        for(int i : finalArr){
            System.out.println(i);
        }
    }
}

package com.micro.strivers.leetcode.problems.sorting;

public class BubbleSorting {
    public static void main(String[] args){
        //------------Problem Statement: -----------------
        // Given an array of N integers, write a program to implement the Bubble Sorting algorithm.
        int[] arr = {13,46,24,52,20,9};
        int len = 6;

        for(int i=0; i<arr.length; i++){
            for(int j = i+1; j<arr.length; j++){
                if(arr[i]>arr[j]){
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        for(int i : arr){
            System.out.print(i+", ");
        }

    }
}

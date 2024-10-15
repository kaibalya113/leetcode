package com.micro.strivers.leetcode.problems.sorting;

public class SelectionSort {
    public static void main(String[] args){
        //------------Problem Statement: -----------------
        // Given an array of N integers, write a program to implement the Selection Sorting algorithm.
        int[] arr = {13,46,24,52,20,9};
        int len = 6;

        for(int i=0; i<arr.length; i++){
            int min = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[min] > arr[j]){
                    min =j;
                }
            }
            //swap
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        for(int i: arr){
            System.out.println(i+", ");
        }
    }
}

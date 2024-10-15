package com.micro.strivers.leetcode.problems.sorting;

public class InsertionSort {
    public static void main(String[] args){
        //Problem Statement:
        // Given an array of N integers, write a program to implement the Insertion sorting algorithm.
        int[] arr = {13,46,24,52,20,9};
        int len = 6;

        for(int i =0; i<arr.length; i++){
            int j = i;
            while (j > 0 && arr[j - 1] > arr[j]) {
                int temp = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
        for(int i: arr){
            System.out.println(i+", ");
        }
    }
}

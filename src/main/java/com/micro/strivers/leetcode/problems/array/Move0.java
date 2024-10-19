package com.micro.strivers.leetcode.problems.array;

public class Move0 {
    public static void main(String[] args){
        // Problem Statement:
        // You are given an array of integers,
        // your task is to move all the zeros in the array to the end of the array
        // and move non-negative integers to the front by maintaining their order.
        int arr[] = {1 ,0 ,2 ,3 ,0 ,4 ,0 ,1};

        for(int i =0; i<arr.length;i++){
            for(int j=i+1; j<arr.length-1; j++){
                if(arr[j] == 0){
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
    }
}

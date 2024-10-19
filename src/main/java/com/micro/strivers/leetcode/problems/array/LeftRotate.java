package com.micro.strivers.leetcode.problems.array;

public class LeftRotate {
    public static void main(String[] args){
        //Problem Statement: Given an array of N integers, left rotate the array by one place.
        int arr[] = {1,2,3,4,5};
        // output =  2,3,4,5,1

        if(arr.length == 1){
            return;
        }
        int tmp = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i] == arr.length){
                arr[i] = tmp;
                break;
            }
            arr[i] = arr[i+1];
        }
    }
}

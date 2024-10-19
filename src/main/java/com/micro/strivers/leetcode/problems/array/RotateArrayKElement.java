package com.micro.strivers.leetcode.problems.array;

public class RotateArrayKElement {
    public static void main(String[] args){
        // Problem Statement:
        // Given an array of integers, rotating array of elements by k
        // elements either left or right.
        int arr[] = {1,2,3,4,5,6,7};

        int n = 3;
        //String operation = "left";
        int[] tmp = new int[n];
        for(int i=0;i<tmp.length;i++){
            tmp[i]= arr[i];
        }
        for(int i=0;i<arr.length-n;i++){
            arr[i] = arr[i+n];
        }
        int count =0;
        for(int i=arr.length-n; i<arr.length;i++){
            arr[i] = tmp[count];
            count++;
           // System.out.println(arr[i]);
        }




    }
}

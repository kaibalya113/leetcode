package com.micro.strivers.leetcode.problems.array;

public class SortedArray {
    public static void main(String[] args){
        int array[] = {5,4,6,7,8};
        System.out.println(isSorted(array));
    }
    static boolean isSorted(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1])
                return false;
        }

        return true;
    }

}

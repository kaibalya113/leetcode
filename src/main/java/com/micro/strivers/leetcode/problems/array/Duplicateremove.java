package com.micro.strivers.leetcode.problems.array;

public class Duplicateremove {
    public static void main(String[] args){
        int[] nums = {1,1,2,2,3,4,5,5,5};

        System.out.println(checkdepli(nums));

    }

    private static int checkdepli(int[] nums) {
        if(nums.length <= 1){
            return nums.length;
        }
        int j =0;
        for(int i = 1; i< nums.length; i++){
            if(nums[i] == nums[j]){

            }
        }
        return j;
    }
}

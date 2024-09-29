package com.micro;

public class MissingNumber {
    public static void main(String[] args){
        int[] nums = new int[]{0,2};
        System.out.println(missingNo(nums));
    }

    private static int missingNo(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        int totalSum = 0;
        for(int i=0; i<nums.length; i++){
            totalSum = totalSum+nums[i];
        }
        int actualSum = (nums.length*(nums.length+1))/2;
        return actualSum - totalSum;
    }
}

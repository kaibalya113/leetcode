package com.micro.strivers.leetcode.problems.array;

public class RemoveDuplicate2 {
    public static void main(String[] args){
        int[] nums = {1,1,1,2,2,3};

        System.out.println(checkDuplicate(nums));
    }

    private static int checkDuplicate(int[] nums) {
        if(nums.length <=2){
            return nums.length;
        }
        int j = 2;
        for(int i =2; i<nums.length; i++){
            if(nums[i] != nums[i - 2]){
                nums[j] = nums[i]
                j++  ;
            }
        }
        return j;
    }
}

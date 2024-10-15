package com.micro;

public class FindDuplicate {
    public static void main(String[] args){
        int[] nums = new int[]{1,3,4,2,2};
        System.out.println(findDu(nums));
    }

    private static int findDu(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        int slow = 0;
        int fast = 0;
        do{
            slow = nums[slow];
            fast = nums[nums[fast]];
        }while(slow != fast);
        slow =0;
        while(slow != fast){
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }
}

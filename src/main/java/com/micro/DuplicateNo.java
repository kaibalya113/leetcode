package com.micro;

public class DuplicateNo {
    public static void main(String[] args){
        int[] nums = new int[]{1,3,4,2,2}; //
        System.out.println(duplicate(nums));
    }

    private static int duplicate(int[] nums) {
        int slow =0;
        int fast =0;
        do{
            slow = nums[slow];
            fast = nums[nums[fast]];
        }while (slow != fast);

        // as soon as they meet, move both
        // pointers at same speed until they meet again
        slow = 0;
        while(slow != fast){
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }
}

package com.micro;

import java.util.ArrayList;
import java.util.List;

public class DisapearedNo {
    public static void main(String[] args){
        int[] nums = new int[]{4,3,2,2};
        System.out.println(disNo(nums));
    }

    private static List<Integer> disNo(int[] nums) {
        List<Integer> lst = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            int value = nums[i];
            int pos = Math.abs(nums[i])-1;
            if(nums[pos] > 0){
                nums[pos] = -nums[pos];
            }
        }
        for(int i=0; i<nums.length; i++){
            if(nums[i] > 0){
                lst.add(i+1);
            }
        }
        return lst;
    }
}

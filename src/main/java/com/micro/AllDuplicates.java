package com.micro;

import java.util.ArrayList;
import java.util.List;

public class AllDuplicates {
    public static void main(String[] args){
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(duplicates(nums));
    }

    private static List<Integer> duplicates(int[] nums) {
        if(nums.length ==0){
            return new ArrayList<>();
        }
        List<Integer> lst = new ArrayList<>();
        for(int i =0; i<nums.length; i++){
            int pos = Math.abs(nums[i])-1;
            if(nums[pos] >0){
                nums[pos] = -nums[pos];
            }else{
                lst.add(pos +1);
            }
        }
        return lst;
    }
}

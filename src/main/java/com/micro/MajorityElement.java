package com.micro;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MajorityElement { // O(n)
    public static void main(String[] args){
        int[] nums = new int[]{3,2,3}; // 2,3,3
        //System.out.println(MajorityElementOutput(nums));
        System.out.println(MajorityElementout(nums));
    }

    private static int MajorityElementout(int[] nums) {
        if(nums.length <= 1){
            return 0;
        }
        int major = nums[0];
        int count = 1;
        for (int i =0; i< nums.length; i++){
            if(major == nums[i]){
                count++;
            }else{
                count--;
            }
            if(count == 0){
                major = nums[i];
                count++;
            }
        }
        return major;
    }

    public static int MajorityElementOutput(int[] nums){
        if(nums.length == 0){
            return 0;
        }
//        nums = Arrays.stream(nums).sorted().toArray();
        Map<Integer, Integer> map = new HashMap<>();
        for(int i =0 ; i< nums.length; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i])+1);
            }else{
                map.put(nums[i], 1);
            }
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if (entry.getValue() > nums.length/2){
                return entry.getKey();
            }
        }
        return 0;
    }
}

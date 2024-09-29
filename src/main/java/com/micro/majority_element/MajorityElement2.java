package com.micro.majority_element;

import java.util.*;

public class MajorityElement2 {
    public void calculate(){
        int[] nums = new int[]{3,2,3};
        //Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.
        List<Integer> lst = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            if(nums.length <=2){
                lst.add(nums[i]);
            }else{
                if(map.containsKey(nums[i])){
                    map.put(nums[i], map.get(nums[i])+1 );
                    int count = map.get(nums[i]);
                    if(count > (nums.length/3)){
                        System.out.println(nums[i]);
                    }
                }else{
                    map.put(nums[i], 1);
                }
            }
        }
    }
}

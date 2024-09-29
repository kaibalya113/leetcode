package com.micro.majority_element;

import java.util.ArrayList;
import java.util.List;

public class MajorityElement3 {
    public void calculate(){
        // This is same as previous MajorityElement2.
        // in this approach we will do using O(n2) / 2 forloop

        int[] nums = new int[]{2,2,1,1,1,2,2};

        List<Integer> value = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            int count =0;
            for(int j=0; j<nums.length; j++){
                if(nums[i] == nums[j]){
                    count++;
                    if(count > (nums.length/3) && !value.contains(nums[i])){
                        value.add(nums[i]);
                    }
                }
            }
        }
        value.forEach(lst -> System.out.println(lst));
    }
}

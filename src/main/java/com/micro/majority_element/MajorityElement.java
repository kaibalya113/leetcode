package com.micro.majority_element;

public class MajorityElement {
    public void calculate(){
        int[] nums = new int[]{2,2,1,1,1,2,2};

        // this is voting algorithm
        // we will take first no is highest
        int pos=0;
        int count =0;
        for(int i=0; i<nums.length; i++){
            if(nums[pos] == nums[i])
                count++;
            else
                count--;
            if(count==0){
                count=1;
                pos=i;
            }
        }

        count =0;
        for(int i=0; i<nums.length; i++){
            if(nums[pos]==nums[i]){
                count++;
            }
        }
        if(count<= (nums.length/2)){
            System.out.println("-1");
        }else{
            System.out.println(nums[pos]);
        }
        //System.out.println(high);
    }
}

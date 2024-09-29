//package com.micro.majority_element;
//
//public class MajorityElementVoting {
//    public void calculate(){
//        int[] nums = new int[]{2,2,1,1,1,2,2};
//
//        int count =0;
//        int count2=0;
//        int val1 = Integer.MIN_VALUE;
//        int val2 = Integer.MAX_VALUE;
//        for(int i=0; i<nums.length; i++){
//            if(val1 == nums[i]){
//                count++;
//            }else if(val2 == nums[i]){
//                count2++;
//            }else if(count == 0){
//                count++;
//                val1 = nums[i];
//            } else if (count2 == 0) {
//                count2++;
//                val2 = nums[i];
//            }else{
//                count--;
//                count2--;
//            }
//        }
//    }
//}

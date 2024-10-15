package com.micro;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetMismatch {
    public static void main(String[] args){
        int[] nums = {1,1};
        System.out.println(mismatchNo(nums));
        int[] ints = mismatchNo(nums);
        Arrays.stream(ints).forEach(s -> System.out.println(s));
    }

    private static int[] mismatchNo(int[] nums) {

        if(nums.length == 0){
            return new int[]{};
        }
        boolean[] check = new boolean[nums.length+1];
        int[] res = new int[2];
        for(int no : nums){
            if(check[no] == true){
                res[0] = no;
            }else {
                check[no] = true;
            }
        }
        for(int i =1; i<=nums.length; i++){
            if(!check[i]){
                res[1] = i;
                break;
            }
        }
        return res;
    }
}

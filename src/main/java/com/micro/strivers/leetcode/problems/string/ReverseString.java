package com.micro.strivers.leetcode.problems.string;

public class ReverseString {
    public static void main(String[] args){
        char[] s = {'h','e','l','l','o'};
        int length = s.length;
        for(int i =0; i<s.length/2; i++){
                char tmp = s[i];
                s[i] = s[length-i-1];
                s[length-i-1] = tmp;
        }
        System.out.println(s);
    }
}

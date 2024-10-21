package com.micro.strivers.leetcode.problems.string;

import java.util.Stack;

public class MaximumNesting {
    public static void main(String[] args){
        // Maximum Nesting Depth of the Parentheses
        String  s = "(1+(2*3)+((8)/4))+1";
        int res = 0;
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()){
            if(c == '('){
                stack.push('(');
            }else if(c == ')'){
                int size = stack.size();
                res = Math.max(res, size);
                stack.pop();
            }else {
                continue;
            }
        }
        System.out.println(res);
    }
}

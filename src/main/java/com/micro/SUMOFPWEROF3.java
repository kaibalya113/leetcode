package com.micro;

import java.util.Stack;

public class SUMOFPWEROF3 {
    public static void main(String[] args){
        int n = 12;
        while (n > 0) {
            if (n % 3 > 1) {
               System.out.println(false);
            }
            n /= 3;
        }
        System.out.println(true);
    }
}

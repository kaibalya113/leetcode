package com.micro;

public class demo {
    public static void main(String[] args){
        int n = 18;
        System.out.println(n < 1 ? false : (n & (n - 1)) == 0 ? true : false);
    }
}

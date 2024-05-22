package com.micro;

public class PowerOf2 {
    public static void main(String[] args){
        int n = 45;
        if (n == 0) {
            System.out.println("is False");
        }

        while (n != 1) {
            if (n % 3 != 0) {
                System.out.println("is False");
                System.out.println("END");
            }
            n = n / 3;
        }
        System.out.println("is True");
    }
}

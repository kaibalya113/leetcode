package com.micro;

public class sumofpowerof3 {
    public static void main(String[] args){

        int n = 12;
        System.out.println(sumofpower3(n));
    }

    private static boolean sumofpower3(int n) {
        if(n <=0){
            return false;
        }
        while(n > 0){
            if(n % 3 >1){
                return false;
            }
            n /=3;
        }
        return true;
    }
}

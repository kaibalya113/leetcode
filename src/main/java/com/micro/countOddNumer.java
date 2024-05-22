package com.micro;

public class countOddNumer {
    public static void main(String[] args){
        int high =10;
        int low =0;
        if(high%2==0 && low%2==0){

            System.out.println((high-low)/2);
        }else{
            System.out.println((high-low)/2+1);
        }

    }
}

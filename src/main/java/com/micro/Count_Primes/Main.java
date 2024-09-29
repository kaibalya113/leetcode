package com.micro.Count_Primes;

public class Main {
    public static void main(String[] args){
        //Given an integer n, return the number of prime numbers that are strictly less than n.


        int value = 10;
        // prime nos means, those are divisible by them or 1

        if(value <= 2){
            System.out.println("0");
        }
        boolean[] booleans = new boolean[value];
        int limit = (int)(Math.sqrt(value));
        for (int i=2; i<=limit; i++){

            if(booleans[i] == false){
                for(int j =i*i; j<value; j+=i){
                    booleans[j] = true;
                }
            }
        }
        int count =0 ;
        for (int i=2; i<value;i++){
            if(booleans[i] == false) {
                count++;
            }
        }
        System.out.println(count);

    }
}

package com.micro.majority_element;

public class MajorityElementMain {
    public static void main(String[] args){
        //The majority element is the element that appears more than ⌊n / 2⌋ times.
        // You may assume that the majority element always exists in the array.
        //// this is voting algorithm
        //MajorityElement majorityElement = new MajorityElement();
        //majorityElement.calculate();

        //Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.
        // hashmap approach O(n)
        MajorityElement2 majorityElementUsingHashMap = new MajorityElement2();
        majorityElementUsingHashMap.calculate();

        //using 2 for loop O(n^2)
        //MajorityElement3 majorityElement3 = new MajorityElement3();
        //majorityElement3.calculate();

//        // Now we will use using voting algorithm
//        MajorityElementVoting

    }
}

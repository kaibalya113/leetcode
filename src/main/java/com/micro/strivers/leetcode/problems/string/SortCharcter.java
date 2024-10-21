package com.micro.strivers.leetcode.problems.string;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class SortCharcter {
    public static void main(String[] args){
        //451. Sort Characters By Frequency
        String s = "tree";
        // output : "eert"
        HashMap<Character, Integer> map = new HashMap<>();
        char[] ch = s.toCharArray();
        for(char c : ch){
            if(map.containsKey(c)){
                map.put(c, map.get(c)+1);
            }else{
                map.put(c, 1);
            }

        }
        StringBuilder sf = new StringBuilder();
        PriorityQueue<Map.Entry<Character, Integer>> pq = new PriorityQueue<>(
                (a, b) -> b.getValue() - a.getValue()
        );
        pq.addAll(map.entrySet());
        while (!pq.isEmpty()) {
            Map.Entry<Character, Integer> entry = pq.poll();
            sf.append(String.valueOf(entry.getKey()).repeat(entry.getValue()));
        }
        String str = sf.toString();
        System.out.println(sf);
    }
}

package com.micro.string;

public class MakeSorted {
    public static void main(String[] args){
        String[] strs = {"zyx","wvu","tsr"};
        //  944. Delete Columns to Make Sorted
        System.out.println(makesort(strs));
    }

    private static int makesort(String[] strs) {
        int col =0;
        int del =0;
        for(int i=0; i<strs[0].length(); i++){
            int prev = strs[0].charAt(i);
            for(int j=1; j<strs.length; j++){
                int curr = strs[j].charAt(col);
                if(prev> curr){
                    del++;
                    break;
                }
                prev = curr;
            }
            col++;

        }
        return del;
    }
}

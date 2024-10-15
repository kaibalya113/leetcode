package com.micro.string;

public class ReverseString {
    public static void main(String[] args){
        char[] chars = {'h','e','l','l','o'};
        reversechar(chars);
    }

    private static void reversechar(char[] chars) {
        int len = chars.length;
        for(int i=0; i<chars.length/2;i++){
            char temp = chars[i];
            chars[i] = chars[chars.length-i-1];
            chars[chars.length-i-1] = temp;
        }
        System.out.println(chars);
    }
}

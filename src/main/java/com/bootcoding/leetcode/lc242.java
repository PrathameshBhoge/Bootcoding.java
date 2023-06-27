package main.java.com.bootcoding.leetcode;

import java.util.Arrays;

public class lc242 {
    public static void main(String[] args) {
        String s="anagram";
        String t="nagaram";

        char [] arr=s.toCharArray();
        Arrays.sort(arr);
        char arrr[]=t.toCharArray();
        Arrays.sort(arrr);
       boolean retval =Arrays.equals(arr,arrr);
        System.out.println(retval);
    }
}

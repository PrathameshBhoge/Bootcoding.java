package main.java.com.bootcoding.leetcode;

public class leetcode58 {
    public static void main(String[] args) {
        String s ="The store makes happy all , over to you ";
         String [] words = s.split(" ");
        String lastword=words[words.length-1];
        int  lastwordLen =lastword.length();
        System.out.println(lastwordLen);

    }
}

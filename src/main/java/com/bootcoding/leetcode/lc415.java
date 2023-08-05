package main.java.com.bootcoding.leetcode;

public class lc415 {
    public static void main(String[] args) {
        String num1="11";
        String num2="123";

        int total = 0;
        for (int i = 0;i<num2.length();i++) {
            total += Character.getNumericValue(num1.charAt(i))+Character.getNumericValue(num2.charAt(i));
        }
        System.out.println(total);
    }

}

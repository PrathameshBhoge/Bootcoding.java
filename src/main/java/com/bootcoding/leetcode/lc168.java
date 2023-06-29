package main.java.com.bootcoding.leetcode;

public class lc168 {
    public static void main(String[] args) {
        int coloumnnumber=90;
        StringBuilder string=new StringBuilder();
        while(coloumnnumber>0){
            coloumnnumber--;
            char ch =(char)((coloumnnumber%26)+'A');
            string.append(ch);
            coloumnnumber=coloumnnumber/26;

        }
        string.reverse();
        System.out.println(string.toString());



         }
}

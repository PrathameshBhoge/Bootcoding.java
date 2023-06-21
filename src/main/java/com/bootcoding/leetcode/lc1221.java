package main.java.com.bootcoding.leetcode;

public class lc1221 {
    public static void main(String[] args) {
        String s="RLRRLLRLRL";

        int lcounter=0; int rcounter=0; int counter=0;
        char []str=s.toCharArray();
        for(int i=0;i<str.length;i++){
            if(str[i]=='R'){
                rcounter++;
            }else{
                lcounter++;
            }
            if(rcounter==lcounter){
                counter++;
            }
        }
        System.out.print(counter+" ");
    }
}

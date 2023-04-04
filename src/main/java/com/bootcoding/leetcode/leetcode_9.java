package main.java.com.bootcoding.leetcode;

public class leetcode_9 {
    public static void main(String[] args) {
        int x=121;
        int r;
        int sum =0;
        int temp=x;
        while(x>0){
            r=x%10;
            sum=(sum*10)+r;
            x=x/10;
        }
        if(temp==sum){
            System.out.println(true);//return true;
        }else{
            System.out.println(false);//return false;
        }
    }
}

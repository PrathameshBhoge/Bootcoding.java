package main.java.com.bootcoding.leetcode;

public class leetcode1342 {
    public static void main(String[] args) {
        int count=0;
        int num=Integer.parseInt(args[0]);
        while(num>0){
            if(num%2==0){

                num=num/2;
                count++;

            }else{

                num=num-1;
                count++;
                //System.out.println(count+"Is odd SUbstract by 2 we get "+num);
            }
        }
        System.out.println(count);
    }
}

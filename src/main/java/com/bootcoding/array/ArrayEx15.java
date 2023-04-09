// Number of Steps to Reduce a Number to Zero!
//Given an integer num, return the number of steps to reduce it to zero.
//In one step, if the current number is even, you have to divide it by 2, otherwise, you have to subtract 1 from it
//Explanation:
//Input: num = 14
//Output: 6
package main.java.com.bootcoding.array;

public class ArrayEx15 {
    public static void main(String[] args) {
        int num=14;
        int count=0;

        while(num>0){
            if(num%2==0){
                num=num/2;
                count++;

            }else{
                num=num-1;
                count++;
            }

        } System.out.println(count);
    }
}

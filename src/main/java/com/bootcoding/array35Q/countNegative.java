//Java Program to count total number of negative elements in an array.
package main.java.com.bootcoding.array35Q;

public class countNegative {
    public static void main(String[] args) {
        int[] arr={-1,8,9,-5,7,0};
        int countNegative=0;
        for(int i=0;i<arr.length;i++){
        if(arr[i]<0){
            countNegative++;
        }

        }
        System.out.println(countNegative);
    }
}

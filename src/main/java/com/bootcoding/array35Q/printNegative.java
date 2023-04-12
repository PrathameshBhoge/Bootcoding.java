//Java Program to print all negative elements in an array.
package main.java.com.bootcoding.array35Q;

public class printNegative {
    public static void main(String[] args) {
        int []arr={-1,9,8,6,4,-8,-3,0};
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                System.out.println(arr[i]);
            }
        }
    }
}

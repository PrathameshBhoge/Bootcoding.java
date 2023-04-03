//This ia a program to find the Minimum Element In an array.
package main.java.com.bootcoding.array;

public class MinimumElement {
    public static void main(String [] args){
        int [] arr={10,5,20,60,40};
        int min=arr[0];
        for(int i=1; i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("The minimum element in an array is "+min);
    }
}

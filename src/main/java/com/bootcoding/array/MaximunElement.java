//This ia a program to find the Maximum Element In an array.
package main.java.com.bootcoding.array;

public class MaximunElement {
    public static void main(String [] args){
        int [] arr={10,30,20,60,40};
        int max = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max =arr[i];
            }
        }
        System.out.println("The maximun Element in the array is "+ max);

    }
}

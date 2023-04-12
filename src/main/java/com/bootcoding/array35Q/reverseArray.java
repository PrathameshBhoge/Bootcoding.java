//Java Program to find reverse of an array.
package main.java.com.bootcoding.array35Q;

public class reverseArray {
    public static void main(String[] args) {
        int[]arr={5,4,3,2,1,0};
        int temp;
        for(int i=0;i<arr.length/2;i++){
           temp=arr[i];
           arr[i]=arr[arr.length-i-1];
           arr[arr.length-i-1]=temp;


        }
        for(int j=0;j<arr.length;j++){
            System.out.println(arr[j]+" ");

        }
    }
}

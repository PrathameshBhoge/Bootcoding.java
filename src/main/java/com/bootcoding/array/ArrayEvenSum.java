//This is a program for the sum of all Even Element in an array.
package main.java.com.bootcoding.array;

public class ArrayEvenSum {
    public static void main(String[] args) {
        int[] arr ={7, 22, 19, 44, 45, 65, 66};
        int sum=0;
        for (int i =0;i<arr.length;i++){
            if (i%2==0){
                sum+=arr[i];
            }
        }
        System.out.println("The sum of Even element in an array is "+sum);
    }
}

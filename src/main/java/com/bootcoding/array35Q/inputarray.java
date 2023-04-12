//Java Program to take input and print elements of array.
package main.java.com.bootcoding.array35Q;

import java.sql.SQLOutput;
import java.util.Scanner;

public class inputarray {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n =s.nextInt();
        int arr[]=new int [n];
        for(int i =0;i<n;i++){
            arr[i]=s.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");

        }
    }
}

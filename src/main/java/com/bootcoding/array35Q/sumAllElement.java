package main.java.com.bootcoding.array35Q;

import java.util.Scanner;

public class sumAllElement {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n =s.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<arr.length;i++){
          arr[i]= s.nextInt();

        }
        for(int k=0;k<arr.length;k++){
            System.out.print(arr[k]+" ");
        }
        System.out.println();
        int sum=0;
        for(int j=0;j<arr.length;j++){
            sum+=arr[j];

        }
        System.out.println(sum);
    }

}

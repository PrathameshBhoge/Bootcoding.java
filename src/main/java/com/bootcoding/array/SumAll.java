//This is a Program to find the sum Of all element in an array.
package main.java.com.bootcoding.array;

public class SumAll {
    public static void main(String [] args){
        int [] sum={7,22,19,44,45,65,66};
        int sumall=0;
        for(int i =0;i<sum.length;i++){
            sumall+=sum[i];
        }
        System.out.println("The sum of all element in array is : "+sumall);
    }
}

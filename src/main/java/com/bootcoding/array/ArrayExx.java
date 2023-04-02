//WAP to copy the elements of one array into another array and print the array
package main.java.com.bootcoding.array;

public class ArrayExx {
    public static void main(String [] args){
        int [] arr={10,20,30,40,50};
        int [] arr2= new int[arr.length];
        for(int i =0;i<arr.length;i++){
            arr2[i]=arr[i];
            System.out.print(arr2[i]+" ");
        }
    }
}

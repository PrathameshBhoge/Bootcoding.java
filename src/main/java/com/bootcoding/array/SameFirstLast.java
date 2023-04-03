//WAP to print element of an array if first index and last index values are same [7, 22, 19, 44, 45, 65, 7].
package main.java.com.bootcoding.array;

public class SameFirstLast {
    public  static void main(String [] args){
        int [] arr={7,22,19,44,45,65,7};

        if(arr[0]==arr[arr.length-1]){
            System.out.println(arr[0]+ "is the First And Last Element of an Array");
        }
        else{
            System.out.println("The first and last Element of array is not same");
        }
    }
}

//WAP to print element of an array if second index and second last index values are same [7, 22, 19, 44, 45, 22, 17]
package main.java.com.bootcoding.array;

public class SameSecondSecondLast {
    public static void main(String [] args){
        int [] arr={7,22,19,44,45,22,17};
        if(arr[1]==arr[arr.length-2]){
            System.out.println(arr[1]+ "is the second index And second Last index Element of an Array");
        }
        else{
            System.out.println("The second and Second  last Index Element of array is not same");
        }
    }
}

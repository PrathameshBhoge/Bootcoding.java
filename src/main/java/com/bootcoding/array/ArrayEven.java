//This is a program for Print an Even element in an Array.

package main.java.com.bootcoding.array;

public class ArrayEven {
    public static void main(String [] args){
        int [] even = {7, 22, 19, 44, 45, 65, 66};
        for(int i =0 ; i<even.length;i++){
            if(even[i]%2==0){
                System.out.println("Even element is : "+ even[i]);
            }
        }
    }
}

//To find the odd Element in an Array.
package main.java.com.bootcoding.array;

public class ArrayOdd {
    public static void main(String [] args){
        int [] odd = {7, 22, 19, 44, 45, 65, 66};
        for(int i =0 ; i<=odd.length;i++){
            if(odd[i]%2!=0){
                System.out.println("odd element is : "+ odd[i]);
            }
        }
    }
}

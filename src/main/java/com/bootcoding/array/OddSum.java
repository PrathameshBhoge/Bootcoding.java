//To find the sum of odd element in an array.
package main.java.com.bootcoding.array;

public class OddSum {
    public static void main(String [] args){
        int [] odd = {7, 22, 19, 44, 45, 65, 66};
        int sum =0;
        for(int i =0 ; i<odd.length;i++){
            if(odd[i]%2!=0){
                System.out.println("odd element is : "+ odd[i]);
                sum+=odd[i];
            }
        }System.out.println("The sum of all Odd number is : "+ sum);
    }
}

//WAP to print element of an array which are divisible by 3 & 5.
package main.java.com.bootcoding.array;

public class ArrayEx {
    public static void main(String [] args){
        int [] arr={10,20,30,50,40};
        for(int i=0;i<arr.length;i++){
            if(arr[i]%3==0 && arr[i]%5==0){
                System.out.println("The "+ arr[i]+ " is divisible by 3 & 5 both");
            }
        }
    }
}

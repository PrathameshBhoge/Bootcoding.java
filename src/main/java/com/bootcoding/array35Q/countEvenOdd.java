//Java Program to count total number of even and odd elements in an array.
package main.java.com.bootcoding.array35Q;

public class countEvenOdd {
    public static void main(String[] args) {
        int [] arr={2,3,4,5,6,7,8,9,0};
        int countEven=0;
        int countOdd=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0&&arr[i]>0){
                countEven++;
            }else if(arr[i]%2!=0&&arr[i]>0){
                countOdd++;
            }

        }
        System.out.print("The count of Even element is : "+countEven);
        System.out.println();
        System.out.print("The count of Odd Elemnt is : "+countOdd);
    }
}

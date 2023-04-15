//Java Program to print minimum and maximum element in an array.
package main.java.com.bootcoding.array35Q;

public class maxMinElemntArray {
    public static void main(String[] args) {
        int [] arr={10,30,20,40,60,50};
        System.out.println(maxelement(arr));
        System.out.println(Minelement(arr));
    }

    public static int maxelement(int []arr){
        int count=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>count){
                count=arr[i];
            }
        }
        return count;
    }

    public static int Minelement(int []arr) {
        int count = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<count){
                count=arr[i];
            }

        }
        return count;
    }
}

package main.java.com.bootcoding.array;

public class CopyEvenElement {
    public static void main(String [] args){
        int [] arr={10,20,33,49,50};
        int [] arr2= new int[arr.length];
        for(int i =0;i<arr.length;i++){
           if(arr[i]%2==0){
               arr2[i]=arr[i];
               System.out.print(arr2[i]+" ");
           }
        }
    }
}

package main.java.com.bootcoding.leetcode;

public class leetcode1 {
    public static void main(String[] args) {
        int [] arr={2,11,15,7};
        int target=9;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j< arr.length;j++){
                if(arr[i]+arr[j]==target){
                    System.out.println(arr[i]+" "+arr[j]);

                }
            }
        }
    }
}

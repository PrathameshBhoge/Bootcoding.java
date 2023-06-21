package main.java.com.bootcoding.leetcode;

public class lc1089 {
    public static void main(String[] args) {
        int [] arr={1,0,2,3,0,4,5,0};
        int[] nums = new int[arr.length];
        int i =0;
        int j =0;
        while(j<nums.length && i<arr.length) {
            if(arr[i] == 0) {
                nums[j] =0;
                if(j+1<arr.length) {
                    nums[j+1] =0;
                }
                j +=2;
                i++;
            }
            else {
                nums[j] = arr[i];
                i++;
                j++;
            }
        }
        for(int k =0;k<arr.length;k++) {
            arr[k] = nums[k];
        }

        for(int l=0;l<arr.length;l++){
            System.out.print(arr+" ");

        }
    }
}

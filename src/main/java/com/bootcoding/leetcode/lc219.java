package main.java.com.bootcoding.leetcode;

public class lc219 {
    public static void main(String[] args) {
        int nums[]={1,2,3,1};
        int k=3;
        for(int i=0;i<nums.length-1;i++){
            for(int j= i+1;j<nums.length && j<=k+i;j++){
                if(nums[i]==nums[j]){

                    System.out.println(true);
                    //return true;

                }
            }
            //return false;

        }

        }
    }


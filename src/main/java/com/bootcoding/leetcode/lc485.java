package main.java.com.bootcoding.leetcode;

public class lc485 {
    public static void main(String[] args) {
        int [] nums={1,0,1,1,0,1};
        int count=0;
        int result=0;
        for(int i=0;i<nums.length-1;i++){

                if(nums[i]==1){
                    count++;
                    result=Math.max(result,count);
                }else if(nums[i]==0){
                    count=0;
                }
            }
        System.out.println(result);
        }

    }


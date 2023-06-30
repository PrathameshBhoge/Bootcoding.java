package main.java.com.bootcoding.leetcode;

import java.util.ArrayList;
import java.util.HashSet;

public class Lc349 {
    public static void main(String[] args) {
        int [] nums1={1,2,2,1};
        int [] nums2={2,2};
        HashSet<Integer> arr1=new HashSet<>();
        HashSet<Integer> ans=new HashSet<>();
         for(int num1:nums1){
             arr1.add(num1);
         }
         for(int num2:nums2){
             if(arr1.contains(num2)) {
                 ans.add(num2);
             }
         }
         int arr3[]=new int[ans.size()];
         int Index=0;
         for(int num:ans){
             arr3[Index]=num;
             Index++;
         }

         for(int num:arr3){
             System.out.print(arr3+" ");
         }
    }
}

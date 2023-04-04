package main.java.com.bootcoding.leetcode;

public class leetcode2529 {
    public static void main(String[] args) {
        int [] nums={-1,-4,-6,-9,8,7,6};
        int posicount=0;
        int negcount=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                negcount++;
            }else if(nums[i]>0){
                posicount++;
            }else{

            }
        }
        if(negcount>posicount){
            System.out.println(negcount);
        }else{
            System.out.println(posicount);
        }
    }
}

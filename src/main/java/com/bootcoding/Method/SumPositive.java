/*Calculate the sum of only positive numbers within an array using method with return sum
        For Example 1:
        Input: [1,5,-3,2,11]
        Output:19
        For Example 2:
        Input:[10,-20,-2,-2]
        Output: 10*/

package main.java.com.bootcoding.Method;

public class SumPositive {
    public static void main(String [] args){
        int [] arr={1,5,-3,2,11};
        int res=0;
        res=SumOfPositive(arr);
        System.out.println("The sum of Positive integers in an array is "+ res);

    }

    public static int SumOfPositive(int arr[]){
        int sum =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=0){
                sum +=arr[i];
            }
        }
        return sum;
    }
}

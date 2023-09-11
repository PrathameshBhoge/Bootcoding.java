package main.java.com.bootcoding.leetcode;

import java.util.ArrayList;
import java.util.List;

public class lc54 {
    public static void main(String[] args) {
       int  matrix[][]= {
                            {1,2,3,4},
                            {5,6,7,8},
                            {9,10,11,12}
                        };
        System.out.println(spiralOrder(matrix));


    }

    public static  List<Integer> spiralOrder(int[][] matrix) {
        int rstart=0; int rend = matrix.length-1;
        int cstart = 0; int cend = matrix[0].length-1;
        List<Integer> list = new ArrayList<>();

        while(rstart <= rend && cstart <= cend){

            for(int i = cstart ; i<=cend ;i++){
               list.add(matrix[rstart][i]);
            }
            rstart++;

            for(int i = rstart ; i<= rend ;i++){
                list.add(matrix[i][cend]);
            }
            cend--;

            for (int i = cend;i>=cstart && rstart<=rend;i--){
                list.add(matrix[rend][i]);
            }
            rend--;
            for(int i= rend;i>=rstart && cstart<=cend;i--){
                list.add(matrix[i][cstart]);
            }
            cstart++;
        }

        return list;
    }
}

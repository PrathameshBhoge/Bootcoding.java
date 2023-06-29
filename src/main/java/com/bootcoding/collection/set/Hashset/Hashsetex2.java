package main.java.com.bootcoding.collection.set.Hashset;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Hashsetex2 {
    public static void main(String[] args) {
        Integer [] a={2,4,5,7,9,9,8,7};
        Integer [] b={4,6,7,4,5,8,2};
        Set<Integer> set1=new HashSet<>();
        set1.addAll(Arrays.asList(a));

        Set<Integer> set2=new HashSet<>();
        set2.addAll(Arrays.asList(b));

        Set<Integer> set3=new HashSet<>();
        set3.addAll(set1);
        set3.addAll(set2);

        for(Integer str:set3){
            System.out.print(str+" ");
        }
    }
}

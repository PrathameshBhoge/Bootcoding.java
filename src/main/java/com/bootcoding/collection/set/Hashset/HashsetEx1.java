package main.java.com.bootcoding.collection.set.Hashset;

import java.util.HashSet;
import java.util.Set;

public class HashsetEx1 {
    public static void main(String[] args) {
        Set<String> set=new HashSet<>();
        set.add("raja");
        set.add("banti");
        set.add("rahul");
        set.add("banti");

        for(String str:set){
            System.out.println(str);
        }
    }
}

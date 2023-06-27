package main.java.com.bootcoding.collection.ArrayList.Doctor;

import java.util.ArrayList;
import java.util.Scanner;

public class DoctorApp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList <DoctorInfo> list=new ArrayList<>();
        for(int j=0;j<2;j++){
            list.add(new DoctorInfo(sc.next(),sc.nextInt(),sc.next(),sc.next()));

        }
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}

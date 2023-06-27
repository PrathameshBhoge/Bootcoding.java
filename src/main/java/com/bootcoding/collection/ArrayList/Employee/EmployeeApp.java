package main.java.com.bootcoding.collection.ArrayList.Employee;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeApp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<EmployeeInfo> emp=new ArrayList<>();
        for(int i=0;i<2;i++){
            emp.add(new EmployeeInfo(sc.next(), sc.nextFloat(), sc.nextFloat(),sc.nextInt()));
        }
        for(int i=0;i<emp.size();i++){
            System.out.println(emp.get(i));
        }
    }
}

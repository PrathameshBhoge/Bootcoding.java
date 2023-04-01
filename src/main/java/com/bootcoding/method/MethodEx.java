//Create a function that takes two arguments. Both arguments are integers, a and b. Return true if one of them is 10 or if their sum is 10

package main.java.com.bootcoding.method;

public class MethodEx {
    public static void main (String [] args){
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        boolean res =false;
        res = INTEGER(a,b);
        System.out.println(res);

    }

    public static boolean INTEGER(int a , int b){
        if (a==10|| b==10){
            return true;

        }else if(a+b==10){
            return true;
        }else{
            return false;
        }
    }

}

//Create a function that takes three arguments prob, prize, pay and returns true  if prob * prize > pay; otherwise return false.

package main.java.com.bootcoding.method;

public class ProbPrizePay {
    public static void main (String [] args){
        float prob=Float.parseFloat(args [0]);
        float prize=Float.parseFloat(args [1]);
        float pay = Float.parseFloat(args[2]);
        boolean res;
        res=probPrizePay(prob,prize,pay);
        System.out.println(res);


    }

    public static boolean probPrizePay(float prob , float prize,float pay){
        if(prob*prize>pay){
            return true;
        }else{
            return false;
        }
    }
}

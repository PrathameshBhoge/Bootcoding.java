/*Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
        Test Data:
        Input first number: 125
        Input second number: 24
        Expected Output :
        125 + 24 = 149
        125 - 24 = 101
        125 x 24 = 3000
        125 / 24 = 5
        125 mod 24 = 5*/

package main.java.com.bootcoding.cli;

public class ArgsEx1 {
    public static void main(String [] args){
    int num1=Integer.parseInt(args[0]);
    int num2=Integer.parseInt(args[1]);

    int add =num1+num2;
        System.out.println(num1 + " + "+num2 +" = "+add);

    int sub=num1- num2;
        System.out.println(num1 + " - "+ num2 + " = "+sub);

    int multiply=num1*num2;
        System.out.println(num1+ " * "+num2+" = "+multiply);

    int div=num1/num2;
        System.out.println(num1+ " / "+num2+" = "+div);

    int mod=num1%num2;
        System.out.println(num1+ " % "+num2+" = "+mod);

    }
}

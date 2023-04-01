package main.java.com.bootcoding.cli;

public class FactorialArgs {
    public static void main(String[] args) {

        int fact = 1;
        for (int i = 0; i < args.length; i++) {
            int j = Integer.parseInt(args[i]);
            for (int k = 1; k <= j; k++) {
                fact = fact * k;
            }
            System.out.println("The factorial of the given number is " + fact);
            fact = 1;
        }

    }

}

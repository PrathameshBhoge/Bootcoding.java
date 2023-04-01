package main.java.com.bootcoding.cli;
public class palindromeArgs {
    public static void main(String[] args) {
        for (int i = 0; i <= 2; i++) {

            String value = args[i];
            int n = Integer.parseInt(value);
            int temp = n;
            int rem = 0;
            while (n != 0) {
                rem = rem * 10 + n % 10;
                n = n / 10;

            }
            if (temp == rem) {
                System.out.println(rem + "Is palindrome");
            }
        }
    }
}

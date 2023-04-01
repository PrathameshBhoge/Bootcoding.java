/*Write a method that takes an integer minutes and converts it to seconds.
For Example 1:
Input: 5
Output: 300
Description: convert(5) → 300
For Example 2:
Input: 2
Output: 120
Description: convert(2) → 120*/

package main.java.com.bootcoding.method;

public class minuteToSecond {
    public static void main (String [] args){
        int minute=Integer.parseInt(args[0]);
        int res;
        res=ConvertTosecond(minute);
        System.out.println("The conversion of "+minute + " To second Is "+ res);

    }

    public static int ConvertTosecond(int minute){
        return minute*60;
    }
}

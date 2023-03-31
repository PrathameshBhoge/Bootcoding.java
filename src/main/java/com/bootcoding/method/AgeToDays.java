/*Create a function that takes the age in years and returns the age in days.
Notes
- Use 365 days as the length of a year for this challenge. - Ignore leap years and days between last birthday and now.
- Expect only positive integer inputs.*/


package main.java.com.bootcoding.method;

public class AgeToDays {
    public static void main(String [] args){
        int age= Integer.parseInt(args[0]);
        int res;
        res=ageTodays(age);
        System.out.println("The AGE is "+ age + "& the conversion into days is "+ res);

    }

    public static int ageTodays(int age){
        return age*365;
    }
}

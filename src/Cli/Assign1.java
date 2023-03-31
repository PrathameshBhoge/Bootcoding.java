package Cli;
/*****
 *   *
 *****/

public class Assign1 {
    public static void main (String [] args){
        float width = Float.parseFloat(args[0]);
        float height = Float.parseFloat(args[1]);

        float area = width * height ;
        System.out.println("Area of " + width +" * " +height + "is "+area  );

        float perimeter = 2*(width + height);
        System.out.println("The perimeter is " + perimeter);
    }
}

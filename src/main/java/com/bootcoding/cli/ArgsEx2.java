/*Write a Java program to print the area and perimeter of a rectangle.
        Test Data:
        Width = 5.5 Height = 8.5
        Expected Output
        Area is 5.6 * 8.5 = 47.60
        Perimeter is 2 * (5.6 + 8.5) = 28.20*/
package main.java.com.bootcoding.cli;

public class ArgsEx2 {
    public static void main(String[] args) {
        float width =Float.parseFloat(args[0]);
        float height =Float.parseFloat(args[1]);

        float area =width*height;
        System.out.println("Area is "+width+" * "+height+" = "+ area);

        float perimeter=2*(width+height);
        System.out.println("Perimeter is 2 * ( "+width+" + "+height+" ) "+ " = "+perimeter);
    }
}

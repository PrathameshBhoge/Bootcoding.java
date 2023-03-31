//Write a function that takes the base and height of a triangle and return its area.
//The area of a triangle is: (base * height) / 2 Don't forget to return the result.

package main.java.com.bootcoding.Method;

public class areaofTriangle {
    public static void main (String []args){
            int base = Integer.parseInt(args[0]);
            int height= Integer.parseInt(args[1]);

            int res;
            res=Area(base,height);
            System.out.println("The area of Trianhle is "+ res);
        }
        public static int Area(int base, int height){

            // System.out.println(area);
            return base*height;
        }
    }


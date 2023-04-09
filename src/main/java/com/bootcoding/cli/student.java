

package main.java.com.bootcoding.cli;

public class student {
    public static void main(String[] args) {
        int size=args.length;
        if (size<4){
            System.out.println("please provide valid input ");
        }else{
            String firstArgumrnt = args[0];
             double marks1=Double.parseDouble(args[1]);
            double marks2=Double.parseDouble(args[2]);
            double marks3=Double.parseDouble(args[3]);
            double total=300.00;
            double sum=0;
            sum = marks1+marks2+marks3;
            if(firstArgumrnt.equals("avg")){

                double avg=sum/3;
                System.out.println("Average : "+avg);
            } else if (firstArgumrnt.equals("per")) {
                double percentage=sum/total*100;
                System.out.println("Percentage : "+percentage);

            }else{
                System.out.println("provide a valid input ");
            }
        }
    }
}

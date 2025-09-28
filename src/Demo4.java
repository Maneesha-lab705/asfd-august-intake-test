import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Demo4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//
//        System.out.print("Enter Name:");
//        String name = input.next();
//
//        System.out.print("Enter age:");
//        int age = input.nextInt();
//
//        System.out.print("Enter married:");
//        boolean married = input.nextBoolean();
//
//
//        if (age >= 18){
//            int askyVal = name.charAt(0);
//            System.out.println(askyVal);
//                 if (askyVal >70 & married){
//                     System.out.println("eligible for married");
//                   }else {
//                     System.out.println("sorry");
//                 }
//        }else {
//            System.out.println("not eligible men");
//        }
//
//
        ///   ///////////////////////////////

//        incriment
 int val =23;
        val++;
        System.out.println(val);


        System.out.println("enter salory1:");
        double sal1 =input.nextDouble();

        System.out.println("enter salory2:");
        double sal2 =input.nextDouble();

        System.out.println("enter salory3:");
        double sal3 =input.nextDouble();

        System.out.println("enter salory4:");
        double sal4 =input.nextDouble();

        System.out.println("enter salory5:");
        double sal5 =input.nextDouble();

        System.out.println("avg salary"+(sal1+sal2+sal3+sal4+sal5)/5);
    }
}



